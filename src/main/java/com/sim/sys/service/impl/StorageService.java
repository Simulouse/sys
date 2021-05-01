package com.sim.sys.service.impl;

import com.sim.sys.dao.StorageDao;
import com.sim.sys.dao.TakingRecordDao;
import com.sim.sys.entity.Result;
import com.sim.sys.entity.Storage;
import com.sim.sys.entity.TakingRecord;
import com.sim.sys.service.IStorageService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("storageService")
public class StorageService implements IStorageService {

    @Resource
    private StorageDao storageDao;

    @Resource
    private TakingRecordDao takingRecordDao;

    @Override
    public List<Storage> findAllByFilter(Storage storage) {
        return storageDao.findAllStorageByFilter(storage);
    }

    @Override
    public Result insert(List<Storage> storages) {
        Result result = new Result();
        result.setResult("ok");

        if (storageDao.findStorageByOrderId(storages.get(0).getOrderId()).size() != 0) {
            result.setResult("no");
            return result;
        }

        if (storageDao.insertStorageBatch(storages) == 0) result.setResult("no");

        return result;


    }

    @Override
    @Transactional
    public Result update(String storageId, int nums) {
        Result result = new Result();
        result.setResult("ok");

//        int resultOne = takingRecordDao

        if (storageDao.updateStorageById(storageId, nums) == 0) result.setResult("no");

        return result;
    }

    @Override

    public Result delete(String storageId) {
        Result result = new Result();
        result.setResult("ok");

        if (storageDao.deleteStorageById(storageId) == 0) result.setResult("no");

        return result;
    }
}

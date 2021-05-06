package com.sim.sys.service.impl;

import com.sim.sys.dao.DeliveryDao;
import com.sim.sys.dao.DeliveryStorageDao;
import com.sim.sys.dao.StorageDao;
import com.sim.sys.entity.Delivery;
import com.sim.sys.entity.Result;
import com.sim.sys.entity.Storage;
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
    private DeliveryDao deliveryDao;

    @Resource
    private DeliveryStorageDao deliveryStorageDao;


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
    public Result delete(Delivery delivery) {
        Result result = new Result();
        result.setResult("ok");


        int resultOne = storageDao.deleteStorageById(delivery.getRecords().get(0).getStorage().getStorageId());
        int resultTow = deliveryDao.insertDelivery(delivery);
        int resultThree = deliveryStorageDao.insertDeliveryStorage(delivery.getRecords());

        if (resultOne == 0 || resultTow == 0 || resultThree == 0) result.setResult("no");


        return result;
    }
}

package com.sim.sys.service.impl;

import com.alibaba.fastjson.JSON;
import com.sim.sys.dao.*;
import com.sim.sys.entity.Delivery;
import com.sim.sys.entity.Entering;
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

    @Resource
    private EnteringDao enteringDao;

    @Resource
    private OrderDao orderDao;


    @Override
    public List<Storage> findAllByFilter(Storage storage) {
        System.out.println(JSON.toJSONString(storage));
        return storageDao.findAllStorageByFilter(storage);
    }

    @Override
    @Transactional
    public Result insert(List<Storage> storages, String enteringId, String enteringTime) {
        System.out.println(enteringTime);
        Result result = new Result();
        result.setResult("ok");

        if (storageDao.findStorageByOrderId(storages.get(0).getOrderId()).size() != 0) {
            result.setResult("no");
            return result;
        }

        int resultOne = storageDao.insertStorageBatch(storages);
        int resultTwo = enteringDao.insertEntering(new Entering(enteringId, storages.get(0).getOrderId(), enteringTime));
        int resultThree = orderDao.updateOrderStateById(storages.get(0).getOrderId(), 3);

        if (resultOne == 0 || resultTwo == 0 || resultThree == 0) result.setResult("no");

        return result;

    }

    @Override
    @Transactional
    public Result updateState(String storageId, int state) {
        Result result = new Result();
        result.setResult("ok");

        if (storageDao.updateStorageStateById(storageId, state) == 0) result.setResult("no");

        return result;
    }

    @Override
    @Transactional
    public Result updateRestNums(String storageId, int takeNums) {
        Result result = new Result();
        result.setResult("ok");

        if (storageDao.updateStorageRestNumsById(storageId, takeNums) == 0) result.setResult("no");

        return result;
    }
}

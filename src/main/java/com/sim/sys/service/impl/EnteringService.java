package com.sim.sys.service.impl;

import com.alibaba.fastjson.JSON;
import com.sim.sys.dao.EnteringDao;
import com.sim.sys.dao.StorageDao;
import com.sim.sys.entity.Entering;
import com.sim.sys.entity.Result;
import com.sim.sys.entity.Storage;
import com.sim.sys.service.IEnteringService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


//
//import com.sim.sys.entity.Entering;
//import com.sim.sys.dao.EnteringDao;
//import com.sim.sys.entity.Result;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.Resource;
//import java.util.List;


@Service("enteringService")
public class EnteringService implements IEnteringService {

    @Resource
    private EnteringDao enteringDao;

    @Resource
    private StorageDao storageDao;


    @Override
    public List<Entering> findAll(Entering entering) {
        return enteringDao.findAllEnteringByFilter(entering);
    }

    @Override
    public Result insert(Entering entering) {
        Result result = new Result();
        result.setResult("ok");

        if (enteringDao.findEnteringById(entering.getEnteringId()) != null) {
            result.setResult("no");
            return result;
        }
        if (enteringDao.insertEntering(entering) == 0) result.setResult("no");

        return result;
    }

    @Override
    public Result update(String enteringId, int state) {
        Result result = new Result();
        result.setResult("ok");

        if (enteringDao.updateEnteringById(enteringId, state) == 0) result.setResult("no");

        return result;
    }
}

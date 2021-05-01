package com.sim.sys.service.impl;

import com.sim.sys.entity.Pharmacist;
import com.sim.sys.dao.PharmacistDao;
import com.sim.sys.entity.Result;
import com.sim.sys.service.IPharmacistService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("pharmacistService")
public class PharmacistService implements IPharmacistService {

    @Resource
    public PharmacistDao pharmacistDao;

    @Override
    public Result verifyUser(String pharmacistId, String password) {
        Result result = new Result();
        result.setResult("ok");
        if (pharmacistDao.verifyUser(pharmacistId, password) == 0)
            result.setResult("no");
        return result;
    }

    @Override
    public List<Pharmacist> findAllByFilter(Pharmacist pharmacist) {
        return pharmacistDao.findAllByFilter(pharmacist);
    }

    @Override
    public Pharmacist findPharmacistById(String pharmacistId) {
        return pharmacistDao.findPharmacistById(pharmacistId);
    }

    @Override
    public Result insertPharmacist(Pharmacist pharmacist) {
        Result result = new Result();

        result.setResult("ok");

        if (pharmacistDao.findPharmacistById(pharmacist.getPharmacistId()) != null) result.setResult("no");

        if (pharmacistDao.insertPharmacist(pharmacist) == 0) result.setResult("no");

        return result;
    }

    @Override
    public Result updatePharmacist(Pharmacist pharmacist) {
        Result result = new Result();
        result.setResult("ok");

        if (pharmacistDao.updatePharmacist(pharmacist) <= 0)
            result.setResult("no");

        return result;
    }

    @Override
    public Result deletePharmacistById(String pharmacistId) {
        Result result = new Result();
        result.setResult("ok");

        if (pharmacistDao.deletePharmacistById(pharmacistId) <= 0)
            result.setResult("no");

        return result;
    }


}

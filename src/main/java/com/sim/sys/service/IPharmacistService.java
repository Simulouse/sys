package com.sim.sys.service;

import com.sim.sys.entity.Pharmacist;
import com.sim.sys.entity.Result;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IPharmacistService {

    Result verifyUser(Pharmacist pharmacist);

    Pharmacist findPharmacistById(String pharmacistId);

    List<Pharmacist> findAllByFilter(Pharmacist pharmacist);

    Result insertPharmacist(Pharmacist pharmacist);

    Result updatePharmacist(Pharmacist pharmacist, String oldId);

    Result deletePharmacistById(String pharmacistId);

}

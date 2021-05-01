package com.sim.sys.service;

import com.sim.sys.entity.Pharmacist;
import com.sim.sys.entity.Result;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TbPharmacist)表服务接口
 *
 * @author makejava
 * @since 2021-04-20 09:46:34
 */
public interface IPharmacistService {

    Result verifyUser(String pharmacistId, String password);

    Pharmacist findPharmacistById(String pharmacistId);

    List<Pharmacist> findAllByFilter(Pharmacist pharmacist);

    Result insertPharmacist(Pharmacist pharmacist);

    Result updatePharmacist(Pharmacist pharmacist);

    Result deletePharmacistById(String pharmacistId);

}

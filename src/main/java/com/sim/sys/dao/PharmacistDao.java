package com.sim.sys.dao;

import com.sim.sys.entity.Pharmacist;
import com.sim.sys.entity.Result;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface PharmacistDao {

    Pharmacist verifyUser(Pharmacist pharmacist);

    Pharmacist findPharmacistById(@Param("pharmacistId")String pharmacistId);

    List<Pharmacist> findAllPharmacistByFilter(Pharmacist pharmacist);

    int insertPharmacist(Pharmacist pharmacist);

    int updatePharmacist(Pharmacist pharmacist, @Param("oldId")String oldId);

    int deletePharmacistById(String pharmacistId);

}


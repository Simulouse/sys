package com.sim.sys.dao;

import com.sim.sys.entity.Pharmacist;
import com.sim.sys.entity.Result;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface PharmacistDao {

    int verifyUser(@Param("pharmacistId") String pharmacistId, @Param("password")String password);

    Pharmacist findPharmacistById(@Param("pharmacistId")String pharmacistId);

    List<Pharmacist> findAllByFilter(Pharmacist pharmacist);

    int insertPharmacist(Pharmacist pharmacist);

    int updatePharmacist(Pharmacist pharmacist);

    int deletePharmacistById(String pharmacistId);

}


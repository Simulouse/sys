package com.sim.sys.dao;

import com.sim.sys.entity.Admin;
import com.sim.sys.entity.Pharmacist;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface AdminDao {

    Admin verifyUser(Admin admin);

    Admin queryById(String account);

    List<Admin> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<Admin> queryAll(Admin admin);

    int insert(Admin admin);

    int insertBatch(@Param("entities") List<Admin> entities);

    int insertOrUpdateBatch(@Param("entities") List<Admin> entities);

    int update(Admin admin);

    int deleteById(String account);

}


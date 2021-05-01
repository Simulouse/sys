package com.sim.sys.dao;

import com.sim.sys.entity.Supplier;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SupplierDao {

    Supplier findSupplierById(String supplierId);

    List<Supplier> findAllSupplierByFilter(Supplier supplier);

    int insertSupplier(Supplier supplier);

    int updateSupplierById(Supplier supplier, @Param("oldSupplierId") String oldSupplierId);

    int deleteSupplierById(@Param("supplierId") String supplierId);

}


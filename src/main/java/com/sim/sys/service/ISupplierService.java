package com.sim.sys.service;

import com.sim.sys.entity.Result;
import com.sim.sys.entity.Supplier;

import java.util.List;

public interface ISupplierService {

    Supplier findById(String supplierId);

    List<Supplier> findAllByFilter(Supplier supplier);

    Result insert(Supplier supplier);

    Result update(Supplier supplier, String oldSupplierId);

    Result deleteById(String supplierId);

}

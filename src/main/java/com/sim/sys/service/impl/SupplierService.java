package com.sim.sys.service.impl;

import com.sim.sys.entity.Result;
import com.sim.sys.entity.Supplier;
import com.sim.sys.dao.SupplierDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("supplierService")
public class SupplierService implements com.sim.sys.service.ISupplierService {

    @Resource
    private SupplierDao supplierDao;

    @Override
    public Supplier findById(String supplierId) {
        return supplierDao.findSupplierById(supplierId);
    }

    @Override
    public List<Supplier> findAllByFilter(Supplier supplier) {
        return supplierDao.findAllSupplierByFilter(supplier);
    }

    @Override
    public Result insert(Supplier supplier) {
        Result result = new Result();
        result.setResult("ok");

        if (supplierDao.findSupplierById(supplier.getSupplierId()) != null) {
            result.setResult("on");
            return result;
        }

        if (supplierDao.insertSupplier(supplier) == 0) result.setResult("no");

        return result;
    }

    @Override
    public Result update(Supplier supplier, String oldSupplierId) {
        Result result = new Result();
        result.setResult("ok");

        if (supplierDao.updateSupplierById(supplier, oldSupplierId) == 0) result.setResult("no");

        return result;
    }

    @Override
    public Result deleteById(String supplierId) {
        Result result = new Result();
        result.setResult("ok");

        if (supplierDao.findSupplierById(supplierId) == null) return result;

        if (supplierDao.deleteSupplierById(supplierId) == 0) result.setResult("no");

        return result;
    }
}

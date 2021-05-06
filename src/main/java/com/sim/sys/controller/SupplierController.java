package com.sim.sys.controller;

import com.alibaba.fastjson.JSON;
import com.sim.sys.entity.Supplier;
import com.sim.sys.service.impl.SupplierService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/supplier")
@CrossOrigin(value = "*")
public class SupplierController {


    @Resource
    private SupplierService supplierService;


    @PostMapping("findAll")
    @ApiOperation(value = "按条件查询供应商")
    public String findAllByFilter(@RequestBody Supplier supplier) {
        return JSON.toJSONString(this.supplierService.findAllByFilter(supplier));
    }


    @PostMapping("/insert")
    @ApiOperation(value = "添加供应商")
    public String insert(@RequestBody Supplier supplier){
        return JSON.toJSONString(supplierService.insert(supplier));
    }


    @PostMapping("/deleteById")
    @ApiOperation(value = "删除供应商")
    public String delete(@RequestParam String supplierId){
        return JSON.toJSONString(supplierService.deleteById(supplierId));
    }


    @PostMapping("/updateSupplierById")
    @ApiOperation(value = "更新供应商信息")
    public String update(@RequestBody Supplier supplier, @RequestParam String oldSupplierId){
        return JSON.toJSONString(supplierService.update(supplier, oldSupplierId));
    }

}

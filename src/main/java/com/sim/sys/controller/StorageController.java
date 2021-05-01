package com.sim.sys.controller;

import com.alibaba.fastjson.JSON;
import com.sim.sys.entity.Storage;
import com.sim.sys.service.impl.StorageService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/storage")
@CrossOrigin(value = "*")
public class StorageController {


    @Resource
    private StorageService storageService;


    @PostMapping("findAllByFilter")
    @ApiOperation(value = "按条件查询库存")
    public String findAllByFilter(@RequestBody Storage storage) {
        return JSON.toJSONString(storageService.findAllByFilter(storage));
    }


    @PostMapping("/insert")
    @ApiOperation(value = "批量添加库存")
    public String insert(@RequestBody List<Storage> storages){
        return JSON.toJSONString(storageService.insert(storages));
    }


    @PostMapping("/deleteById")
    @ApiOperation(value = "删除库存")
    public String delete(@RequestParam String storageId){
        return JSON.toJSONString(storageService.delete(storageId));
    }


    @PostMapping("/updateSupplierById")
    @ApiOperation(value = "更新库存余量")
    public String updateById(@RequestParam String storageId, @RequestParam int restNums){
        return JSON.toJSONString(storageService.update(storageId, restNums));
    }

}

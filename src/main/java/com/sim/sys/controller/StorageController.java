package com.sim.sys.controller;

import com.alibaba.fastjson.JSON;
import com.sim.sys.entity.Delivery;
import com.sim.sys.entity.Storage;
import com.sim.sys.service.impl.StorageService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/storage")
@CrossOrigin(value = "*")
public class StorageController {


    @Resource
    private StorageService storageService;


    @PostMapping("findAll")
    @ApiOperation(value = "按条件查询库存")
    public String findAll(@RequestBody Storage storage) {
        String result = JSON.toJSONString(storageService.findAllByFilter(storage));
//        System.out.println(result);
        return result;
    }


    @PostMapping("/insert")
    @ApiOperation(value = "批量添加库存")
    public String insert(@RequestBody List<Storage> storages, @RequestParam String enteringId){
        return JSON.toJSONString(storageService.insert(storages, enteringId, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date().getTime())));
    }


    @GetMapping("/updateState")
    @ApiOperation(value = "删除库存")
    public String updateState(@RequestParam String storageId, @RequestParam int state){
        return JSON.toJSONString(storageService.updateState(storageId, state));
    }

    @GetMapping("/updateRestNums")
    @ApiOperation(value = "删除库存")
    public String updateRestNums(@RequestParam String storageId, @RequestParam int state){
        return JSON.toJSONString(storageService.updateRestNums(storageId, state));
    }


//    @PostMapping("/updateSupplierById")
//    @ApiOperation(value = "更新库存余量")
//    public String updateById(@RequestParam String storageId, @RequestParam int restNums){
//        return JSON.toJSONString(storageService.update(storageId, restNums));
//    }

}

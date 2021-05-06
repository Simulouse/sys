package com.sim.sys.controller;

import com.alibaba.fastjson.JSON;
import com.sim.sys.entity.Medicine;
import com.sim.sys.service.impl.MedicineService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/medicine")
public class MedicineController {

    @Resource
    private MedicineService medicineService;


    @PostMapping("/insert")
    @ApiOperation(value = "添加药品")
    public String insertMedicine(@RequestBody Medicine medicine){
        return JSON.toJSONString(medicineService.insert(medicine));
    }

    @PostMapping("/delete")
    @ApiOperation(value = "删除药品")
    public String deleteMedicineById(@RequestParam String medicineId){
        return JSON.toJSONString(medicineService.delete(medicineId));
    }


    @PostMapping("/update")
    @ApiOperation(value = "更新药品信息")
    public String updateMedicineById(@RequestBody Medicine medicine, @RequestParam String oldMedicineId){
        return JSON.toJSONString(medicineService.update(medicine, oldMedicineId));
    }


    @PostMapping("/findAll")
    @ApiOperation(value = "查询药品信息")
    public String findAll(@RequestBody Medicine medicine){
        return JSON.toJSONString(medicineService.findAllByFilter(medicine));
    }
}

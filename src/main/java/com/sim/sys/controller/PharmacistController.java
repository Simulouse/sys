package com.sim.sys.controller;

import com.alibaba.fastjson.JSON;
import com.sim.sys.entity.Pharmacist;
import com.sim.sys.service.impl.PharmacistService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/pharmacist")
@CrossOrigin(value = "*")
public class PharmacistController {

    @Resource
    private PharmacistService pharmacistService;

    @PostMapping("/insert")
    @ApiOperation(value = "插入药师")
    public String insert(@RequestBody Pharmacist pharmacist) {
        return JSON.toJSONString(pharmacistService.insertPharmacist(pharmacist));
    }

    @DeleteMapping("/delete")
    @ApiOperation(value = "删除药师")
    public String delete(@RequestParam String pharmacistId) {
        return JSON.toJSONString(pharmacistService.deletePharmacistById(pharmacistId));
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新药师")
    public String update(@RequestBody Pharmacist pharmacist, @RequestParam String oldId) {
        return JSON.toJSONString(pharmacistService.updatePharmacist(pharmacist, oldId));
    }

    @PostMapping("/signIn")
    @ApiOperation(value = "药师登录")
    public String SignIn(@RequestBody Pharmacist pharmacist){
        return JSON.toJSONString(pharmacistService.verifyUser(pharmacist));
    }

    @PostMapping("/findAll")
    @ApiOperation(value = "按条件查找")
    public String findAll(@RequestBody Pharmacist pharmacist) {
        return JSON.toJSONString(pharmacistService.findAllByFilter(pharmacist));
    }
}

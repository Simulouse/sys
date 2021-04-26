package com.sim.sys.controller;

import com.alibaba.fastjson.JSON;
import com.sim.sys.entity.Pharmacist;
import com.sim.sys.service.impl.PharmacistServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/pharmacist")
public class PharmacistController {

    /**
     * 服务对象
     */
    @Resource
    private PharmacistServiceImpl pharmacistService;

    /**
     * 登录
     * @param pharmacistId
     * @param password
     * @return
     */
    @GetMapping("/signIn")
    @ApiOperation(value = "登录")
    public String  verifyUserSignIn(@RequestParam String pharmacistId,@RequestParam String password){
        if(pharmacistService.verifyUser(pharmacistId,password)!=null){
            System.out.println("登陆成功");
            return "ok";
        }
        return "no";
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Pharmacist selectOne(String id) {
        return this.pharmacistService.queryById(id);
    }

    @PostMapping("/insertPharmacist")
    @ApiOperation(value = "添加用户")
    public String insertPharmacist(@RequestBody Pharmacist pharmacist){
        return JSON.toJSONString(pharmacistService.insert(pharmacist));
    }

    /**
     * 填写药单
     * @return
     */
    @GetMapping("/writePrescription")
    @ApiOperation(value = "填写药单")
    public String writePrescription(){
        return "/prescription_form";
    }
}

package com.sim.sys.controller;

import com.alibaba.fastjson.JSON;
import com.sim.sys.entity.Admin;
import com.sim.sys.service.impl.AdminService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;


@RestController
@CrossOrigin(value = "*")
@RequestMapping("admin")
public class AdminController {

    @Resource
    private AdminService adminService;

    @PostMapping("/signIn")
    @ApiOperation(value = "登录")
    public String  verifyUserSignIn(@RequestBody Admin admin){
        return JSON.toJSONString(adminService.verifyUser(admin));
    }


}

package com.sim.sys.controller;

import com.alibaba.fastjson.JSON;
import com.sim.sys.entity.Admin;
import com.sim.sys.service.impl.AdminServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;


/**
 * @author:
 * @date： 2021/4/21 15:03
 */
@RestController
@CrossOrigin(value = "*")
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private AdminServiceImpl adminService;

    /**
     * 登陆
     * @param account
     * @param password
     * @return
     */
    @GetMapping("/signIn")
    @ApiOperation(value = "登录")
    public String  verifyUserSignIn(@RequestParam String account, @RequestParam String password){
        return JSON.toJSONString(adminService.verifyUser(new Admin(account, password)));
    }


}

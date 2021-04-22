package com.sim.sys.controller;


import com.alibaba.fastjson.JSON;
import com.sim.sys.entity.Admin;
import com.sim.sys.entity.Entering;
import com.sim.sys.service.impl.AdminServiceImpl;


import com.sim.sys.service.impl.EnteringServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.print.attribute.standard.MediaName;
import java.util.List;

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

    @Resource
    private EnteringServiceImpl enteringService;

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

    @PostMapping("/entering/insertEntering")
    @ApiOperation(value = "登记入库信息")
    public String insertEntering(@RequestBody Entering entering){
        if(enteringService.insert(entering)!=null){
            System.out.println("入库登记成功");
            return "ok";
        }
        return "no";
    }

    @PostMapping("/entering/selectEntering")
    @ApiOperation(value = "查询入库信息")
    public List<Entering> selectLimitEntering(@RequestParam int offset,@RequestParam int limit){
        if(enteringService.queryAllByLimit(offset,limit)!=null){
            System.out.println("查询成功");
            return enteringService.queryAllByLimit(offset,limit);
        }
        return null;
    }

    @PostMapping("/entering/updateEnteringById")
    @ApiOperation(value = "更新入库信息")
    public Entering updateEnteringById(@RequestBody Entering entering){
        if(enteringService.update(entering)!=null){
            System.out.println("修改成功");
            return enteringService.update(entering);
        }
        return null;
    }






}

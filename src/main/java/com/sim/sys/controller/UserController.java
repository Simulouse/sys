package com.sim.sys.controller;

import com.sim.sys.service.impl.PharmacistServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/user")
public class UserController {

    @Resource
    PharmacistServiceImpl pharmacistService;

    @GetMapping("/signIn")
    public String  verifyUserSignIn(@RequestParam String pharmacistId,@RequestParam String password){
        if(pharmacistService.verifyUser(pharmacistId,password)!=null){
            System.out.println("登陆成功");
            return "ok";
        }
        return "no";
    }


}

package com.sim.sys.controller;

import com.sim.sys.service.TbPharmacistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/user")
public class UserController {

    @Autowired
    TbPharmacistService userService;

    @RequestMapping("/signIn")
    public String  verifyUserSignIn(@RequestParam String account,@RequestParam String password){
        if(userService.verifyUser(account,password)!=null){
            System.out.println("登陆成功");
            return "ok";
        }
        return "no";
    }


}

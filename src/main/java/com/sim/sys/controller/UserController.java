package com.sim.sys.controller;

import com.sim.sys.service.TbPharmacistService;
import com.sim.sys.service.impl.TbPharmacistServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/user")
public class UserController {

    @Autowired
    TbPharmacistServiceImpl tbPharmacistService;

    @GetMapping("/signIn")
    public String  verifyUserSignIn(@RequestParam String pharmacistId,@RequestParam String password){
        if(tbPharmacistService.verifyUser(pharmacistId,password)!=null){
            System.out.println("登陆成功");
            return "ok";
        }
        return "no";
    }


}

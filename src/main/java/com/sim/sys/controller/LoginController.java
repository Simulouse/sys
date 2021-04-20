package com.sim.sys.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author:
 * @date： 2021/4/20 19:00
 */
@RestController
@CrossOrigin(value = "*")
@RequestMapping("/system")
public class LoginController {
    @GetMapping("/login")
    public String toLogin(@RequestParam String status){
        if (status.equals("user")) return "login_user";
        else return "login_admin";
    }
}

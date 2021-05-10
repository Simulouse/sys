package com.sim.sys.controller;

import com.alibaba.fastjson.JSON;
import com.sim.sys.entity.Entering;
import com.sim.sys.service.impl.EnteringService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;


@RestController
@CrossOrigin(value = "*")
@RequestMapping("/entering")
public class EnteringController {
    @Resource
    private EnteringService enteringService;

//    @PostMapping("/insert")
//    @ApiOperation(value = "登记入库信息")
//    public String insert(@RequestBody Entering entering){
//        return JSON.toJSONString(enteringService.insert(entering));
//    }

    @PostMapping("/findAll")
    @ApiOperation(value = "查询入库信息")
    public String findAll(@RequestBody Entering entering){
        return JSON.toJSONString(enteringService.findAll(entering));
    }

//    @PostMapping("/updateEnteringById")
//    @ApiOperation(value = "更新入库信息")
//    public Entering updateEnteringById(@RequestBody Entering entering){
//        if(enteringService.update(entering)!=null){
//            System.out.println("修改成功");
//            return enteringService.update(entering);
//        }
//        return null;
//    }
}

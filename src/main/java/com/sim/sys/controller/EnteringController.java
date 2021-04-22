package com.sim.sys.controller;

import com.alibaba.fastjson.JSON;
import com.sim.sys.entity.Entering;
import com.sim.sys.service.impl.EnteringServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

/**
 * @author:
 * @date： 2021/4/22 10:59
 */
@RestController
@CrossOrigin(value = "*")
@RequestMapping("/entering")
public class EnteringController {
    @Resource
    private EnteringServiceImpl enteringService;

    @PostMapping("/entering/insertEntering")
    @ApiOperation(value = "登记入库信息")
    public String insertEntering(@RequestBody Entering entering){
        return JSON.toJSONString(enteringService.insert(entering));
    }

    @PostMapping("/entering/selectEntering")
    @ApiOperation(value = "查询入库信息")
    public List<Entering> selectLimitEntering(@RequestParam int offset, @RequestParam int limit){
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

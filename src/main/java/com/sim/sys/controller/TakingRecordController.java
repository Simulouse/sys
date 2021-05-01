package com.sim.sys.controller;


import com.alibaba.fastjson.JSON;
import com.sim.sys.entity.TakingRecord;
import com.sim.sys.service.impl.TakingRecordService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("takingRecord")
public class TakingRecordController {

    @Resource
    private TakingRecordService takingRecordService;

    @PostMapping("/findAllByFilter")
    public String findAllByFilter(@RequestBody TakingRecord takingRecord) {
        return JSON.toJSONString(takingRecordService.findAllByFilter(takingRecord));
    }

    @PostMapping("insert")
    public String insert(@RequestBody TakingRecord takingRecord) {
        return JSON.toJSONString(takingRecordService.insert(takingRecord));
    }
}

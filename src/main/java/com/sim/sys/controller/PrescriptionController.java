package com.sim.sys.controller;

import com.alibaba.fastjson.JSON;
import com.sim.sys.entity.Prescription;
import com.sim.sys.service.impl.PrescriptionServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Prescription)表控制层
 *
 * @author makejava
 * @since 2021-04-23 09:33:34
 */
@RestController
@RequestMapping("prescription")
public class PrescriptionController {
    /**
     * 服务对象
     */
    @Resource
    private PrescriptionServiceImpl prescriptionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Prescription selectOne(String id) {
        return this.prescriptionService.queryById(id);
    }


    @PostMapping("/insertEntering")
    @ApiOperation(value = "登记药单")
    public String insertPrescription(@RequestBody Prescription prescription){
        return JSON.toJSONString(prescriptionService.insert(prescription));
    }

}

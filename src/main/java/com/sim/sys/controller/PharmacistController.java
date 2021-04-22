package com.sim.sys.controller;

import com.sim.sys.entity.Pharmacist;
import com.sim.sys.service.PharmacistService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbPharmacist)表控制层
 *
 * @author makejava
 * @since 2021-04-21 10:23:54
 */
@RestController
@RequestMapping("/pharmacist")
public class PharmacistController {
    /**
     * 服务对象
     */
    @Resource
    private PharmacistService pharmacistService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Pharmacist selectOne(String id) {
        return this.pharmacistService.queryById(id);
    }

}

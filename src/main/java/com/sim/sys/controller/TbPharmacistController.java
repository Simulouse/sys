package com.sim.sys.controller;

import com.sim.sys.entity.TbPharmacist;
import com.sim.sys.service.TbPharmacistService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbPharmacist)表控制层
 *
 * @author makejava
 * @since 2021-04-21 10:23:54
 */
@RestController
@RequestMapping("tbPharmacist")
public class TbPharmacistController {
    /**
     * 服务对象
     */
    @Resource
    private TbPharmacistService tbPharmacistService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbPharmacist selectOne(String id) {
        return this.tbPharmacistService.queryById(id);
    }

}

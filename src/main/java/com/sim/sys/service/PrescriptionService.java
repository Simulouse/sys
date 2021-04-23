package com.sim.sys.service;

import com.sim.sys.entity.Prescription;
import com.sim.sys.entity.Result;

import java.util.List;

/**
 * (Prescription)表服务接口
 *
 * @author makejava
 * @since 2021-04-23 09:33:33
 */
public interface PrescriptionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Prescription queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Prescription> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param prescription 实例对象
     * @return 实例对象
     */
    Result insert(Prescription prescription);

    /**
     * 修改数据
     *
     * @param prescription 实例对象
     * @return 实例对象
     */
    Prescription update(Prescription prescription);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}

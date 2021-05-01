package com.sim.sys.service;

import com.sim.sys.entity.Entering;
import com.sim.sys.entity.Result;

import java.util.List;

/**
 * (TbEntering)表服务接口
 *
 * @author makejava
 * @since 2021-04-20 09:44:47
 */
public interface IEnteringService {

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    Entering queryById(String orderId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Entering> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param entering 实例对象
     * @return 实例对象
     */
    Result insert(Entering entering);

    /**
     * 修改数据
     *
     * @param entering 实例对象
     * @return 实例对象
     */
    Entering update(Entering entering);

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 是否成功
     */
    boolean deleteById(String orderId);

}

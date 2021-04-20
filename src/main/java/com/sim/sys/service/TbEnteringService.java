package com.sim.sys.service;

import com.sim.sys.entity.TbEntering;

import java.util.List;

/**
 * (TbEntering)表服务接口
 *
 * @author makejava
 * @since 2021-04-20 09:44:47
 */
public interface TbEnteringService {

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    TbEntering queryById(String orderId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbEntering> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbEntering 实例对象
     * @return 实例对象
     */
    TbEntering insert(TbEntering tbEntering);

    /**
     * 修改数据
     *
     * @param tbEntering 实例对象
     * @return 实例对象
     */
    TbEntering update(TbEntering tbEntering);

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 是否成功
     */
    boolean deleteById(String orderId);

}

package com.sim.sys.service;

import com.sim.sys.entity.TbSupplier;

import java.util.List;

/**
 * (TbSupplier)表服务接口
 *
 * @author makejava
 * @since 2021-04-20 09:46:56
 */
public interface TbSupplierService {

    /**
     * 通过ID查询单条数据
     *
     * @param supplierId 主键
     * @return 实例对象
     */
    TbSupplier queryById(String supplierId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbSupplier> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbSupplier 实例对象
     * @return 实例对象
     */
    TbSupplier insert(TbSupplier tbSupplier);

    /**
     * 修改数据
     *
     * @param tbSupplier 实例对象
     * @return 实例对象
     */
    TbSupplier update(TbSupplier tbSupplier);

    /**
     * 通过主键删除数据
     *
     * @param supplierId 主键
     * @return 是否成功
     */
    boolean deleteById(String supplierId);

}

package com.sim.sys.service;

import com.sim.sys.entity.TbPharmacist;

import java.util.List;

/**
 * (TbPharmacist)表服务接口
 *
 * @author makejava
 * @since 2021-04-20 09:46:34
 */
public interface TbPharmacistService {

    TbPharmacist verifyUser(String account,String password);
    /**
     * 通过ID查询单条数据
     *
     * @param pharmacistId 主键
     * @return 实例对象
     */
    TbPharmacist queryById(String pharmacistId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbPharmacist> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbPharmacist 实例对象
     * @return 实例对象
     */
    TbPharmacist insert(TbPharmacist tbPharmacist);

    /**
     * 修改数据
     *
     * @param tbPharmacist 实例对象
     * @return 实例对象
     */
    TbPharmacist update(TbPharmacist tbPharmacist);

    /**
     * 通过主键删除数据
     *
     * @param pharmacistId 主键
     * @return 是否成功
     */
    boolean deleteById(String pharmacistId);

}

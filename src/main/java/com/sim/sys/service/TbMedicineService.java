package com.sim.sys.service;

import com.sim.sys.entity.TbMedicine;

import java.util.List;

/**
 * (TbMedicine)表服务接口
 *
 * @author makejava
 * @since 2021-04-20 09:46:00
 */
public interface TbMedicineService {

    /**
     * 通过ID查询单条数据
     *
     * @param medicineId 主键
     * @return 实例对象
     */
    TbMedicine queryById(String medicineId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbMedicine> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbMedicine 实例对象
     * @return 实例对象
     */
    TbMedicine insert(TbMedicine tbMedicine);

    /**
     * 修改数据
     *
     * @param tbMedicine 实例对象
     * @return 实例对象
     */
    TbMedicine update(TbMedicine tbMedicine);

    /**
     * 通过主键删除数据
     *
     * @param medicineId 主键
     * @return 是否成功
     */
    boolean deleteById(String medicineId);

}

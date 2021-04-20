package com.sim.sys.dao;

import com.sim.sys.entity.TbMedicine;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TbMedicine)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-20 09:46:00
 */
public interface TbMedicineDao {

    /**
     * 通过ID查询单条数据
     *
     * @param medicineId 主键
     * @return 实例对象
     */
    TbMedicine queryById(String medicineId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbMedicine> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbMedicine 实例对象
     * @return 对象列表
     */
    List<TbMedicine> queryAll(TbMedicine tbMedicine);

    /**
     * 新增数据
     *
     * @param tbMedicine 实例对象
     * @return 影响行数
     */
    int insert(TbMedicine tbMedicine);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbMedicine> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbMedicine> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbMedicine> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TbMedicine> entities);

    /**
     * 修改数据
     *
     * @param tbMedicine 实例对象
     * @return 影响行数
     */
    int update(TbMedicine tbMedicine);

    /**
     * 通过主键删除数据
     *
     * @param medicineId 主键
     * @return 影响行数
     */
    int deleteById(String medicineId);

}


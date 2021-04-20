package com.sim.sys.dao;

import com.sim.sys.entity.TbSupplier;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TbSupplier)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-20 09:46:56
 */
public interface TbSupplierDao {

    /**
     * 通过ID查询单条数据
     *
     * @param supplierId 主键
     * @return 实例对象
     */
    TbSupplier queryById(String supplierId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbSupplier> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbSupplier 实例对象
     * @return 对象列表
     */
    List<TbSupplier> queryAll(TbSupplier tbSupplier);

    /**
     * 新增数据
     *
     * @param tbSupplier 实例对象
     * @return 影响行数
     */
    int insert(TbSupplier tbSupplier);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbSupplier> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbSupplier> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbSupplier> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TbSupplier> entities);

    /**
     * 修改数据
     *
     * @param tbSupplier 实例对象
     * @return 影响行数
     */
    int update(TbSupplier tbSupplier);

    /**
     * 通过主键删除数据
     *
     * @param supplierId 主键
     * @return 影响行数
     */
    int deleteById(String supplierId);

}


package com.sim.sys.dao;

import com.sim.sys.entity.Entering;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface EnteringDao {

    Entering queryById(String orderId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Entering> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param entering 实例对象
     * @return 对象列表
     */
    List<Entering> queryAll(Entering entering);

    /**
     * 新增数据
     *
     * @param entering 实例对象
     * @return 影响行数
     */
    int insert(Entering entering);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbEntering> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Entering> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbEntering> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Entering> entities);

    /**
     * 修改数据
     *
     * @param entering 实例对象
     * @return 影响行数
     */
    int update(Entering entering);

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 影响行数
     */
    int deleteById(String orderId);

}


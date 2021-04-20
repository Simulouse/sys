package com.sim.sys.dao;

import com.sim.sys.entity.TbAdmin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TbAdmin)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-20 10:11:49
 */
public interface TbAdminDao {

    /**
     * 通过ID查询单条数据
     *
     * @param account 主键
     * @return 实例对象
     */
    TbAdmin queryById(String account);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbAdmin> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbAdmin 实例对象
     * @return 对象列表
     */
    List<TbAdmin> queryAll(TbAdmin tbAdmin);

    /**
     * 新增数据
     *
     * @param tbAdmin 实例对象
     * @return 影响行数
     */
    int insert(TbAdmin tbAdmin);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbAdmin> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbAdmin> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbAdmin> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TbAdmin> entities);

    /**
     * 修改数据
     *
     * @param tbAdmin 实例对象
     * @return 影响行数
     */
    int update(TbAdmin tbAdmin);

    /**
     * 通过主键删除数据
     *
     * @param account 主键
     * @return 影响行数
     */
    int deleteById(String account);

}


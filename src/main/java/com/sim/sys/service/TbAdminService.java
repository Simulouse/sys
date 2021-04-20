package com.sim.sys.service;

import com.sim.sys.entity.TbAdmin;

import java.util.List;

/**
 * (TbAdmin)表服务接口
 *
 * @author makejava
 * @since 2021-04-20 10:11:49
 */
public interface TbAdminService {

    /**
     * 通过ID查询单条数据
     *
     * @param account 主键
     * @return 实例对象
     */
    TbAdmin queryById(String account);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbAdmin> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbAdmin 实例对象
     * @return 实例对象
     */
    TbAdmin insert(TbAdmin tbAdmin);

    /**
     * 修改数据
     *
     * @param tbAdmin 实例对象
     * @return 实例对象
     */
    TbAdmin update(TbAdmin tbAdmin);

    /**
     * 通过主键删除数据
     *
     * @param account 主键
     * @return 是否成功
     */
    boolean deleteById(String account);

}

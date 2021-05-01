package com.sim.sys.service;

import com.sim.sys.entity.Admin;
import com.sim.sys.entity.Result;

import java.util.List;

/**
 * (TbAdmin)表服务接口
 *
 * @author makejava
 * @since 2021-04-20 10:11:49
 */
public interface IAdminService {

    Result verifyUser(Admin admin);

    /**
     * 通过ID查询单条数据
     *
     * @param account 主键
     * @return 实例对象
     */
    Admin queryById(String account);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Admin> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param admin 实例对象
     * @return 实例对象
     */
    Admin insert(Admin admin);

    /**
     * 修改数据
     *
     * @param admin 实例对象
     * @return 实例对象
     */
    Admin update(Admin admin);

    /**
     * 通过主键删除数据
     *
     * @param account 主键
     * @return 是否成功
     */
    boolean deleteById(String account);

}

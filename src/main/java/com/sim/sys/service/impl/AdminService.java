package com.sim.sys.service.impl;

import com.sim.sys.entity.Admin;
import com.sim.sys.dao.AdminDao;
import com.sim.sys.entity.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbAdmin)表服务实现类
 *
 * @author makejava
 * @since 2021-04-20 10:11:49
 */
@Service("tbAdminService")
public class AdminService implements com.sim.sys.service.IAdminService {

    @Resource
    private AdminDao adminDao;


    @Override
    public Result verifyUser(Admin admin) {
        Result result = new Result();

        Admin tempAdmin = adminDao.verifyUser(admin);

        if (tempAdmin ==  null) {
            result.setResult("no");
            return result;
        }
        result.setResult("yes");
        result.setData(tempAdmin);

        return result;

    }

    /**
     * 通过ID查询单条数据
     *
     * @param account 主键
     * @return 实例对象
     */
    @Override
    public Admin queryById(String account) {
        return this.adminDao.queryById(account);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Admin> queryAllByLimit(int offset, int limit) {
        return this.adminDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param admin 实例对象
     * @return 实例对象
     */
    @Override
    public Admin insert(Admin admin) {
        this.adminDao.insert(admin);
        return admin;
    }

    /**
     * 修改数据
     *
     * @param admin 实例对象
     * @return 实例对象
     */
    @Override
    public Admin update(Admin admin) {
        this.adminDao.update(admin);
        return this.queryById(admin.getAccount());
    }

    /**
     * 通过主键删除数据
     *
     * @param account 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String account) {
        return this.adminDao.deleteById(account) > 0;
    }
}

package com.sim.sys.service.impl;

import com.sim.sys.entity.Pharmacist;
import com.sim.sys.dao.PharmacistDao;
import com.sim.sys.entity.Result;
import com.sim.sys.service.PharmacistService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbPharmacist)表服务实现类
 *
 * @author makejava
 * @since 2021-04-20 09:46:34
 */
@Service("tbPharmacistService")
public class PharmacistServiceImpl implements PharmacistService {

    @Resource
    public PharmacistDao pharmacistDao;

    @Override
    public Pharmacist verifyUser(String pharmacistId, String password) {
        System.out.println("=====");
        return pharmacistDao.verifyUser(pharmacistId, password);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param pharmacistId 主键
     * @return 实例对象
     */
    @Override
    public Pharmacist queryById(String pharmacistId) {
        return this.pharmacistDao.queryById(pharmacistId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Pharmacist> queryAllByLimit(int offset, int limit) {
        return this.pharmacistDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pharmacist 实例对象
     * @return 实例对象
     */
    @Override
    public Result insert(Pharmacist pharmacist) {
        Result result = new Result();
        if (this.pharmacistDao.queryById(pharmacist.getPharmacistId()) != null) result.setResult("no");
        else if ( this.pharmacistDao.insert(pharmacist) == 0) result.setResult("no");
        else result.setResult("yes");

        return result;
    }

    /**
     * 修改数据
     *
     * @param pharmacist 实例对象
     * @return 实例对象
     */
    @Override
    public Pharmacist update(Pharmacist pharmacist) {
        this.pharmacistDao.update(pharmacist);
        return this.queryById(pharmacist.getPharmacistId());
    }

    /**
     * 通过主键删除数据
     *
     * @param pharmacistId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String pharmacistId) {
        return this.pharmacistDao.deleteById(pharmacistId) > 0;
    }
}

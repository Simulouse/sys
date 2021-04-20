package com.sim.sys.service.impl;

import com.sim.sys.entity.TbPharmacist;
import com.sim.sys.dao.TbPharmacistDao;
import com.sim.sys.service.TbPharmacistService;
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
public class TbPharmacistServiceImpl implements TbPharmacistService {
    @Resource
    private TbPharmacistDao tbPharmacistDao;

    @Override
    public TbPharmacist verifyUser(String account, String password) {
        return tbPharmacistDao.verifyUser(account,password);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param pharmacistId 主键
     * @return 实例对象
     */
    @Override
    public TbPharmacist queryById(String pharmacistId) {
        return this.tbPharmacistDao.queryById(pharmacistId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbPharmacist> queryAllByLimit(int offset, int limit) {
        return this.tbPharmacistDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbPharmacist 实例对象
     * @return 实例对象
     */
    @Override
    public TbPharmacist insert(TbPharmacist tbPharmacist) {
        this.tbPharmacistDao.insert(tbPharmacist);
        return tbPharmacist;
    }

    /**
     * 修改数据
     *
     * @param tbPharmacist 实例对象
     * @return 实例对象
     */
    @Override
    public TbPharmacist update(TbPharmacist tbPharmacist) {
        this.tbPharmacistDao.update(tbPharmacist);
        return this.queryById(tbPharmacist.getPharmacistId());
    }

    /**
     * 通过主键删除数据
     *
     * @param pharmacistId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String pharmacistId) {
        return this.tbPharmacistDao.deleteById(pharmacistId) > 0;
    }
}

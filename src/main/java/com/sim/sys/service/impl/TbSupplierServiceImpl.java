package com.sim.sys.service.impl;

import com.sim.sys.entity.TbSupplier;
import com.sim.sys.dao.TbSupplierDao;
import com.sim.sys.service.TbSupplierService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbSupplier)表服务实现类
 *
 * @author makejava
 * @since 2021-04-20 09:46:56
 */
@Service("tbSupplierService")
public class TbSupplierServiceImpl implements TbSupplierService {
    @Resource
    private TbSupplierDao tbSupplierDao;

    /**
     * 通过ID查询单条数据
     *
     * @param supplierId 主键
     * @return 实例对象
     */
    @Override
    public TbSupplier queryById(String supplierId) {
        return this.tbSupplierDao.queryById(supplierId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbSupplier> queryAllByLimit(int offset, int limit) {
        return this.tbSupplierDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbSupplier 实例对象
     * @return 实例对象
     */
    @Override
    public TbSupplier insert(TbSupplier tbSupplier) {
        this.tbSupplierDao.insert(tbSupplier);
        return tbSupplier;
    }

    /**
     * 修改数据
     *
     * @param tbSupplier 实例对象
     * @return 实例对象
     */
    @Override
    public TbSupplier update(TbSupplier tbSupplier) {
        this.tbSupplierDao.update(tbSupplier);
        return this.queryById(tbSupplier.getSupplierId());
    }

    /**
     * 通过主键删除数据
     *
     * @param supplierId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String supplierId) {
        return this.tbSupplierDao.deleteById(supplierId) > 0;
    }
}

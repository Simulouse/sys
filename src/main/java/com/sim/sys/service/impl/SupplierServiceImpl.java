package com.sim.sys.service.impl;

import com.sim.sys.entity.Supplier;
import com.sim.sys.dao.SupplierDao;
import com.sim.sys.service.SupplierService;
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
public class SupplierServiceImpl implements SupplierService {
    @Resource
    private SupplierDao tbSupplierDao;

    /**
     * 通过ID查询单条数据
     *
     * @param supplierId 主键
     * @return 实例对象
     */
    @Override
    public Supplier queryById(String supplierId) {
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
    public List<Supplier> queryAllByLimit(int offset, int limit) {
        return this.tbSupplierDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param supplier 实例对象
     * @return 实例对象
     */
    @Override
    public Supplier insert(Supplier supplier) {
        this.tbSupplierDao.insert(supplier);
        return supplier;
    }

    /**
     * 修改数据
     *
     * @param supplier 实例对象
     * @return 实例对象
     */
    @Override
    public Supplier update(Supplier supplier) {
        this.tbSupplierDao.update(supplier);
        return this.queryById(supplier.getSupplierId());
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

package com.sim.sys.service.impl;

import com.sim.sys.entity.TbEntering;
import com.sim.sys.dao.TbEnteringDao;
import com.sim.sys.service.TbEnteringService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbEntering)表服务实现类
 *
 * @author makejava
 * @since 2021-04-20 09:44:49
 */
@Service("tbEnteringService")
public class TbEnteringServiceImpl implements TbEnteringService {
    @Resource
    private TbEnteringDao tbEnteringDao;

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    @Override
    public TbEntering queryById(String orderId) {
        return this.tbEnteringDao.queryById(orderId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbEntering> queryAllByLimit(int offset, int limit) {
        return this.tbEnteringDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbEntering 实例对象
     * @return 实例对象
     */
    @Override
    public TbEntering insert(TbEntering tbEntering) {
        this.tbEnteringDao.insert(tbEntering);
        return tbEntering;
    }

    /**
     * 修改数据
     *
     * @param tbEntering 实例对象
     * @return 实例对象
     */
    @Override
    public TbEntering update(TbEntering tbEntering) {
        this.tbEnteringDao.update(tbEntering);
        return this.queryById(tbEntering.getOrderId());
    }

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String orderId) {
        return this.tbEnteringDao.deleteById(orderId) > 0;
    }
}

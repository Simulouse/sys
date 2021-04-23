package com.sim.sys.service.impl;

import com.sim.sys.entity.Order;
import com.sim.sys.dao.OrderDao;
import com.sim.sys.entity.Result;
import com.sim.sys.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbOrder)表服务实现类
 *
 * @author makejava
 * @since 2021-04-20 09:46:18
 */
@Service("tbOrderService")
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    @Override
    public Order queryById(String orderId) {
        return this.orderDao.queryById(orderId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Order> queryAllByLimit(int offset, int limit) {
        return this.orderDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    @Override
    public Result insert(Order order) {
        Result result = new Result();
        if (this.orderDao.queryById(order.getOrderId())!=null)result.setResult("no");
        else if (this.orderDao.insert(order)==0) result.setResult("no");
        else result.setResult("yes");
        return result;
    }

    /**
     * 修改数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    @Override
    public Order update(Order order) {
        this.orderDao.update(order);
        return this.queryById(order.getOrderId());
    }

    @Override
    public Order updateOrderStateById(String orderId,int state) {
        this.orderDao.updateOrderStateById(orderId,state);
        return this.queryById(orderId);
    }

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String orderId) {
        return this.orderDao.deleteById(orderId) > 0;
    }
}

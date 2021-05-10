package com.sim.sys.service.impl;

import com.sim.sys.dao.OrderMedicineDao;
import com.sim.sys.dao.OrderDao;
import com.sim.sys.entity.Order;
import com.sim.sys.entity.Result;
import com.sim.sys.service.IOrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Service("orderService")
public class OrderService implements IOrderService {
    @Resource
    private OrderDao orderDao;

    @Resource
    OrderMedicineDao orderMedicineDao;


    @Override
    @Transactional
    public Result insertOrder(Order order) {
        Result result = new Result();

        if (orderDao.findOrderById(order.getOrderId()) != null) {
            result.setResult("no");
            return result;
        }

        int resultOne = orderDao.insertOrder(order);
        int resultTwo = orderMedicineDao.insertOrderMedicine(order.getRecords());

        if (resultOne == 0 || resultTwo == 0) {
            result.setResult("no");
            return result;
        }

        result.setResult("ok");

        return result;
    }

    @Override
    public List<Order> findAllByFilter(Order order) {
        return orderDao.findAllOrderByFilter(order);
    }

    @Override
    public Result updateOrderStateById(String orderId,int state) {
        Result result = new Result();

        result.setResult("ok");

        if (orderDao.updateOrderStateById(orderId, state) == 0) result.setResult("no");

        return result;
    }

    @Override
    @Transactional
    public Result deleteOrderById(String orderId) {
        Result result = new Result();
        result.setResult("ok");

        int resultOne = orderDao.deleteOrderById(orderId);
        int resultTow = orderMedicineDao.deleteOrderMedicineById(orderId);

        if (resultOne <= 0 || resultTow <=0) result.setResult("no");

        return result;
    }

}

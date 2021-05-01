package com.sim.sys.service;

import com.sim.sys.entity.Order;
import com.sim.sys.entity.Result;

import java.util.List;

/**
 * (TbOrder)表服务接口
 *
 * @author makejava
 * @since 2021-04-20 09:46:18
 */
public interface IOrderService {

    List<Order> findAllByFilter(Order order);

    Result insertOrder(Order order);

    Result updateOrderStateById(String orderId,int state);

    Result deleteOrderById(String orderId);

}

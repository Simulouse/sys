package com.sim.sys.dao;

import com.sim.sys.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TbOrder)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-20 09:46:17
 */
public interface OrderDao {

    List<Order> findAllOrderByFilter(Order order);

    Order findOrderById(@Param("orderId")String orderId);

    int insertOrder(Order order);

    int deleteOrderById(@Param("orderId") String orderId);

    int updateOrderStateById(@Param("orderId") String orderId, @Param("state")int state);



}


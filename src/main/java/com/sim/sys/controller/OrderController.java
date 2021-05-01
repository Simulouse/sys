package com.sim.sys.controller;

import com.alibaba.fastjson.JSON;
import com.sim.sys.entity.Order;
import com.sim.sys.service.impl.OrderServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class OrderController {


    @Resource
    private OrderServiceImpl orderService;

    @PostMapping("/findAllByFilter")
    @ApiOperation("value=查找所有订单")
    public String findAllByFilter(@RequestBody Order order){
        return JSON.toJSONString(orderService.findAllByFilter(order));
    }

    @PostMapping("/insertOrder")
    @ApiOperation("value=查找所有订单")
    public String insert(@RequestBody Order order){
        return JSON.toJSONString(orderService.insertOrder(order));
    }

    @PostMapping("/deleteOrderById")
    @ApiOperation(value = "删除订单")
    public String deleteIdOrderById(@RequestParam String orderId){
        return JSON.toJSONString(orderService.deleteOrderById(orderId));
    }

    @PostMapping("/updateOrder")
    @ApiOperation(value = "更新订单信息")
    public String updateOrder(@RequestParam String orderId, @RequestParam int state){
        return JSON.toJSONString(orderService.updateOrderStateById(orderId, state));
    }


}

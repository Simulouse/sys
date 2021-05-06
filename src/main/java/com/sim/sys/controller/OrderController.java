package com.sim.sys.controller;

import com.alibaba.fastjson.JSON;
import com.sim.sys.entity.Order;
import com.sim.sys.service.impl.OrderService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
@CrossOrigin(value = "*")
public class OrderController {


    @Resource
    private OrderService orderService;

    @PostMapping("/findAll")
    @ApiOperation("value=查找所有订单")
    public String findAll(@RequestBody Order order){
        return JSON.toJSONString(orderService.findAllByFilter(order));
    }

    @PostMapping("/insert")
    @ApiOperation("value=添加订单")
    public String insert(@RequestBody Order order){
        return JSON.toJSONString(orderService.insertOrder(order));
    }

    @DeleteMapping("/delete")
    @ApiOperation(value = "删除订单")
    public String delete(@RequestParam String orderId){
        return JSON.toJSONString(orderService.deleteOrderById(orderId));
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新订单信息")
    public String update(@RequestParam String orderId, @RequestParam int state){
        return JSON.toJSONString(orderService.updateOrderStateById(orderId, state));
    }


}

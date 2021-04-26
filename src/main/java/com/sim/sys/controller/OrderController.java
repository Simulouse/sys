package com.sim.sys.controller;

import com.alibaba.fastjson.JSON;
import com.sim.sys.entity.Order;
import com.sim.sys.service.impl.OrderServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    /**
     * 服务对象
     */
    @Resource
    private OrderServiceImpl orderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    @ApiOperation(value = "查询单条订单")
    public Order selectOne(String id) {
        return this.orderService.queryById(id);
    }

    /**
     * 添加订单信息
     * @param order
     * @return
     */

    @PostMapping("/insertOrder")
    @ApiOperation(value = "添加订单")
    public String insertMedicine(@RequestBody Order  order){
        return JSON.toJSONString(orderService.insert(order));
    }

    /**
     * 查询分页订单信息
     * @param offset
     * @param limit
     * @return
     */
    @PostMapping("/selectLimitOrder")
    @ApiOperation(value = "查询分页订单信息")
    public List<Order> selectLimitOrder(@RequestParam int offset, @RequestParam int limit){
        if(orderService.queryAllByLimit(offset,limit)!=null){
            System.out.println("查询成功");
            return orderService.queryAllByLimit(offset,limit);
        }
        return null;
    }


    /**
     * 删除订单
     * @param orderId
     * @return
     */
    @PostMapping("/deleteOrderById")
    @ApiOperation(value = "删除订单")
    public String deleteIdOrderById(@RequestParam String orderId){
        if(orderService.deleteById(orderId)){
            System.out.println("删除成功");
            return "ok";
        }
        return "no";
    }

    /**
     * 更新订单信息
     * @param order
     * @return
     */
    @PostMapping("/updateOrder")
    @ApiOperation(value = "更新订单信息")
    public Order updateOrder(@RequestBody Order order){
        if(orderService.update(order)!=null){
            System.out.println("修改成功");
            return orderService.update(order);
        }
        return null;
    }

    /**
     * 修改订单状态
     * @param orderId
     * @return
     */
    @PostMapping("/updateOrderStateById")
    @ApiOperation(value = "更新订单状态信息")
    public Order updateOrderStateById(@RequestParam String orderId,@RequestParam int state){
        if(orderService.updateOrderStateById(orderId,state)!=null){
            System.out.println("修改成功");
            return orderService.updateOrderStateById(orderId,state);
        }
        return null;
    }
}

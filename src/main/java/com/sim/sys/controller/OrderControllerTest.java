package com.sim.sys.controller;

import com.sim.sys.service.impl.OrderServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class OrderControllerTest {

    /**
     * 服务对象
     */
    @Resource
    private OrderServiceImpl orderService;



    /**
     * 查询分页订单信息
     * @param offset
     * @param limit
     * @return
     */
//    @PostMapping("/selectLimitOrder")
//    @ApiOperation(value = "查询分页订单信息")
//    public List<Order> selectLimitOrder(@RequestParam int offset, @RequestParam int limit){
//        if(orderService.queryAllByLimit(offset,limit)!=null){
//            System.out.println("查询成功");
//            return orderService.queryAllByLimit(offset,limit);
//        }
//        return null;
//    }




}

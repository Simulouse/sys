package com.sim.sys.controller;

import com.alibaba.fastjson.JSON;
import com.sim.sys.entity.Supplier;
import com.sim.sys.service.impl.SupplierServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    /**
     * 服务对象
     */
    @Resource
    private SupplierServiceImpl supplierService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Supplier selectOne(String id) {
        return this.supplierService.queryById(id);
    }

    /**
     * 添加供应商信息
     * @param supplier
     * @return
     */
    @PostMapping("/insertSupplier")
    @ApiOperation(value = "添加供应商")
    public String insertMedicine(@RequestBody Supplier supplier){
        return JSON.toJSONString(supplierService.insert(supplier));
    }

    /**
     * 删除供应商信息
     * @param supplierId
     * @return
     */
    @PostMapping("/deleteSupplierById")
    @ApiOperation(value = "删除供应商")
    public String deleteSupplierById(@RequestParam String supplierId){
        if(supplierService.deleteById(supplierId)){
            System.out.println("删除成功");
            return "ok";
        }
        return "no";
    }

    /**
     * 更新供应商信息
     * @param supplier
     * @return
     */
    @PostMapping("/updateSupplierById")
    @ApiOperation(value = "更新供应商信息")
    public Supplier updateSupplierById(@RequestBody Supplier supplier){
        if(supplierService.update(supplier)!=null){
            System.out.println("修改成功");
            return supplierService.update(supplier);
        }
        return null;
    }


    /**
     * 查询分页供应商信息
     * @param offset
     * @param limit
     * @return
     */
    @PostMapping("/selectLimitSupplier")
    @ApiOperation(value = "查询分页供应商信息")
    public List<Supplier> selectLimitSupplier(@RequestParam int offset, @RequestParam int limit){
        if(supplierService.queryAllByLimit(offset,limit)!=null){
            System.out.println("查询成功");
            return supplierService.queryAllByLimit(offset,limit);
        }
        return null;
    }

}

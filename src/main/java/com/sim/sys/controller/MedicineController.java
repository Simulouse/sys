package com.sim.sys.controller;

import com.alibaba.fastjson.JSON;
import com.sim.sys.entity.Medicine;
import com.sim.sys.service.impl.MedicineService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/medicine")
public class MedicineController {

    @Resource
    private MedicineService medicineService;


    /**
     * 添加药品
     * @param medicine
     * @return
     */
    @PostMapping("/insertMedicine")
    @ApiOperation(value = "添加药品")
    public String insertMedicine(@RequestBody Medicine medicine){
        return JSON.toJSONString(medicineService.insert(medicine));
    }

    /**
     * 删除药品
     * @param medicineId
     * @return
     */
    @PostMapping("/deleteMedicineById")
    @ApiOperation(value = "删除药品")
    public String deleteMedicineById(@RequestParam String medicineId){
        if(medicineService.deleteById(medicineId)){
            System.out.println("删除成功");
            return "ok";
        }
        return "no";
    }

    /**
     * 更新药品信息
     * @param medicine
     * @return
     */
    @PostMapping("/updateMedicineById")
    @ApiOperation(value = "更新药品信息")
    public Medicine updateMedicineById(@RequestBody Medicine medicine){
        if(medicineService.update(medicine)!=null){
            System.out.println("修改成功");
            return medicineService.update(medicine);
        }
        return null;
    }


    @GetMapping("/selectMedicineById")
    @ApiOperation(value = "查询药品数量")
    public int selectMedicineNum(@RequestParam String medicineId){
        return medicineService.queryNumById(medicineId);
    }

    @PostMapping("/queryExpiredMedicine")
    @ApiOperation(value = "查询过期药品")
    public List<Medicine> queryExpiredMedicine(){
        return medicineService.queryExpiredMedicine();
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    @ApiOperation(value = "查询单条订单")
    public Medicine selectOne(String id){
        return this.medicineService.queryById(id);
    }

    /**
     * 查询分页药品信息
     * @param offset
     * @param limit
     * @return
     */
    @PostMapping("/selectLimitMedicine")
    @ApiOperation(value = "查询分页药品信息")
    public List<Medicine> selectLimitMedicine(@RequestParam int offset, @RequestParam int limit){
        if(medicineService.queryAllByLimit(offset,limit)!=null){
            System.out.println("查询成功");
            return medicineService.queryAllByLimit(offset,limit);
        }
        return null;
    }
}

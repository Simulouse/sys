package com.sim.sys.controller;

import com.alibaba.fastjson.JSON;
import com.sim.sys.entity.Medicine;
import com.sim.sys.service.impl.MedicineServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/medicine")
public class MedicineController {

    @Resource
    private MedicineServiceImpl medicineService;


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

    @PostMapping("/selectAllMedicine")
    @ApiOperation(value = "查询药品信息")
    public List<Medicine> selectAllMedicine(@RequestParam int offset, @RequestParam int limit){
        if(medicineService.queryAllByLimit(offset,limit)!=null){
            System.out.println("查询成功");
            return medicineService.queryAllByLimit(offset,limit);
        }
        return null;
    }

}

package com.sim.sys.controller;

import com.sim.sys.entity.Medicine;
import com.sim.sys.service.impl.AdminServiceImpl;
import com.sim.sys.service.impl.MedicineServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.MediaName;
import java.util.List;

/**
 * @author:
 * @date： 2021/4/21 15:03
 */
@RestController
@CrossOrigin(value = "*")
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminServiceImpl adminService;
    @Autowired
    MedicineServiceImpl medicineService;

    /**
     * 登陆
     * @param account
     * @param password
     * @return
     */
    @GetMapping("/signIn")
    @ApiOperation(value = "登录")
    public String  verifyUserSignIn(@RequestParam String account, @RequestParam String password){
        if(adminService.verifyUser(account,password)!=null){
            System.out.println("登陆成功");
            return "ok";
        }
        return "no";
    }

    /**
     * 添加药品
     * @param medicine
     * @return
     */
    @PostMapping("/medicine/insertMedicine")
    @ApiOperation(value = "添加药品")
    public String insertMedicine(@RequestBody Medicine medicine){
        if(medicineService.insert(medicine)!=null){
            System.out.println("添加成功");
            return "ok";
        }
        return "no";
    }

    /**
     * 删除药品
     * @param medicineId
     * @return
     */
    @PostMapping("/medicine/deleteMedicineById")
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
    @PostMapping("/medicine/updateMedicineById")
    @ApiOperation(value = "更新药品信息")
    public Medicine updateMedicineById(@RequestBody Medicine medicine){
        if(medicineService.update(medicine)!=null){
            System.out.println("修改成功");
            return medicineService.update(medicine);
        }
        return null;
    }

    @PostMapping("/medicine/selectAllMedicine")
    @ApiOperation(value = "查询药品信息")
    public List<Medicine> selectAllMedicine(@RequestParam int offset,@RequestParam int limit){
        if(medicineService.queryAllByLimit(offset,limit)!=null){
            System.out.println("查询成功");
            return medicineService.queryAllByLimit(offset,limit);
        }
        return null;
    }



}

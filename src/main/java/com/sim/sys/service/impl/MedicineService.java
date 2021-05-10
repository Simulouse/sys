package com.sim.sys.service.impl;

import com.sim.sys.dao.MedicineDao;
import com.sim.sys.entity.Medicine;
import com.sim.sys.entity.Result;
import com.sim.sys.service.IMedicineService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("medicineService")
public class MedicineService implements IMedicineService {
    @Resource
    private MedicineDao medicineDao;

    @Override
    public List<Medicine> findAllByFilter(Medicine medicine) {
        return medicineDao.findAllMedicineByFilter(medicine);
    }

    @Override
    public Result insert(Medicine medicine) {
        Result result = new Result();
        result.setResult("ok");

        if (medicineDao.findMedicineById(medicine.getMedicineId()) != null) {
            result.setResult("no");
            return result;
        }

        if (medicineDao.insertMedicine(medicine) == 0) result.setResult("no");


        return result;
    }

    @Override
    public Result update(Medicine medicine, String oldMedicineId) {
        Result result = new Result();
        result.setResult("yes");

        if (medicineDao.updateMedicineById(medicine, oldMedicineId) == 0) result.setResult("no");

        return result;

    }

    @Override
    public Result delete(String medicineId) {
        Result result = new Result();
        result.setResult("ok");

        if (this.medicineDao.findMedicineById(medicineId) == null)
            return result;

        if (medicineDao.deleteMedicineById(medicineId) == 0) result.setResult("no");

        return result;

    }



}

package com.sim.sys.service;

import com.sim.sys.entity.Medicine;
import com.sim.sys.entity.Result;

import java.util.List;


public interface IMedicineService {

    public List<Medicine> findAllByFilter(Medicine medicine);

    public Result insert(Medicine medicine);

    public Result update(Medicine medicine, String oldMedicineId);

    public Result delete(String medicineId);

}

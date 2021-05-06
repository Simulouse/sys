package com.sim.sys.dao;

import com.sim.sys.entity.Medicine;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface MedicineDao {

    Medicine findMedicineById(@Param("medicineId") String medicineId);

    List<Medicine> findAllMedicineByFilter(Medicine medicine);

    int insertMedicine(Medicine medicine);

    int updateMedicineById(Medicine medicine, @Param("oldMedicineId") String oldMedicineId);

    int deleteMedicineById(@Param("medicineId") String medicineId);

}


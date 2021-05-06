package com.sim.sys.entity;

import java.util.Date;
import java.io.Serializable;


public class Medicine implements Serializable {
    private static final long serialVersionUID = 211268493863002732L;

    private String medicineId;

    private String medicineName;

    public String getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(String medicineId) {
        this.medicineId = medicineId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }
}
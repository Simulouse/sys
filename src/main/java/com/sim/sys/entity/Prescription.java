package com.sim.sys.entity;

import java.io.Serializable;

/**
 * (Prescription)实体类
 *
 * @author makejava
 * @since 2021-04-23 09:33:31
 */
public class Prescription implements Serializable {
    private static final long serialVersionUID = -11338413822838653L;

    private String id;

    private String medicineId;

    private String medicineName;

    private Integer price;

    private Integer num;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

}

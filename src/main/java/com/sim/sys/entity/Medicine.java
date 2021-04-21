package com.sim.sys.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TbMedicine)实体类
 *
 * @author makejava
 * @since 2021-04-20 09:46:00
 */
public class Medicine implements Serializable {
    private static final long serialVersionUID = 211268493863002732L;

    private String medicineId;

    private String name;

    private Double price;

    private Integer restNums;

    private Date expiredTime;


    public String getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(String medicineId) {
        this.medicineId = medicineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getRestNums() {
        return restNums;
    }

    public void setRestNums(Integer restNums) {
        this.restNums = restNums;
    }

    public Date getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Date expiredTime) {
        this.expiredTime = expiredTime;
    }

}

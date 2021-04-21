package com.sim.sys.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TbOrder)实体类
 *
 * @author makejava
 * @since 2021-04-20 09:46:17
 */
public class Order implements Serializable {
    private static final long serialVersionUID = -68656071467224494L;

    private String orderId;

    private String pharmacistId;

    private String supplierId;

    private String medicineId;

    private Integer nums;

    private Date time;

    private Integer state;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPharmacistId() {
        return pharmacistId;
    }

    public void setPharmacistId(String pharmacistId) {
        this.pharmacistId = pharmacistId;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(String medicineId) {
        this.medicineId = medicineId;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

}

package com.sim.sys.entity;

import java.io.Serializable;
import java.util.List;

/**
 * (TbOrder)实体类
 *
 * @author makejava
 * @since 2021-04-20 09:46:17
 */
public class Order implements Serializable {
    private static final long serialVersionUID = -68656071467224494L;

    private String orderId;

    private Pharmacist pharmacist;

    private Supplier supplier;

    private List<OrderMedicine> records;

    private String time;

    private Integer state;

    private MedicineTest filterMedicine;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Pharmacist getPharmacist() {
        return pharmacist;
    }

    public void setPharmacist(Pharmacist pharmacist) {
        this.pharmacist = pharmacist;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public List<OrderMedicine> getRecords() {
        return records;
    }

    public void setRecords(List<OrderMedicine> records) {
        this.records = records;
    }

    public MedicineTest getFilterMedicine() {
        return filterMedicine;
    }

    public void setFilterMedicine(MedicineTest filterMedicine) {
        this.filterMedicine = filterMedicine;
    }
}

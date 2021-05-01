package com.sim.sys.entity;

import java.util.List;

public class Delivery {
    private String deliveryId;
    private Pharmacist pharmacist;
    private String deliveryTime;
    private List<DeliveryMedicine> records;

    private Medicine filterMedicine;

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public Pharmacist getPharmacist() {
        return pharmacist;
    }

    public void setPharmacist(Pharmacist pharmacist) {
        this.pharmacist = pharmacist;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public List<DeliveryMedicine> getRecords() {
        return records;
    }

    public void setRecords(List<DeliveryMedicine> records) {
        this.records = records;
    }

    public Medicine getFilterMedicine() {
        return filterMedicine;
    }

    public void setFilterMedicine(Medicine filterMedicine) {
        this.filterMedicine = filterMedicine;
    }
}

package com.sim.sys.entity;

import java.util.List;

public class Delivery {
    private String deliveryId;
    private Pharmacist pharmacist;
    private String deliveryTime;
    private List<DeliveryStorage> records;

    private Storage filterStorage;

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

    public List<DeliveryStorage> getRecords() {
        return records;
    }

    public void setRecords(List<DeliveryStorage> records) {
        this.records = records;
    }

    public Storage getFilterStorage() {
        return filterStorage;
    }

    public void setFilterStorage(Storage filterStorage) {
        this.filterStorage = filterStorage;
    }
}

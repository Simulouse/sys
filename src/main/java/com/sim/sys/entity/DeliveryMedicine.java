package com.sim.sys.entity;

public class DeliveryMedicine {
    private String deliveryId;
    private Medicine medicine;
    private int nums;

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }
}

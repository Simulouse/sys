package com.sim.sys.entity;

public class OrderMedicine {
    private String orderId;
    private Medicine medicine;
    private int nums;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicineId(Medicine medicine) {
        this.medicine = medicine;
    }

    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }
}

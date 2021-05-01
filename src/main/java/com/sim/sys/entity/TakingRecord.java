package com.sim.sys.entity;

public class TakingRecord {
    private String takeRecordId;
    private String takerId;
    private String storageId;
    private int takeNums;

    private String takeTime;

    public String getTakeRecordId() {
        return takeRecordId;
    }

    public void setTakeRecordId(String takeRecordId) {
        this.takeRecordId = takeRecordId;
    }

    public String getTakerId() {
        return takerId;
    }

    public void setTakerId(String takerId) {
        this.takerId = takerId;
    }

    public String getStorageId() {
        return storageId;
    }

    public void setStorageId(String storageId) {
        this.storageId = storageId;
    }

    public int getTakeNums() {
        return takeNums;
    }

    public void setTakeNums(int takeNums) {
        this.takeNums = takeNums;
    }

    public String getTakeTime() {
        return takeTime;
    }

    public void setTakeTime(String takeTime) {
        this.takeTime = takeTime;
    }
}

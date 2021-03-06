package com.sim.sys.entity;

import java.io.Serializable;


public class Entering implements Serializable {
    private static final long serialVersionUID = -88110460761766315L;

    private String enteringId;

    private String enteringTime;

    private Order order;

    private String orderId;

    public Entering() {

    }

    public Entering(String enteringId, String orderId, String enteringTime) {
        this.enteringId = enteringId;
        this.orderId = orderId;
        this.enteringTime = enteringTime;
    }


    public String getEnteringId() {
        return enteringId;
    }

    public void setEnteringId(String enteringId) {
        this.enteringId = enteringId;
    }

    public String getEnteringTime() {
        return enteringTime;
    }

    public void setEnteringTime(String enteringTime) {
        this.enteringTime = enteringTime;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}

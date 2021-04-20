package com.sim.sys.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TbEntering)实体类
 *
 * @author makejava
 * @since 2021-04-20 09:44:41
 */
public class TbEntering implements Serializable {
    private static final long serialVersionUID = -88110460761766315L;

    private String orderId;

    private Date enteringTime;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getEnteringTime() {
        return enteringTime;
    }

    public void setEnteringTime(Date enteringTime) {
        this.enteringTime = enteringTime;
    }

}

package com.sim.sys.entity;

import java.io.Serializable;

/**
 * (TbSupplier)实体类
 *
 * @author makejava
 * @since 2021-04-20 09:46:55
 */
public class TbSupplier implements Serializable {
    private static final long serialVersionUID = -27923138428396561L;

    private String supplierId;

    private String name;


    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

package com.sim.sys.entity;

import java.io.Serializable;

/**
 * (TbPharmacist)实体类
 *
 * @author makejava
 * @since 2021-04-20 09:46:33
 */
public class Pharmacist extends User implements Serializable {
    private static final long serialVersionUID = -14544306066284092L;

    private String pharmacistId;

    private String password;

    private String name;


    public String getPharmacistId() {
        return pharmacistId;
    }

    public void setPharmacistId(String pharmacistId) {
        this.pharmacistId = pharmacistId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

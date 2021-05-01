package com.sim.sys.entity;

import java.io.Serializable;

/**
 * (TbAdmin)实体类
 *
 * @author makejava
 * @since 2021-04-20 10:11:49
 */
public class Admin implements Serializable {
    private static final long serialVersionUID = 988237113369610325L;

    private String account;

    private String password;

    public Admin(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

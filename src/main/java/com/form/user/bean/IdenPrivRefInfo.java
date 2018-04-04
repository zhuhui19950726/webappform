package com.form.user.bean;

/**
 * 权限身份类
 * Created by Administrator on 2018/4/4.
 */
public class IdenPrivRefInfo {
    //身份
    private String iden;
    //权限Id
    private Long PrivId;

    public String getIden() {
        return iden;
    }

    public void setIden(String iden) {
        this.iden = iden;
    }

    public Long getPrivId() {
        return PrivId;
    }

    public void setPrivId(Long privId) {
        PrivId = privId;
    }
}

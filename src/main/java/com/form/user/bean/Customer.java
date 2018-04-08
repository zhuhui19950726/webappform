package com.form.user.bean;

/**
 * 用户表
 * Created by Administrator on 2018/4/3.
 */
public class Customer {
    //用户主键
    private Long customerId;
    //用户名
    private String customerName;
    //用户密码
    private String customerPwd;
    //电话号码
    private String mobile;
    //地址
    private String address;
    //会员身份
    private String customerIdentify;
    //活动编号
    private Long activId;
    //留言id
    private Long levWordsId;
    //头像
    private String customerImg;
    //删除标记(0或1)
    private String delFlag;

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getCustomerImg() {
        return customerImg;
    }

    public void setCustomerImg(String customerImg) {
        this.customerImg = customerImg;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPwd() {
        return customerPwd;
    }

    public void setCustomerPwd(String customerPwd) {
        this.customerPwd = customerPwd;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerIdentify() {
        return customerIdentify;
    }

    public void setCustomerIdentify(String customerIdentify) {
        this.customerIdentify = customerIdentify;
    }

    public Long getActivId() {
        return activId;
    }

    public void setActivId(Long activId) {
        this.activId = activId;
    }

    public Long getLevWordsId() {
        return levWordsId;
    }

    public void setLevWordsId(Long levWordsId) {
        this.levWordsId = levWordsId;
    }
}

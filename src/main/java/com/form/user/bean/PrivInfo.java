package com.form.user.bean;

/**
 * 权限表
 * Created by zhuhui on 2018/4/4.
 */
public class PrivInfo {
    //主键
    private Long privId;
    //权限名
    private String privName;
    //权限路径
    private String privUrl;
    //图标
    private String privIcon;
    //删除标记(0或1)
    private String delFlag;

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public Long getPrivId() {
        return privId;
    }

    public void setPrivId(Long privId) {
        this.privId = privId;
    }

    public String getPrivName() {
        return privName;
    }

    public void setPrivName(String privName) {
        this.privName = privName;
    }

    public String getPrivUrl() {
        return privUrl;
    }

    public void setPrivUrl(String privUrl) {
        this.privUrl = privUrl;
    }

    public String getPrivIcon() {
        return privIcon;
    }

    public void setPrivIcon(String privIcon) {
        this.privIcon = privIcon;
    }
}

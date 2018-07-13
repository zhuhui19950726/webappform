package com.form.user.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 管理员
 */
@Data
public class Manager implements Serializable {
    /**
     * 管理员ID
     *
     * @see #getId()
     * @see #setId(Long)
     */
    private Long id;
    /**
     * 管理员名称
     *
     * @see #getUsername()
     * @see #setUsername(String)
     */
    private String username;
    /**
     * 管理员密码
     *
     * @see #getUserkey()
     * @see #setUserkey(String)
     */
    private String userkey;
    /**
     * 创建时间
     *
     * @see #getCreateTime()
     * @see #setCreateTime(Date)
     */
    private Date createTime;
    /**
     * 修改时间
     *
     * @see #getModTime()
     * @see #setModTime(Date)
     */
    private Date modTime;
    /**
     * 最后登录时间
     *
     * @see #getLoginTime()
     * @see #setLoginTime(Date)
     */
    private Date loginTime;
    //管理员电话
    private String cellphone;
    //管理员头像
    private String photoImg;
    //管理员身份
    private String identify;
    /**
     * 状态标记
     *
     * @see #getDelFlag()
     * @see #setDelFlag(String)
     */
    private String delFlag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * 获取<code>Manager</code>userkey
     *
     * @return userkey{@link com.form.user.bean.Manager#userkey}
     */
    public String getUserkey() {
        return userkey;
    }
    /**
     * 设置<code>Manager</code>userkey
     *
     * @param userkey
     *            {@link com.form.user.bean.Manager#userkey}
     */
    public void setUserkey(String userkey) {
        this.userkey = userkey;
    }
    /**
     * 获取<code>Manager</code>createTime
     *
     * @return createTime{@link com.form.user.bean.Manager#createTime}
     */
    public Date getCreateTime() {
        if (this.createTime != null) {
            return new Date(this.createTime.getTime());
        }
        return null;
    }
    /**
     * 设置<code>Manager</code>createTime
     *
     * @param createTime
     *     {@link com.form.user.bean.Manager#createTime}
     */
    public void setCreateTime(Date createTime) {
        if (createTime != null) {
            Date tEmp = (Date) createTime.clone();
            if (tEmp != null) {
                this.createTime = tEmp;
            }
        }
    }
    /**
     * 获取<code>Manager</code>modTime
     *
     * @return modTime{@link com.form.user.bean.Manager#modTime}
     */
    public Date getModTime() {
        if (this.modTime != null) {
            return new Date(this.modTime.getTime());
        }
        return null;
    }
    /**
     * 设置<code>Manager</code>modTime
     *
     * @param modTime
     *            {@link com.form.user.bean.Manager#modTime}
     */
    public void setModTime(Date modTime) {
        if (modTime != null) {
            Date tEmp = (Date) modTime.clone();
            if (tEmp != null) {
                this.modTime = tEmp;
            }
        }
    }
    /**
     * 获取<code>Manager</code>loginTime
     *
     * @return loginTime{@link com.form.user.bean.Manager#loginTime}
     */
    public Date getLoginTime() {
        if (this.loginTime != null) {
            return new Date(this.loginTime.getTime());
        }
        return null;
    }
    /**
     * 设置<code>Manager</code>loginTime
     *
     * @param loginTime
     *            {@link com.form.user.bean.Manager#loginTime}
     */
    public void setLoginTime(Date loginTime) {
        if (loginTime != null) {
            Date tEmp = (Date) loginTime.clone();
            if (tEmp != null) {
                this.loginTime = tEmp;
            }
        }
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getPhotoImg() {
        return photoImg;
    }

    public void setPhotoImg(String photoImg) {
        this.photoImg = photoImg;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }
    /**
     * 获取<code>Manager</code>delFlag
     *
     * @return delFlag{@link com.form.user.bean.Manager#delFlag}
     */
    public String getDelFlag() {
        return delFlag;
    }
    /**
     * 设置<code>Manager</code>delFlag
     *
     * @param delFlag
     *            {@link com.form.user.bean.Manager#delFlag}
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
}
package com.form.activity.bean;

import java.math.BigDecimal;

/**
 * 活动表
 */
public class FormActivity {
    //主键
    private Long id;
    //活动编号
    private Long activityId;
    //活动名
    private String activityName;
    //活动类型
    private String category;
    //图片路径
    private String imgPath;
    //活动描述
    private String description;
    //优惠政策
    private String favouPolicy;
    //活动价格
    private BigDecimal activPrice;
    //活动的成本价格
    private BigDecimal activCostprice;
    //活动的地点
    private String activLocation;
    //删除标记
    private String delFlag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath == null ? null : imgPath.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getFavouPolicy() {
        return favouPolicy;
    }

    public void setFavouPolicy(String favouPolicy) {
        this.favouPolicy = favouPolicy == null ? null : favouPolicy.trim();
    }

    public BigDecimal getActivPrice() {
        return activPrice;
    }

    public void setActivPrice(BigDecimal activPrice) {
        this.activPrice = activPrice;
    }

    public BigDecimal getActivCostprice() {
        return activCostprice;
    }

    public void setActivCostprice(BigDecimal activCostprice) {
        this.activCostprice = activCostprice;
    }

    public String getActivLocation() {
        return activLocation;
    }

    public void setActivLocation(String activLocation) {
        this.activLocation = activLocation == null ? null : activLocation.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}
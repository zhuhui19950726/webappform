package com.form.activity.bean;

import java.math.BigDecimal;

/**
 * 农庄活动信息
 * Created by Administrator on 2018/4/4.
 */
public class FormActivity {
    //主键
    private Long id;
    //活动编号
    private Long activityId;
    //活动名
    private String activityName;
    //活动的类型
    private String category;
    //活动图片的路径
    private String imgPath;
    //活动的描述
    private String description;
    //优惠政策
    private String favouPolicy;
    //活动的销售价格
    private BigDecimal activPrice;
    //活动的成本价格
    private BigDecimal activCostPrice;
    //活动的地点
    private String activLocation;

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
        this.activityName = activityName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFavouPolicy() {
        return favouPolicy;
    }

    public void setFavouPolicy(String favouPolicy) {
        this.favouPolicy = favouPolicy;
    }

    public BigDecimal getActivPrice() {
        return activPrice;
    }

    public void setActivPrice(BigDecimal activPrice) {
        this.activPrice = activPrice;
    }

    public BigDecimal getActivCostPrice() {
        return activCostPrice;
    }

    public void setActivCostPrice(BigDecimal activCostPrice) {
        this.activCostPrice = activCostPrice;
    }

    public String getActivLocation() {
        return activLocation;
    }

    public void setActivLocation(String activLocation) {
        this.activLocation = activLocation;
    }
}

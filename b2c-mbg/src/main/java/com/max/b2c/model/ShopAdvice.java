package com.max.b2c.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ShopAdvice implements Serializable {
    @ApiModelProperty(value = "通知id")
    private Integer advice_id;

    @ApiModelProperty(value = "店铺id")
    private Integer shop_id;

    @ApiModelProperty(value = "店铺通知栏内容")
    private String advice_detail;

    private Date gmt_create;

    private Date gmt_modified;

    private static final long serialVersionUID = 1L;

    public Integer getAdvice_id() {
        return advice_id;
    }

    public void setAdvice_id(Integer advice_id) {
        this.advice_id = advice_id;
    }

    public Integer getShop_id() {
        return shop_id;
    }

    public void setShop_id(Integer shop_id) {
        this.shop_id = shop_id;
    }

    public String getAdvice_detail() {
        return advice_detail;
    }

    public void setAdvice_detail(String advice_detail) {
        this.advice_detail = advice_detail == null ? null : advice_detail.trim();
    }

    public Date getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    public Date getGmt_modified() {
        return gmt_modified;
    }

    public void setGmt_modified(Date gmt_modified) {
        this.gmt_modified = gmt_modified;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", advice_id=").append(advice_id);
        sb.append(", shop_id=").append(shop_id);
        sb.append(", advice_detail=").append(advice_detail);
        sb.append(", gmt_create=").append(gmt_create);
        sb.append(", gmt_modified=").append(gmt_modified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
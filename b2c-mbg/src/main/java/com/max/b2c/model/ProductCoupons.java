package com.max.b2c.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ProductCoupons implements Serializable {
    @ApiModelProperty(value = "优惠券id")
    private Integer coupon_id;

    @ApiModelProperty(value = "优惠券类型")
    private Integer coupon_type;

    @ApiModelProperty(value = "是否适用于商品")
    private Integer isfor_product;

    @ApiModelProperty(value = "是否适用于店铺")
    private Integer isfor_shop;

    @ApiModelProperty(value = "是否适用于平台")
    private String isfor_all;

    @ApiModelProperty(value = "优惠券名称")
    private String coupon_name;

    @ApiModelProperty(value = "优惠券内容")
    private String coupon_detail;

    @ApiModelProperty(value = "优惠价格")
    private Integer coupon_price;

    @ApiModelProperty(value = "优惠券数量")
    private Integer coupon_quantity;

    @ApiModelProperty(value = "有用期起止时间")
    private Date coupon_starttime;

    @ApiModelProperty(value = "有用期截止时间")
    private Date coupon_endtime;

    private Date gmt_create;

    private Date gmt_modified;

    private static final long serialVersionUID = 1L;

    public Integer getCoupon_id() {
        return coupon_id;
    }

    public void setCoupon_id(Integer coupon_id) {
        this.coupon_id = coupon_id;
    }

    public Integer getCoupon_type() {
        return coupon_type;
    }

    public void setCoupon_type(Integer coupon_type) {
        this.coupon_type = coupon_type;
    }

    public Integer getIsfor_product() {
        return isfor_product;
    }

    public void setIsfor_product(Integer isfor_product) {
        this.isfor_product = isfor_product;
    }

    public Integer getIsfor_shop() {
        return isfor_shop;
    }

    public void setIsfor_shop(Integer isfor_shop) {
        this.isfor_shop = isfor_shop;
    }

    public String getIsfor_all() {
        return isfor_all;
    }

    public void setIsfor_all(String isfor_all) {
        this.isfor_all = isfor_all == null ? null : isfor_all.trim();
    }

    public String getCoupon_name() {
        return coupon_name;
    }

    public void setCoupon_name(String coupon_name) {
        this.coupon_name = coupon_name == null ? null : coupon_name.trim();
    }

    public String getCoupon_detail() {
        return coupon_detail;
    }

    public void setCoupon_detail(String coupon_detail) {
        this.coupon_detail = coupon_detail == null ? null : coupon_detail.trim();
    }

    public Integer getCoupon_price() {
        return coupon_price;
    }

    public void setCoupon_price(Integer coupon_price) {
        this.coupon_price = coupon_price;
    }

    public Integer getCoupon_quantity() {
        return coupon_quantity;
    }

    public void setCoupon_quantity(Integer coupon_quantity) {
        this.coupon_quantity = coupon_quantity;
    }

    public Date getCoupon_starttime() {
        return coupon_starttime;
    }

    public void setCoupon_starttime(Date coupon_starttime) {
        this.coupon_starttime = coupon_starttime;
    }

    public Date getCoupon_endtime() {
        return coupon_endtime;
    }

    public void setCoupon_endtime(Date coupon_endtime) {
        this.coupon_endtime = coupon_endtime;
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
        sb.append(", coupon_id=").append(coupon_id);
        sb.append(", coupon_type=").append(coupon_type);
        sb.append(", isfor_product=").append(isfor_product);
        sb.append(", isfor_shop=").append(isfor_shop);
        sb.append(", isfor_all=").append(isfor_all);
        sb.append(", coupon_name=").append(coupon_name);
        sb.append(", coupon_detail=").append(coupon_detail);
        sb.append(", coupon_price=").append(coupon_price);
        sb.append(", coupon_quantity=").append(coupon_quantity);
        sb.append(", coupon_starttime=").append(coupon_starttime);
        sb.append(", coupon_endtime=").append(coupon_endtime);
        sb.append(", gmt_create=").append(gmt_create);
        sb.append(", gmt_modified=").append(gmt_modified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
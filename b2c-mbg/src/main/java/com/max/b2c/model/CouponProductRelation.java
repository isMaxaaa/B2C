package com.max.b2c.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class CouponProductRelation implements Serializable {
    @ApiModelProperty(value = "关系id")
    private Integer id;

    @ApiModelProperty(value = "优惠券id")
    private Integer coupon_id;

    @ApiModelProperty(value = "产品id")
    private Integer product_id;

    @ApiModelProperty(value = "店铺id")
    private Integer shop_id;

    @ApiModelProperty(value = "产品编码")
    private String product_code;

    private String gmt_create;

    private String gmt_modified;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCoupon_id() {
        return coupon_id;
    }

    public void setCoupon_id(Integer coupon_id) {
        this.coupon_id = coupon_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getShop_id() {
        return shop_id;
    }

    public void setShop_id(Integer shop_id) {
        this.shop_id = shop_id;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code == null ? null : product_code.trim();
    }

    public String getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(String gmt_create) {
        this.gmt_create = gmt_create == null ? null : gmt_create.trim();
    }

    public String getGmt_modified() {
        return gmt_modified;
    }

    public void setGmt_modified(String gmt_modified) {
        this.gmt_modified = gmt_modified == null ? null : gmt_modified.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", coupon_id=").append(coupon_id);
        sb.append(", product_id=").append(product_id);
        sb.append(", shop_id=").append(shop_id);
        sb.append(", product_code=").append(product_code);
        sb.append(", gmt_create=").append(gmt_create);
        sb.append(", gmt_modified=").append(gmt_modified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
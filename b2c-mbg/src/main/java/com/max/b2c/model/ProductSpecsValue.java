package com.max.b2c.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ProductSpecsValue implements Serializable {
    @ApiModelProperty(value = "商品规格值id")
    private Integer value_id;

    @ApiModelProperty(value = "规格值")
    private String specs_value;

    @ApiModelProperty(value = "商品spuid")
    private Integer product_id;

    @ApiModelProperty(value = "规格名id")
    private Integer specs_id;

    private Date gmt_create;

    private Date gmt_modified;

    @ApiModelProperty(value = "是否为sku属性")
    private Integer is_sku;

    private static final long serialVersionUID = 1L;

    public Integer getValue_id() {
        return value_id;
    }

    public void setValue_id(Integer value_id) {
        this.value_id = value_id;
    }

    public String getSpecs_value() {
        return specs_value;
    }

    public void setSpecs_value(String specs_value) {
        this.specs_value = specs_value == null ? null : specs_value.trim();
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getSpecs_id() {
        return specs_id;
    }

    public void setSpecs_id(Integer specs_id) {
        this.specs_id = specs_id;
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

    public Integer getIs_sku() {
        return is_sku;
    }

    public void setIs_sku(Integer is_sku) {
        this.is_sku = is_sku;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", value_id=").append(value_id);
        sb.append(", specs_value=").append(specs_value);
        sb.append(", product_id=").append(product_id);
        sb.append(", specs_id=").append(specs_id);
        sb.append(", gmt_create=").append(gmt_create);
        sb.append(", gmt_modified=").append(gmt_modified);
        sb.append(", is_sku=").append(is_sku);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
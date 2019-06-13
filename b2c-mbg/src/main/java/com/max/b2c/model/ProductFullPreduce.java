package com.max.b2c.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ProductFullPreduce implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "商品id")
    private Integer product_id;

    @ApiModelProperty(value = "满减价格界定")
    private BigDecimal full_price;

    @ApiModelProperty(value = "满减的价格")
    private BigDecimal reduce_price;

    private Date gmt_create;

    private Date gmt_modified;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public BigDecimal getFull_price() {
        return full_price;
    }

    public void setFull_price(BigDecimal full_price) {
        this.full_price = full_price;
    }

    public BigDecimal getReduce_price() {
        return reduce_price;
    }

    public void setReduce_price(BigDecimal reduce_price) {
        this.reduce_price = reduce_price;
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
        sb.append(", id=").append(id);
        sb.append(", product_id=").append(product_id);
        sb.append(", full_price=").append(full_price);
        sb.append(", reduce_price=").append(reduce_price);
        sb.append(", gmt_create=").append(gmt_create);
        sb.append(", gmt_modified=").append(gmt_modified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
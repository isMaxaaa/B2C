package com.max.b2c.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ProductSeckillRelation implements Serializable {
    @ApiModelProperty(value = "关系id")
    private Integer id;

    @ApiModelProperty(value = "商品spuid")
    private Integer product_spuid;

    @ApiModelProperty(value = "商品skuid")
    private Integer product_skuid;

    @ApiModelProperty(value = "秒杀id")
    private Integer seckill_id;

    private Date gmt_create;

    private Date gmt_modified;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProduct_spuid() {
        return product_spuid;
    }

    public void setProduct_spuid(Integer product_spuid) {
        this.product_spuid = product_spuid;
    }

    public Integer getProduct_skuid() {
        return product_skuid;
    }

    public void setProduct_skuid(Integer product_skuid) {
        this.product_skuid = product_skuid;
    }

    public Integer getSeckill_id() {
        return seckill_id;
    }

    public void setSeckill_id(Integer seckill_id) {
        this.seckill_id = seckill_id;
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
        sb.append(", product_spuid=").append(product_spuid);
        sb.append(", product_skuid=").append(product_skuid);
        sb.append(", seckill_id=").append(seckill_id);
        sb.append(", gmt_create=").append(gmt_create);
        sb.append(", gmt_modified=").append(gmt_modified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.max.b2c.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ProductSku implements Serializable {
    @ApiModelProperty(value = "商品skuid")
    private Integer product_skuid;

    @ApiModelProperty(value = "sku描述")
    private String sku_description;

    @ApiModelProperty(value = "sku库存")
    private Integer stock;

    @ApiModelProperty(value = "sku价格")
    private BigDecimal price;

    private Date gmt_create;

    private Date gmt_modified;

    @ApiModelProperty(value = "商品id")
    private Integer product_id;

    @ApiModelProperty(value = "sku编码")
    private String sku_code;

    @ApiModelProperty(value = "销量")
    private Integer sale;

    private static final long serialVersionUID = 1L;

    public Integer getProduct_skuid() {
        return product_skuid;
    }

    public void setProduct_skuid(Integer product_skuid) {
        this.product_skuid = product_skuid;
    }

    public String getSku_description() {
        return sku_description;
    }

    public void setSku_description(String sku_description) {
        this.sku_description = sku_description == null ? null : sku_description.trim();
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getSku_code() {
        return sku_code;
    }

    public void setSku_code(String sku_code) {
        this.sku_code = sku_code == null ? null : sku_code.trim();
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", product_skuid=").append(product_skuid);
        sb.append(", sku_description=").append(sku_description);
        sb.append(", stock=").append(stock);
        sb.append(", price=").append(price);
        sb.append(", gmt_create=").append(gmt_create);
        sb.append(", gmt_modified=").append(gmt_modified);
        sb.append(", product_id=").append(product_id);
        sb.append(", sku_code=").append(sku_code);
        sb.append(", sale=").append(sale);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
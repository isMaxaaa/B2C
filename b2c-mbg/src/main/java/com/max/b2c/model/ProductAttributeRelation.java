package com.max.b2c.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ProductAttributeRelation implements Serializable {
    @ApiModelProperty(value = "关系id")
    private Integer id;

    @ApiModelProperty(value = "商品属性名id")
    private Integer attribute_id;

    @ApiModelProperty(value = "商品spuid")
    private Integer productspu_id;

    private Date gmt_create;

    private Date gmt_modified;

    @ApiModelProperty(value = "商品属性值id")
    private Integer attributevalue_id;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAttribute_id() {
        return attribute_id;
    }

    public void setAttribute_id(Integer attribute_id) {
        this.attribute_id = attribute_id;
    }

    public Integer getProductspu_id() {
        return productspu_id;
    }

    public void setProductspu_id(Integer productspu_id) {
        this.productspu_id = productspu_id;
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

    public Integer getAttributevalue_id() {
        return attributevalue_id;
    }

    public void setAttributevalue_id(Integer attributevalue_id) {
        this.attributevalue_id = attributevalue_id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", attribute_id=").append(attribute_id);
        sb.append(", productspu_id=").append(productspu_id);
        sb.append(", gmt_create=").append(gmt_create);
        sb.append(", gmt_modified=").append(gmt_modified);
        sb.append(", attributevalue_id=").append(attributevalue_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
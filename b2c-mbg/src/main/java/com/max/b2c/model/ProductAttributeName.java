package com.max.b2c.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ProductAttributeName implements Serializable {
    @ApiModelProperty(value = "商品属性id")
    private Integer attribution_id;

    @ApiModelProperty(value = "商品属性名")
    private String attribution_name;

    @ApiModelProperty(value = "是否是搜索属性")
    private Integer is_searched;

    @ApiModelProperty(value = "是否为销售属性")
    private Integer is_saled;

    @ApiModelProperty(value = "是否为sku属性")
    private Integer is_sku;

    @ApiModelProperty(value = "排序参数")
    private Integer sort;

    private Date gmt_create;

    private Date gmt_modified;

    private static final long serialVersionUID = 1L;

    public Integer getAttribution_id() {
        return attribution_id;
    }

    public void setAttribution_id(Integer attribution_id) {
        this.attribution_id = attribution_id;
    }

    public String getAttribution_name() {
        return attribution_name;
    }

    public void setAttribution_name(String attribution_name) {
        this.attribution_name = attribution_name == null ? null : attribution_name.trim();
    }

    public Integer getIs_searched() {
        return is_searched;
    }

    public void setIs_searched(Integer is_searched) {
        this.is_searched = is_searched;
    }

    public Integer getIs_saled() {
        return is_saled;
    }

    public void setIs_saled(Integer is_saled) {
        this.is_saled = is_saled;
    }

    public Integer getIs_sku() {
        return is_sku;
    }

    public void setIs_sku(Integer is_sku) {
        this.is_sku = is_sku;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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
        sb.append(", attribution_id=").append(attribution_id);
        sb.append(", attribution_name=").append(attribution_name);
        sb.append(", is_searched=").append(is_searched);
        sb.append(", is_saled=").append(is_saled);
        sb.append(", is_sku=").append(is_sku);
        sb.append(", sort=").append(sort);
        sb.append(", gmt_create=").append(gmt_create);
        sb.append(", gmt_modified=").append(gmt_modified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
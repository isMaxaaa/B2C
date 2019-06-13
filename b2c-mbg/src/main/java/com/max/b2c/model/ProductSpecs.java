package com.max.b2c.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ProductSpecs implements Serializable {
    @ApiModelProperty(value = "商品类目规格id")
    private Integer specs_id;

    @ApiModelProperty(value = "规格名")
    private String specs_name;

    private Date gmt_create;

    private Date gmt_modified;

    @ApiModelProperty(value = "是否为搜索规格属性")
    private Integer is_searched;

    @ApiModelProperty(value = "是否为销售规格属性")
    private Integer is_saled;

    @ApiModelProperty(value = "类目id")
    private Integer category_id;

    @ApiModelProperty(value = "排序参数")
    private Integer sortid;

    @ApiModelProperty(value = "是否为sku规格属性")
    private Integer is_sku;

    private static final long serialVersionUID = 1L;

    public Integer getSpecs_id() {
        return specs_id;
    }

    public void setSpecs_id(Integer specs_id) {
        this.specs_id = specs_id;
    }

    public String getSpecs_name() {
        return specs_name;
    }

    public void setSpecs_name(String specs_name) {
        this.specs_name = specs_name == null ? null : specs_name.trim();
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

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public Integer getSortid() {
        return sortid;
    }

    public void setSortid(Integer sortid) {
        this.sortid = sortid;
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
        sb.append(", specs_id=").append(specs_id);
        sb.append(", specs_name=").append(specs_name);
        sb.append(", gmt_create=").append(gmt_create);
        sb.append(", gmt_modified=").append(gmt_modified);
        sb.append(", is_searched=").append(is_searched);
        sb.append(", is_saled=").append(is_saled);
        sb.append(", category_id=").append(category_id);
        sb.append(", sortid=").append(sortid);
        sb.append(", is_sku=").append(is_sku);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
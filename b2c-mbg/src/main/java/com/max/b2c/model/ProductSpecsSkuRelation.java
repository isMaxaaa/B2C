package com.max.b2c.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ProductSpecsSkuRelation implements Serializable {
    @ApiModelProperty(value = "sku属性关系id")
    private Integer id;

    @ApiModelProperty(value = "规格属性id")
    private Integer specs_id;

    @ApiModelProperty(value = "商品skuid")
    private Integer skuid;

    private Date gmt_create;

    private Date gmt_modified;

    @ApiModelProperty(value = "规格属性值id")
    private Integer specs_valueid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpecs_id() {
        return specs_id;
    }

    public void setSpecs_id(Integer specs_id) {
        this.specs_id = specs_id;
    }

    public Integer getSkuid() {
        return skuid;
    }

    public void setSkuid(Integer skuid) {
        this.skuid = skuid;
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

    public Integer getSpecs_valueid() {
        return specs_valueid;
    }

    public void setSpecs_valueid(Integer specs_valueid) {
        this.specs_valueid = specs_valueid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", specs_id=").append(specs_id);
        sb.append(", skuid=").append(skuid);
        sb.append(", gmt_create=").append(gmt_create);
        sb.append(", gmt_modified=").append(gmt_modified);
        sb.append(", specs_valueid=").append(specs_valueid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
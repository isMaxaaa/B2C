package com.max.b2c.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ProductBrand implements Serializable {
    @ApiModelProperty(value = "商品品牌id")
    private Integer brand_id;

    @ApiModelProperty(value = "品牌名称")
    private String brand_name;

    @ApiModelProperty(value = "排序参数")
    private Integer sort;

    @ApiModelProperty(value = "品牌logo")
    private String logo;

    @ApiModelProperty(value = "是否为品牌制造商")
    private Integer factory_status;

    @ApiModelProperty(value = "审核状态")
    private Integer brand_chec;

    private Date gmt_create;

    private Date gmt_modified;

    private static final long serialVersionUID = 1L;

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        this.brand_id = brand_id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name == null ? null : brand_name.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public Integer getFactory_status() {
        return factory_status;
    }

    public void setFactory_status(Integer factory_status) {
        this.factory_status = factory_status;
    }

    public Integer getBrand_chec() {
        return brand_chec;
    }

    public void setBrand_chec(Integer brand_chec) {
        this.brand_chec = brand_chec;
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
        sb.append(", brand_id=").append(brand_id);
        sb.append(", brand_name=").append(brand_name);
        sb.append(", sort=").append(sort);
        sb.append(", logo=").append(logo);
        sb.append(", factory_status=").append(factory_status);
        sb.append(", brand_chec=").append(brand_chec);
        sb.append(", gmt_create=").append(gmt_create);
        sb.append(", gmt_modified=").append(gmt_modified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
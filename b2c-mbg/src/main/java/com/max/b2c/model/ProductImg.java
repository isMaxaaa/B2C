package com.max.b2c.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ProductImg implements Serializable {
    @ApiModelProperty(value = "图片id")
    private Integer img_id;

    @ApiModelProperty(value = "图片url")
    private String img_url;

    @ApiModelProperty(value = "是否为主图")
    private Integer is_mainimg;

    private Integer spu_id;

    private Integer sku_id;

    private Date gmt_create;

    private Date gmt_modified;

    private static final long serialVersionUID = 1L;

    public Integer getImg_id() {
        return img_id;
    }

    public void setImg_id(Integer img_id) {
        this.img_id = img_id;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url == null ? null : img_url.trim();
    }

    public Integer getIs_mainimg() {
        return is_mainimg;
    }

    public void setIs_mainimg(Integer is_mainimg) {
        this.is_mainimg = is_mainimg;
    }

    public Integer getSpu_id() {
        return spu_id;
    }

    public void setSpu_id(Integer spu_id) {
        this.spu_id = spu_id;
    }

    public Integer getSku_id() {
        return sku_id;
    }

    public void setSku_id(Integer sku_id) {
        this.sku_id = sku_id;
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
        sb.append(", img_id=").append(img_id);
        sb.append(", img_url=").append(img_url);
        sb.append(", is_mainimg=").append(is_mainimg);
        sb.append(", spu_id=").append(spu_id);
        sb.append(", sku_id=").append(sku_id);
        sb.append(", gmt_create=").append(gmt_create);
        sb.append(", gmt_modified=").append(gmt_modified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
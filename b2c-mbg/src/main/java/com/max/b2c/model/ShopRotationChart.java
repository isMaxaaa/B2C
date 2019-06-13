package com.max.b2c.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ShopRotationChart implements Serializable {
    @ApiModelProperty(value = "店铺轮播图id")
    private Integer id;

    @ApiModelProperty(value = "店铺id")
    private Integer shop_id;

    @ApiModelProperty(value = "轮播图地址")
    private String img_url;

    @ApiModelProperty(value = "是否为主图")
    private Integer is_main;

    private Date gmt_createc;

    private Date gmt_modified;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShop_id() {
        return shop_id;
    }

    public void setShop_id(Integer shop_id) {
        this.shop_id = shop_id;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url == null ? null : img_url.trim();
    }

    public Integer getIs_main() {
        return is_main;
    }

    public void setIs_main(Integer is_main) {
        this.is_main = is_main;
    }

    public Date getGmt_createc() {
        return gmt_createc;
    }

    public void setGmt_createc(Date gmt_createc) {
        this.gmt_createc = gmt_createc;
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
        sb.append(", shop_id=").append(shop_id);
        sb.append(", img_url=").append(img_url);
        sb.append(", is_main=").append(is_main);
        sb.append(", gmt_createc=").append(gmt_createc);
        sb.append(", gmt_modified=").append(gmt_modified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
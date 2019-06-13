package com.max.b2c.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SellerShop implements Serializable {
    @ApiModelProperty(value = "店铺id")
    private Integer shop_id;

    @ApiModelProperty(value = "商家id")
    private Integer seller_id;

    @ApiModelProperty(value = "店铺名称")
    private String shop_name;

    @ApiModelProperty(value = "店铺地址")
    private String shop_addr;

    @ApiModelProperty(value = "店铺背景风格选择")
    private Integer shop_style;

    private Date gmt_create;

    private Date gmt_modified;

    @ApiModelProperty(value = "店铺销售类别")
    private Integer sale_category;

    @ApiModelProperty(value = "是否处于黑名单")
    private Integer is_inblacklist;

    private static final long serialVersionUID = 1L;

    public Integer getShop_id() {
        return shop_id;
    }

    public void setShop_id(Integer shop_id) {
        this.shop_id = shop_id;
    }

    public Integer getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(Integer seller_id) {
        this.seller_id = seller_id;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name == null ? null : shop_name.trim();
    }

    public String getShop_addr() {
        return shop_addr;
    }

    public void setShop_addr(String shop_addr) {
        this.shop_addr = shop_addr == null ? null : shop_addr.trim();
    }

    public Integer getShop_style() {
        return shop_style;
    }

    public void setShop_style(Integer shop_style) {
        this.shop_style = shop_style;
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

    public Integer getSale_category() {
        return sale_category;
    }

    public void setSale_category(Integer sale_category) {
        this.sale_category = sale_category;
    }

    public Integer getIs_inblacklist() {
        return is_inblacklist;
    }

    public void setIs_inblacklist(Integer is_inblacklist) {
        this.is_inblacklist = is_inblacklist;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shop_id=").append(shop_id);
        sb.append(", seller_id=").append(seller_id);
        sb.append(", shop_name=").append(shop_name);
        sb.append(", shop_addr=").append(shop_addr);
        sb.append(", shop_style=").append(shop_style);
        sb.append(", gmt_create=").append(gmt_create);
        sb.append(", gmt_modified=").append(gmt_modified);
        sb.append(", sale_category=").append(sale_category);
        sb.append(", is_inblacklist=").append(is_inblacklist);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
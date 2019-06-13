package com.max.b2c.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ProductCategory implements Serializable {
    @ApiModelProperty(value = "商品类目id")
    private Integer category_id;

    @ApiModelProperty(value = "商品类目名称")
    private String category_name;

    @ApiModelProperty(value = "父类目id")
    private Integer parent_id;

    @ApiModelProperty(value = "排序参数")
    private Integer sort_order;

    private Date gmt_create;

    private Date gmt_modified;

    @ApiModelProperty(value = "分类的级别")
    private Integer level;

    @ApiModelProperty(value = "是否显示在导航栏")
    private Integer nav_status;

    @ApiModelProperty(value = "是否显示")
    private Integer show_status;

    private static final long serialVersionUID = 1L;

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name == null ? null : category_name.trim();
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public Integer getSort_order() {
        return sort_order;
    }

    public void setSort_order(Integer sort_order) {
        this.sort_order = sort_order;
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

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getNav_status() {
        return nav_status;
    }

    public void setNav_status(Integer nav_status) {
        this.nav_status = nav_status;
    }

    public Integer getShow_status() {
        return show_status;
    }

    public void setShow_status(Integer show_status) {
        this.show_status = show_status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", category_id=").append(category_id);
        sb.append(", category_name=").append(category_name);
        sb.append(", parent_id=").append(parent_id);
        sb.append(", sort_order=").append(sort_order);
        sb.append(", gmt_create=").append(gmt_create);
        sb.append(", gmt_modified=").append(gmt_modified);
        sb.append(", level=").append(level);
        sb.append(", nav_status=").append(nav_status);
        sb.append(", show_status=").append(show_status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
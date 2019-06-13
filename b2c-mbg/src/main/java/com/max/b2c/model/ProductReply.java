package com.max.b2c.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ProductReply implements Serializable {
    @ApiModelProperty(value = "商品回复id")
    private Integer reply_id;

    @ApiModelProperty(value = "回复用户名称")
    private String user_name;

    @ApiModelProperty(value = "回复内容")
    private String reply_detail;

    private Date gmt_create;

    private Date gmt_modified;

    private static final long serialVersionUID = 1L;

    public Integer getReply_id() {
        return reply_id;
    }

    public void setReply_id(Integer reply_id) {
        this.reply_id = reply_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    public String getReply_detail() {
        return reply_detail;
    }

    public void setReply_detail(String reply_detail) {
        this.reply_detail = reply_detail == null ? null : reply_detail.trim();
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
        sb.append(", reply_id=").append(reply_id);
        sb.append(", user_name=").append(user_name);
        sb.append(", reply_detail=").append(reply_detail);
        sb.append(", gmt_create=").append(gmt_create);
        sb.append(", gmt_modified=").append(gmt_modified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
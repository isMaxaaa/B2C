package com.max.b2c.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class OrderComment implements Serializable {
    @ApiModelProperty(value = "用户评论id")
    private Integer comment_id;

    @ApiModelProperty(value = "用户id")
    private Integer user_id;

    @ApiModelProperty(value = "评价内容")
    private String comment_detail;

    @ApiModelProperty(value = "服务态度打分")
    private Integer service_score;

    @ApiModelProperty(value = "商品质量打分")
    private Integer quality_score;

    @ApiModelProperty(value = "物流质量打分")
    private Integer  logistics_score;

    @ApiModelProperty(value = "评论图片")
    private String comment_url;

    @ApiModelProperty(value = "评论视频")
    private String comment_mp4;

    private Date gmt_create;

    private Date gmt_modified;

    private static final long serialVersionUID = 1L;

    public Integer getComment_id() {
        return comment_id;
    }

    public void setComment_id(Integer comment_id) {
        this.comment_id = comment_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getComment_detail() {
        return comment_detail;
    }

    public void setComment_detail(String comment_detail) {
        this.comment_detail = comment_detail == null ? null : comment_detail.trim();
    }

    public Integer getService_score() {
        return service_score;
    }

    public void setService_score(Integer service_score) {
        this.service_score = service_score;
    }

    public Integer getQuality_score() {
        return quality_score;
    }

    public void setQuality_score(Integer quality_score) {
        this.quality_score = quality_score;
    }

    public Integer getlogistics_score() {
        return  logistics_score;
    }

    public void setlogistics_score(Integer  logistics_score) {
        this. logistics_score =  logistics_score;
    }

    public String getComment_url() {
        return comment_url;
    }

    public void setComment_url(String comment_url) {
        this.comment_url = comment_url == null ? null : comment_url.trim();
    }

    public String getComment_mp4() {
        return comment_mp4;
    }

    public void setComment_mp4(String comment_mp4) {
        this.comment_mp4 = comment_mp4 == null ? null : comment_mp4.trim();
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
        sb.append(", comment_id=").append(comment_id);
        sb.append(", user_id=").append(user_id);
        sb.append(", comment_detail=").append(comment_detail);
        sb.append(", service_score=").append(service_score);
        sb.append(", quality_score=").append(quality_score);
        sb.append(",  logistics_score=").append( logistics_score);
        sb.append(", comment_url=").append(comment_url);
        sb.append(", comment_mp4=").append(comment_mp4);
        sb.append(", gmt_create=").append(gmt_create);
        sb.append(", gmt_modified=").append(gmt_modified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
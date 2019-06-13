package com.max.b2c.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class CommentReplyRelation implements Serializable {
    @ApiModelProperty(value = "关系id")
    private Integer id;

    @ApiModelProperty(value = "评论id")
    private Integer comment_id;

    @ApiModelProperty(value = "父回复id")
    private Integer reply_parentid;

    @ApiModelProperty(value = "回复用户id")
    private Integer user_id;

    private Date gmt_create;

    private Date gmt_modified;

    @ApiModelProperty(value = "回复id")
    private Integer reply_id;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getComment_id() {
        return comment_id;
    }

    public void setComment_id(Integer comment_id) {
        this.comment_id = comment_id;
    }

    public Integer getReply_parentid() {
        return reply_parentid;
    }

    public void setReply_parentid(Integer reply_parentid) {
        this.reply_parentid = reply_parentid;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
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

    public Integer getReply_id() {
        return reply_id;
    }

    public void setReply_id(Integer reply_id) {
        this.reply_id = reply_id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", comment_id=").append(comment_id);
        sb.append(", reply_parentid=").append(reply_parentid);
        sb.append(", user_id=").append(user_id);
        sb.append(", gmt_create=").append(gmt_create);
        sb.append(", gmt_modified=").append(gmt_modified);
        sb.append(", reply_id=").append(reply_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
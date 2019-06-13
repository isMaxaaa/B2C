package com.max.b2c.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UserLogin implements Serializable {
    @ApiModelProperty(value = "用户id")
    private Integer user_id;

    @ApiModelProperty(value = "用户密码")
    private String user_password;

    @ApiModelProperty(value = "用户邮箱")
    private String user_email;

    @ApiModelProperty(value = "用户手机号")
    private String user_phone;

    @ApiModelProperty(value = "用户是否登录")
    private Integer is_logged;

    @ApiModelProperty(value = "用户登录ip")
    private Integer logging_ip;

    @ApiModelProperty(value = "登录信息更新时更新")
    private Date gmt_modified;

    @ApiModelProperty(value = "登录信息创建时填写")
    private Date gmt_create;

    @ApiModelProperty(value = "用户角色")
    private Integer user_role;

    @ApiModelProperty(value = "是否加入黑名单")
    private Integer is_inblacklist;

    private static final long serialVersionUID = 1L;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password == null ? null : user_password.trim();
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email == null ? null : user_email.trim();
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone == null ? null : user_phone.trim();
    }

    public Integer getIs_logged() {
        return is_logged;
    }

    public void setIs_logged(Integer is_logged) {
        this.is_logged = is_logged;
    }

    public Integer getLogging_ip() {
        return logging_ip;
    }

    public void setLogging_ip(Integer logging_ip) {
        this.logging_ip = logging_ip;
    }

    public Date getGmt_modified() {
        return gmt_modified;
    }

    public void setGmt_modified(Date gmt_modified) {
        this.gmt_modified = gmt_modified;
    }

    public Date getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    public Integer getUser_role() {
        return user_role;
    }

    public void setUser_role(Integer user_role) {
        this.user_role = user_role;
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
        sb.append(", user_id=").append(user_id);
        sb.append(", user_password=").append(user_password);
        sb.append(", user_email=").append(user_email);
        sb.append(", user_phone=").append(user_phone);
        sb.append(", is_logged=").append(is_logged);
        sb.append(", logging_ip=").append(logging_ip);
        sb.append(", gmt_modified=").append(gmt_modified);
        sb.append(", gmt_create=").append(gmt_create);
        sb.append(", user_role=").append(user_role);
        sb.append(", is_inblacklist=").append(is_inblacklist);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
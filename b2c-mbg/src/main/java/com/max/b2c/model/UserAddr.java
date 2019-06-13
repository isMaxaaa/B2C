package com.max.b2c.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UserAddr implements Serializable {
    @ApiModelProperty(value = "用户地址信息序号")
    private Integer addr_id;

    @ApiModelProperty(value = "用户id")
    private Integer user_id;

    @ApiModelProperty(value = "收货人姓名")
    private String user_name;

    @ApiModelProperty(value = "收货人手机号")
    private String phone;

    @ApiModelProperty(value = "所在省")
    private String province;

    @ApiModelProperty(value = "所在市")
    private String city;

    @ApiModelProperty(value = "所在区")
    private String county;

    @ApiModelProperty(value = "所在镇/街道")
    private String townstreet;

    @ApiModelProperty(value = "详细地址")
    private String addr_detail;

    @ApiModelProperty(value = "是否为默认地址")
    private Byte is_default;

    @ApiModelProperty(value = "创建时间")
    private Date gmt_create;

    @ApiModelProperty(value = "更新时间")
    private Date gmt_modified;

    private static final long serialVersionUID = 1L;

    public Integer getAddr_id() {
        return addr_id;
    }

    public void setAddr_id(Integer addr_id) {
        this.addr_id = addr_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getTownstreet() {
        return townstreet;
    }

    public void setTownstreet(String townstreet) {
        this.townstreet = townstreet == null ? null : townstreet.trim();
    }

    public String getAddr_detail() {
        return addr_detail;
    }

    public void setAddr_detail(String addr_detail) {
        this.addr_detail = addr_detail == null ? null : addr_detail.trim();
    }

    public Byte getIs_default() {
        return is_default;
    }

    public void setIs_default(Byte is_default) {
        this.is_default = is_default;
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
        sb.append(", addr_id=").append(addr_id);
        sb.append(", user_id=").append(user_id);
        sb.append(", user_name=").append(user_name);
        sb.append(", phone=").append(phone);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", county=").append(county);
        sb.append(", townstreet=").append(townstreet);
        sb.append(", addr_detail=").append(addr_detail);
        sb.append(", is_default=").append(is_default);
        sb.append(", gmt_create=").append(gmt_create);
        sb.append(", gmt_modified=").append(gmt_modified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
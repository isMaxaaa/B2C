package com.max.b2c.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ProductCommentRelation implements Serializable {
    @ApiModelProperty(value = "关系id")
    private Integer id;

    @ApiModelProperty(value = "订单id")
    private Integer order_id;

    @ApiModelProperty(value = "评论id")
    private Integer comment_id;

    @ApiModelProperty(value = "订单编号")
    private String order_code;

    @ApiModelProperty(value = "商品spuid")
    private Integer product_spuid;

    @ApiModelProperty(value = "商品skuid")
    private Integer product_skuid;

    private Date gmt_create;

    private Date gmt_modified;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getComment_id() {
        return comment_id;
    }

    public void setComment_id(Integer comment_id) {
        this.comment_id = comment_id;
    }

    public String getOrder_code() {
        return order_code;
    }

    public void setOrder_code(String order_code) {
        this.order_code = order_code == null ? null : order_code.trim();
    }

    public Integer getProduct_spuid() {
        return product_spuid;
    }

    public void setProduct_spuid(Integer product_spuid) {
        this.product_spuid = product_spuid;
    }

    public Integer getProduct_skuid() {
        return product_skuid;
    }

    public void setProduct_skuid(Integer product_skuid) {
        this.product_skuid = product_skuid;
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
        sb.append(", id=").append(id);
        sb.append(", order_id=").append(order_id);
        sb.append(", comment_id=").append(comment_id);
        sb.append(", order_code=").append(order_code);
        sb.append(", product_spuid=").append(product_spuid);
        sb.append(", product_skuid=").append(product_skuid);
        sb.append(", gmt_create=").append(gmt_create);
        sb.append(", gmt_modified=").append(gmt_modified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
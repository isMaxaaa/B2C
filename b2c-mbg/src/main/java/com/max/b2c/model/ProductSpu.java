package com.max.b2c.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ProductSpu implements Serializable {
    @ApiModelProperty(value = "商品id")
    private Integer product_id;

    @ApiModelProperty(value = "商品编码")
    private String produce_code;

    @ApiModelProperty(value = "商品类别id")
    private Integer category_id;

    @ApiModelProperty(value = "店铺id")
    private Integer shop_id;

    @ApiModelProperty(value = "商品品牌id")
    private Integer brand_id;

    @ApiModelProperty(value = "是否免邮")
    private Integer is_free_postage;

    @ApiModelProperty(value = "是否秒杀限时")
    private Integer is_seckill;

    @ApiModelProperty(value = "是否上架、下架、预售")
    private Integer publish_status;

    @ApiModelProperty(value = "首页推荐状态")
    private Integer recommand_status;

    @ApiModelProperty(value = "审核状态")
    private Integer verity_status;

    @ApiModelProperty(value = "销量")
    private Integer sale;

    @ApiModelProperty(value = "排序参数")
    private Integer sort;

    @ApiModelProperty(value = "价格展示（列表价格）")
    private String price;

    @ApiModelProperty(value = "优惠价格")
    private String promotion_price;

    @ApiModelProperty(value = "副标题")
    private String sub_title;

    @ApiModelProperty(value = "商品描述")
    private String description;

    private Date gmt_create;

    private Date gmt_modified;

    private static final long serialVersionUID = 1L;

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduce_code() {
        return produce_code;
    }

    public void setProduce_code(String produce_code) {
        this.produce_code = produce_code == null ? null : produce_code.trim();
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public Integer getShop_id() {
        return shop_id;
    }

    public void setShop_id(Integer shop_id) {
        this.shop_id = shop_id;
    }

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        this.brand_id = brand_id;
    }

    public Integer getIs_free_postage() {
        return is_free_postage;
    }

    public void setIs_free_postage(Integer is_free_postage) {
        this.is_free_postage = is_free_postage;
    }

    public Integer getIs_seckill() {
        return is_seckill;
    }

    public void setIs_seckill(Integer is_seckill) {
        this.is_seckill = is_seckill;
    }

    public Integer getPublish_status() {
        return publish_status;
    }

    public void setPublish_status(Integer publish_status) {
        this.publish_status = publish_status;
    }

    public Integer getRecommand_status() {
        return recommand_status;
    }

    public void setRecommand_status(Integer recommand_status) {
        this.recommand_status = recommand_status;
    }

    public Integer getVerity_status() {
        return verity_status;
    }

    public void setVerity_status(Integer verity_status) {
        this.verity_status = verity_status;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getPromotion_price() {
        return promotion_price;
    }

    public void setPromotion_price(String promotion_price) {
        this.promotion_price = promotion_price == null ? null : promotion_price.trim();
    }

    public String getSub_title() {
        return sub_title;
    }

    public void setSub_title(String sub_title) {
        this.sub_title = sub_title == null ? null : sub_title.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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
        sb.append(", product_id=").append(product_id);
        sb.append(", produce_code=").append(produce_code);
        sb.append(", category_id=").append(category_id);
        sb.append(", shop_id=").append(shop_id);
        sb.append(", brand_id=").append(brand_id);
        sb.append(", is_free_postage=").append(is_free_postage);
        sb.append(", is_seckill=").append(is_seckill);
        sb.append(", publish_status=").append(publish_status);
        sb.append(", recommand_status=").append(recommand_status);
        sb.append(", verity_status=").append(verity_status);
        sb.append(", sale=").append(sale);
        sb.append(", sort=").append(sort);
        sb.append(", price=").append(price);
        sb.append(", promotion_price=").append(promotion_price);
        sb.append(", sub_title=").append(sub_title);
        sb.append(", description=").append(description);
        sb.append(", gmt_create=").append(gmt_create);
        sb.append(", gmt_modified=").append(gmt_modified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
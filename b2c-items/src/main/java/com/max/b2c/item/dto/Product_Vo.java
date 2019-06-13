package com.max.b2c.item.dto;

import com.max.b2c.model.ProductImg;
import com.max.b2c.model.ProductSku;
import com.max.b2c.model.ProductSpecsValue;
import com.max.b2c.model.ProductSpu;

import java.util.List;


public class Product_Vo extends ProductSpu {
    private List<ProductImg> imgs;
    private List<ProductSpecsValue> specsList;
    private List<ProductAttribute_Vo> AttributeNameVoList;
    private List<ProductSku> skuList;


    public List<ProductAttribute_Vo> getAttributeNameVoList() {
        return AttributeNameVoList;
    }

    public void setAttributeNameVoList(List<ProductAttribute_Vo> attributeNameVoList) {
        AttributeNameVoList = attributeNameVoList;
    }


    public List<ProductImg> getImgs() {
        return imgs;
    }

    public void setImgs(List<ProductImg> imgs) {
        this.imgs = imgs;
    }


    public List<ProductSku> getSkuList() {
        return skuList;
    }

    public void setSkuList(List<ProductSku> skuList) {
        this.skuList = skuList;
    }


    public List<ProductSpecsValue> getSpecsList() {
        return specsList;
    }

    public void setSpecsList(List<ProductSpecsValue> specsList) {
        this.specsList = specsList;
    }


}

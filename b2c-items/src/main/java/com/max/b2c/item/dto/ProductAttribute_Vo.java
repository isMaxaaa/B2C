package com.max.b2c.item.dto;

import java.io.Serializable;

public class ProductAttribute_Vo implements Serializable {
    String AttributeName;

    public String getAttributeName() {
        return AttributeName;
    }

    public void setAttributeName(String attributeName) {
        AttributeName = attributeName;
    }

    String AttributeValue;

    public String getAttributeValue() {
        return AttributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        AttributeValue = attributeValue;
    }

}

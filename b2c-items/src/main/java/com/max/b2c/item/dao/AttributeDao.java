package com.max.b2c.item.dao;

import com.max.b2c.model.ProductAttributeName;
import com.max.b2c.model.ProductAttributeRelation;
import com.max.b2c.model.ProductAttributeValue;
import com.max.b2c.model.ProductSpecsValue;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AttributeDao {

    /**
     * 批量添加商品基本属性
     * @param attributeNameList
     * @param attributeValueList
     * @param attributeRelationList
     * @return
     */
    int insertAttribute(@Param("list1")List<ProductAttributeName> attributeNameList, @Param("list2")List<ProductAttributeValue> attributeValueList
            , @Param("list3")List<ProductAttributeRelation> attributeRelationList );


}

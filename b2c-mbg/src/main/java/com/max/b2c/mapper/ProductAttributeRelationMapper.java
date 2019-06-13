package com.max.b2c.mapper;

import com.max.b2c.model.ProductAttributeRelation;
import com.max.b2c.model.ProductAttributeRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductAttributeRelationMapper {
    int countByExample(ProductAttributeRelationExample example);

    int deleteByExample(ProductAttributeRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductAttributeRelation record);

    int insertSelective(ProductAttributeRelation record);

    List<ProductAttributeRelation> selectByExample(ProductAttributeRelationExample example);

    ProductAttributeRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductAttributeRelation record, @Param("example") ProductAttributeRelationExample example);

    int updateByExample(@Param("record") ProductAttributeRelation record, @Param("example") ProductAttributeRelationExample example);

    int updateByPrimaryKeySelective(ProductAttributeRelation record);

    int updateByPrimaryKey(ProductAttributeRelation record);
}
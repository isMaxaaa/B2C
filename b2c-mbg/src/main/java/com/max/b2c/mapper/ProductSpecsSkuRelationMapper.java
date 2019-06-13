package com.max.b2c.mapper;

import com.max.b2c.model.ProductSpecsSkuRelation;
import com.max.b2c.model.ProductSpecsSkuRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductSpecsSkuRelationMapper {
    int countByExample(ProductSpecsSkuRelationExample example);

    int deleteByExample(ProductSpecsSkuRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductSpecsSkuRelation record);

    int insertSelective(ProductSpecsSkuRelation record);

    List<ProductSpecsSkuRelation> selectByExample(ProductSpecsSkuRelationExample example);

    ProductSpecsSkuRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductSpecsSkuRelation record, @Param("example") ProductSpecsSkuRelationExample example);

    int updateByExample(@Param("record") ProductSpecsSkuRelation record, @Param("example") ProductSpecsSkuRelationExample example);

    int updateByPrimaryKeySelective(ProductSpecsSkuRelation record);

    int updateByPrimaryKey(ProductSpecsSkuRelation record);
}
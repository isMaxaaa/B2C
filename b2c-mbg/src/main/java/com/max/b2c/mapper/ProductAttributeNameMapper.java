package com.max.b2c.mapper;

import com.max.b2c.model.ProductAttributeName;
import com.max.b2c.model.ProductAttributeNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductAttributeNameMapper {
    int countByExample(ProductAttributeNameExample example);

    int deleteByExample(ProductAttributeNameExample example);

    int deleteByPrimaryKey(Integer attribution_id);

    int insert(ProductAttributeName record);

    int insertSelective(ProductAttributeName record);

    List<ProductAttributeName> selectByExample(ProductAttributeNameExample example);

    ProductAttributeName selectByPrimaryKey(Integer attribution_id);

    int updateByExampleSelective(@Param("record") ProductAttributeName record, @Param("example") ProductAttributeNameExample example);

    int updateByExample(@Param("record") ProductAttributeName record, @Param("example") ProductAttributeNameExample example);

    int updateByPrimaryKeySelective(ProductAttributeName record);

    int updateByPrimaryKey(ProductAttributeName record);
}
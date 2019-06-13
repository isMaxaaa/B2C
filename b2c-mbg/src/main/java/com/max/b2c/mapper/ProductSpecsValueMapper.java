package com.max.b2c.mapper;

import com.max.b2c.model.ProductSpecsValue;
import com.max.b2c.model.ProductSpecsValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductSpecsValueMapper {
    int countByExample(ProductSpecsValueExample example);

    int deleteByExample(ProductSpecsValueExample example);

    int deleteByPrimaryKey(Integer value_id);

    int insert(ProductSpecsValue record);

    int insertSelective(ProductSpecsValue record);

    List<ProductSpecsValue> selectByExample(ProductSpecsValueExample example);

    ProductSpecsValue selectByPrimaryKey(Integer value_id);

    int updateByExampleSelective(@Param("record") ProductSpecsValue record, @Param("example") ProductSpecsValueExample example);

    int updateByExample(@Param("record") ProductSpecsValue record, @Param("example") ProductSpecsValueExample example);

    int updateByPrimaryKeySelective(ProductSpecsValue record);

    int updateByPrimaryKey(ProductSpecsValue record);
}
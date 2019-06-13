package com.max.b2c.mapper;

import com.max.b2c.model.ProductSpecs;
import com.max.b2c.model.ProductSpecsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductSpecsMapper {
    int countByExample(ProductSpecsExample example);

    int deleteByExample(ProductSpecsExample example);

    int deleteByPrimaryKey(Integer specs_id);

    int insert(ProductSpecs record);

    int insertSelective(ProductSpecs record);

    List<ProductSpecs> selectByExample(ProductSpecsExample example);

    ProductSpecs selectByPrimaryKey(Integer specs_id);

    int updateByExampleSelective(@Param("record") ProductSpecs record, @Param("example") ProductSpecsExample example);

    int updateByExample(@Param("record") ProductSpecs record, @Param("example") ProductSpecsExample example);

    int updateByPrimaryKeySelective(ProductSpecs record);

    int updateByPrimaryKey(ProductSpecs record);
}
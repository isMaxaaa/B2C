package com.max.b2c.mapper;

import com.max.b2c.model.ProductSpu;
import com.max.b2c.model.ProductSpuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductSpuMapper {
    int countByExample(ProductSpuExample example);

    int deleteByExample(ProductSpuExample example);

    int deleteByPrimaryKey(Integer product_id);

    int insert(ProductSpu record);

    int insertSelective(ProductSpu record);

    List<ProductSpu> selectByExample(ProductSpuExample example);

    ProductSpu selectByPrimaryKey(Integer product_id);

    int updateByExampleSelective(@Param("record") ProductSpu record, @Param("example") ProductSpuExample example);

    int updateByExample(@Param("record") ProductSpu record, @Param("example") ProductSpuExample example);

    int updateByPrimaryKeySelective(ProductSpu record);

    int updateByPrimaryKey(ProductSpu record);
}
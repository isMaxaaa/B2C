package com.max.b2c.mapper;

import com.max.b2c.model.ProductSku;
import com.max.b2c.model.ProductSkuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductSkuMapper {
    int countByExample(ProductSkuExample example);

    int deleteByExample(ProductSkuExample example);

    int deleteByPrimaryKey(Integer product_skuid);

    int insert(ProductSku record);

    int insertSelective(ProductSku record);

    List<ProductSku> selectByExample(ProductSkuExample example);

    ProductSku selectByPrimaryKey(Integer product_skuid);

    int updateByExampleSelective(@Param("record") ProductSku record, @Param("example") ProductSkuExample example);

    int updateByExample(@Param("record") ProductSku record, @Param("example") ProductSkuExample example);

    int updateByPrimaryKeySelective(ProductSku record);

    int updateByPrimaryKey(ProductSku record);
}
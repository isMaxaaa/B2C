package com.max.b2c.mapper;

import com.max.b2c.model.ProductFullPreduce;
import com.max.b2c.model.ProductFullPreduceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductFullPreduceMapper {
    int countByExample(ProductFullPreduceExample example);

    int deleteByExample(ProductFullPreduceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductFullPreduce record);

    int insertSelective(ProductFullPreduce record);

    List<ProductFullPreduce> selectByExample(ProductFullPreduceExample example);

    ProductFullPreduce selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductFullPreduce record, @Param("example") ProductFullPreduceExample example);

    int updateByExample(@Param("record") ProductFullPreduce record, @Param("example") ProductFullPreduceExample example);

    int updateByPrimaryKeySelective(ProductFullPreduce record);

    int updateByPrimaryKey(ProductFullPreduce record);
}
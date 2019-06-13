package com.max.b2c.mapper;

import com.max.b2c.model.ProductSeckillRelation;
import com.max.b2c.model.ProductSeckillRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductSeckillRelationMapper {
    int countByExample(ProductSeckillRelationExample example);

    int deleteByExample(ProductSeckillRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductSeckillRelation record);

    int insertSelective(ProductSeckillRelation record);

    List<ProductSeckillRelation> selectByExample(ProductSeckillRelationExample example);

    ProductSeckillRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductSeckillRelation record, @Param("example") ProductSeckillRelationExample example);

    int updateByExample(@Param("record") ProductSeckillRelation record, @Param("example") ProductSeckillRelationExample example);

    int updateByPrimaryKeySelective(ProductSeckillRelation record);

    int updateByPrimaryKey(ProductSeckillRelation record);
}
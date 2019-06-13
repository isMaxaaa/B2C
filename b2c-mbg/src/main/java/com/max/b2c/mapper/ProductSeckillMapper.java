package com.max.b2c.mapper;

import com.max.b2c.model.ProductSeckill;
import com.max.b2c.model.ProductSeckillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductSeckillMapper {
    int countByExample(ProductSeckillExample example);

    int deleteByExample(ProductSeckillExample example);

    int deleteByPrimaryKey(Integer seckill_id);

    int insert(ProductSeckill record);

    int insertSelective(ProductSeckill record);

    List<ProductSeckill> selectByExample(ProductSeckillExample example);

    ProductSeckill selectByPrimaryKey(Integer seckill_id);

    int updateByExampleSelective(@Param("record") ProductSeckill record, @Param("example") ProductSeckillExample example);

    int updateByExample(@Param("record") ProductSeckill record, @Param("example") ProductSeckillExample example);

    int updateByPrimaryKeySelective(ProductSeckill record);

    int updateByPrimaryKey(ProductSeckill record);
}
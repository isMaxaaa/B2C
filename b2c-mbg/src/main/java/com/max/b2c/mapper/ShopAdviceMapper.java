package com.max.b2c.mapper;

import com.max.b2c.model.ShopAdvice;
import com.max.b2c.model.ShopAdviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopAdviceMapper {
    int countByExample(ShopAdviceExample example);

    int deleteByExample(ShopAdviceExample example);

    int deleteByPrimaryKey(Integer advice_id);

    int insert(ShopAdvice record);

    int insertSelective(ShopAdvice record);

    List<ShopAdvice> selectByExample(ShopAdviceExample example);

    ShopAdvice selectByPrimaryKey(Integer advice_id);

    int updateByExampleSelective(@Param("record") ShopAdvice record, @Param("example") ShopAdviceExample example);

    int updateByExample(@Param("record") ShopAdvice record, @Param("example") ShopAdviceExample example);

    int updateByPrimaryKeySelective(ShopAdvice record);

    int updateByPrimaryKey(ShopAdvice record);
}
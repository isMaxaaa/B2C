package com.max.b2c.mapper;

import com.max.b2c.model.SellerShop;
import com.max.b2c.model.SellerShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SellerShopMapper {
    int countByExample(SellerShopExample example);

    int deleteByExample(SellerShopExample example);

    int deleteByPrimaryKey(Integer shop_id);

    int insert(SellerShop record);

    int insertSelective(SellerShop record);

    List<SellerShop> selectByExample(SellerShopExample example);

    SellerShop selectByPrimaryKey(Integer shop_id);

    int updateByExampleSelective(@Param("record") SellerShop record, @Param("example") SellerShopExample example);

    int updateByExample(@Param("record") SellerShop record, @Param("example") SellerShopExample example);

    int updateByPrimaryKeySelective(SellerShop record);

    int updateByPrimaryKey(SellerShop record);
}
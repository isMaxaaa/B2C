package com.max.b2c.mapper;

import com.max.b2c.model.ProductCoupons;
import com.max.b2c.model.ProductCouponsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductCouponsMapper {
    int countByExample(ProductCouponsExample example);

    int deleteByExample(ProductCouponsExample example);

    int deleteByPrimaryKey(Integer coupon_id);

    int insert(ProductCoupons record);

    int insertSelective(ProductCoupons record);

    List<ProductCoupons> selectByExample(ProductCouponsExample example);

    ProductCoupons selectByPrimaryKey(Integer coupon_id);

    int updateByExampleSelective(@Param("record") ProductCoupons record, @Param("example") ProductCouponsExample example);

    int updateByExample(@Param("record") ProductCoupons record, @Param("example") ProductCouponsExample example);

    int updateByPrimaryKeySelective(ProductCoupons record);

    int updateByPrimaryKey(ProductCoupons record);
}
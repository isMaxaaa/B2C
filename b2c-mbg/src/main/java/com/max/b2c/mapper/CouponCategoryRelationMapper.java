package com.max.b2c.mapper;

import com.max.b2c.model.CouponCategoryRelation;
import com.max.b2c.model.CouponCategoryRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouponCategoryRelationMapper {
    int countByExample(CouponCategoryRelationExample example);

    int deleteByExample(CouponCategoryRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CouponCategoryRelation record);

    int insertSelective(CouponCategoryRelation record);

    List<CouponCategoryRelation> selectByExample(CouponCategoryRelationExample example);

    CouponCategoryRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CouponCategoryRelation record, @Param("example") CouponCategoryRelationExample example);

    int updateByExample(@Param("record") CouponCategoryRelation record, @Param("example") CouponCategoryRelationExample example);

    int updateByPrimaryKeySelective(CouponCategoryRelation record);

    int updateByPrimaryKey(CouponCategoryRelation record);
}
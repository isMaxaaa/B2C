package com.max.b2c.mapper;

import com.max.b2c.model.CouponUserLog;
import com.max.b2c.model.CouponUserLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouponUserLogMapper {
    int countByExample(CouponUserLogExample example);

    int deleteByExample(CouponUserLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CouponUserLog record);

    int insertSelective(CouponUserLog record);

    List<CouponUserLog> selectByExample(CouponUserLogExample example);

    CouponUserLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CouponUserLog record, @Param("example") CouponUserLogExample example);

    int updateByExample(@Param("record") CouponUserLog record, @Param("example") CouponUserLogExample example);

    int updateByPrimaryKeySelective(CouponUserLog record);

    int updateByPrimaryKey(CouponUserLog record);
}
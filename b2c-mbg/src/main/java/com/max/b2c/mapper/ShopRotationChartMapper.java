package com.max.b2c.mapper;

import com.max.b2c.model.ShopRotationChart;
import com.max.b2c.model.ShopRotationChartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopRotationChartMapper {
    int countByExample(ShopRotationChartExample example);

    int deleteByExample(ShopRotationChartExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopRotationChart record);

    int insertSelective(ShopRotationChart record);

    List<ShopRotationChart> selectByExample(ShopRotationChartExample example);

    ShopRotationChart selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopRotationChart record, @Param("example") ShopRotationChartExample example);

    int updateByExample(@Param("record") ShopRotationChart record, @Param("example") ShopRotationChartExample example);

    int updateByPrimaryKeySelective(ShopRotationChart record);

    int updateByPrimaryKey(ShopRotationChart record);
}
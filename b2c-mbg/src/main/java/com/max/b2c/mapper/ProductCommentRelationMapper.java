package com.max.b2c.mapper;

import com.max.b2c.model.ProductCommentRelation;
import com.max.b2c.model.ProductCommentRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductCommentRelationMapper {
    int countByExample(ProductCommentRelationExample example);

    int deleteByExample(ProductCommentRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductCommentRelation record);

    int insertSelective(ProductCommentRelation record);

    List<ProductCommentRelation> selectByExample(ProductCommentRelationExample example);

    ProductCommentRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductCommentRelation record, @Param("example") ProductCommentRelationExample example);

    int updateByExample(@Param("record") ProductCommentRelation record, @Param("example") ProductCommentRelationExample example);

    int updateByPrimaryKeySelective(ProductCommentRelation record);

    int updateByPrimaryKey(ProductCommentRelation record);
}
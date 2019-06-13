package com.max.b2c.mapper;

import com.max.b2c.model.CommentReplyRelation;
import com.max.b2c.model.CommentReplyRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentReplyRelationMapper {
    int countByExample(CommentReplyRelationExample example);

    int deleteByExample(CommentReplyRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CommentReplyRelation record);

    int insertSelective(CommentReplyRelation record);

    List<CommentReplyRelation> selectByExample(CommentReplyRelationExample example);

    CommentReplyRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CommentReplyRelation record, @Param("example") CommentReplyRelationExample example);

    int updateByExample(@Param("record") CommentReplyRelation record, @Param("example") CommentReplyRelationExample example);

    int updateByPrimaryKeySelective(CommentReplyRelation record);

    int updateByPrimaryKey(CommentReplyRelation record);
}
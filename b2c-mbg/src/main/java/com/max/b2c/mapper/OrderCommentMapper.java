package com.max.b2c.mapper;

import com.max.b2c.model.OrderComment;
import com.max.b2c.model.OrderCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderCommentMapper {
    int countByExample(OrderCommentExample example);

    int deleteByExample(OrderCommentExample example);

    int deleteByPrimaryKey(Integer comment_id);

    int insert(OrderComment record);

    int insertSelective(OrderComment record);

    List<OrderComment> selectByExample(OrderCommentExample example);

    OrderComment selectByPrimaryKey(Integer comment_id);

    int updateByExampleSelective(@Param("record") OrderComment record, @Param("example") OrderCommentExample example);

    int updateByExample(@Param("record") OrderComment record, @Param("example") OrderCommentExample example);

    int updateByPrimaryKeySelective(OrderComment record);

    int updateByPrimaryKey(OrderComment record);
}
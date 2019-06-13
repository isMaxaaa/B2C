package com.max.b2c.mapper;

import com.max.b2c.model.ProductReply;
import com.max.b2c.model.ProductReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductReplyMapper {
    int countByExample(ProductReplyExample example);

    int deleteByExample(ProductReplyExample example);

    int deleteByPrimaryKey(Integer reply_id);

    int insert(ProductReply record);

    int insertSelective(ProductReply record);

    List<ProductReply> selectByExample(ProductReplyExample example);

    ProductReply selectByPrimaryKey(Integer reply_id);

    int updateByExampleSelective(@Param("record") ProductReply record, @Param("example") ProductReplyExample example);

    int updateByExample(@Param("record") ProductReply record, @Param("example") ProductReplyExample example);

    int updateByPrimaryKeySelective(ProductReply record);

    int updateByPrimaryKey(ProductReply record);
}
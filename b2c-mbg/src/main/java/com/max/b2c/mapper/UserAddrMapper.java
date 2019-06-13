package com.max.b2c.mapper;

import com.max.b2c.model.UserAddr;
import com.max.b2c.model.UserAddrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAddrMapper {
    int countByExample(UserAddrExample example);

    int deleteByExample(UserAddrExample example);

    int deleteByPrimaryKey(Integer addr_id);

    int insert(UserAddr record);

    int insertSelective(UserAddr record);

    List<UserAddr> selectByExample(UserAddrExample example);

    UserAddr selectByPrimaryKey(Integer addr_id);

    int updateByExampleSelective(@Param("record") UserAddr record, @Param("example") UserAddrExample example);

    int updateByExample(@Param("record") UserAddr record, @Param("example") UserAddrExample example);

    int updateByPrimaryKeySelective(UserAddr record);

    int updateByPrimaryKey(UserAddr record);
}
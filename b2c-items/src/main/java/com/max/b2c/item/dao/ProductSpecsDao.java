package com.max.b2c.item.dao;

import com.max.b2c.model.ProductSpecsValue;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public interface ProductSpecsDao {
    /**
     * 批量插入
      * @param specsValueList
     * @return
     */
    int insertSpecs(@Param("list")List<ProductSpecsValue> specsValueList);



}

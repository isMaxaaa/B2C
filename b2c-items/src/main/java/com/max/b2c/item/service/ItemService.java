package com.max.b2c.item.service;

import com.max.b2c.common.ServerResponse;
import com.max.b2c.item.dto.Product_Vo;

public interface ItemService {
    ServerResponse addproduct(Product_Vo productVo);
}

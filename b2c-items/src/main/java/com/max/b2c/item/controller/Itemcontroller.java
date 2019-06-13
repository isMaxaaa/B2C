package com.max.b2c.item.controller;

import com.max.b2c.common.ServerResponse;
import com.max.b2c.item.dto.Product_Vo;
import com.max.b2c.item.service.ItemService;
import com.max.b2c.model.ProductAttributeName;
import com.max.b2c.model.ProductAttributeValue;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@Api(value = "测试商品相关的信息")
public class Itemcontroller {

    @Autowired(required = true)
    ItemService itemService;

    @CrossOrigin
    @ApiOperation(value ="添加商品信息",notes = "添加商品信息")
    @RequestMapping(value = "addproduct",method = RequestMethod.POST)
    public ServerResponse addproduct(@RequestBody Product_Vo productVo)
    {
        return itemService.addproduct(productVo);
    }
}

package com.max.b2c.item.controller;

import com.max.b2c.common.ServerResponse;
import com.max.b2c.item.service.BrandService;
import com.max.b2c.model.ProductBrand;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "测试商品品牌的信息")
@RestController
public class Brandcontroller {
    @Autowired
    BrandService brandService;

    @CrossOrigin
    @RequestMapping(value ="addBrand",method = RequestMethod.POST)
    @ApiOperation(value = "添加品牌",notes = "添加品牌")
    public ServerResponse addBrand(@RequestBody ProductBrand productBrand){
        return brandService.addBrand(productBrand);
    }


    @CrossOrigin
    @RequestMapping(value = "deleteBrand",method = RequestMethod.DELETE)
    @ApiOperation(value = "删除品牌",notes = "删除品牌")
    public ServerResponse deleteBrand(@RequestParam("brand_id") Integer brand_id ){
        return brandService.deleteBrand(brand_id);
    }

    @CrossOrigin
    @RequestMapping(value = "updateBrand",method = RequestMethod.POST)
    @ApiOperation(value = "更新品牌",notes = "更新品牌")
    public ServerResponse updateBrand(@RequestBody ProductBrand productBrand)
    {
        return brandService.updateBrand(productBrand);
    }

    @CrossOrigin
    @RequestMapping(value = "showBrands",method = RequestMethod.GET)
    @ApiOperation(value = "显示所有品牌",notes = "显示所有品牌")
    public ServerResponse<List<ProductBrand>> showBrands(){
        return brandService.showBrands();
    }

    @CrossOrigin
    @RequestMapping(value = "uncheckBrands",method = RequestMethod.GET)
    @ApiOperation(value = "显示未审查的品牌",notes = "显示未受审查的品牌")
    public ServerResponse<List<ProductBrand>> showUncheckBrands(){
        return brandService.showUncheckBrands();
    }


}

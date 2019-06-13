package com.max.b2c.item.controller;

import com.max.b2c.common.JsonXMLUtils;
import com.max.b2c.common.ServerResponse;
import com.max.b2c.item.service.CategoryService;
import com.max.b2c.model.ProductCategory;
import com.max.b2c.model.ProductSpecs;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@Api(value = "测试商品类别相关的信息")
public class Categorycontroller {

    @Autowired
    CategoryService categoryService;

    @CrossOrigin
    @RequestMapping(value = "addcategory",method = RequestMethod.POST)
    @ApiOperation(value = "添加商品类别",notes = "添加商品类别")
    public ServerResponse addcategory(@RequestBody ProductCategory productCategory){
        return categoryService.Addcategory(productCategory);
    }

    @CrossOrigin
    @RequestMapping(value = "updatecategory",method = RequestMethod.POST)
    @ApiOperation(value = "修改商品类别信息",notes = "修改商品类别信息，比如名称、排序、是否显示、是否在前台显示")
    public ServerResponse updatecategory(@RequestBody ProductCategory productCategory)
    {
        return categoryService.Updatecategory(productCategory);
    }

    @CrossOrigin
    @RequestMapping(value = "deletecategory",method = RequestMethod.DELETE)
    @ApiOperation(value = "删除商品类别",notes = "删除商品类别")
    @ApiImplicitParam(name = "categoryid",value = "商品类别id",required = true,paramType = "query",dataType = "Integer")
    public ServerResponse deletecategory(@RequestParam("category_id") Integer category_id){
        return categoryService.Delcategory(category_id);
    }

    @CrossOrigin
    @RequestMapping(value = "productCategory",method = RequestMethod.GET)
    @ApiOperation(value = "商品类别管理首页",notes = "商品类别管理首页")
//    @ApiImplicitParam(name = "parentid",value = "商品类别父id",required = true,paramType = "query",dataType = "Integer")

    public ServerResponse<List<ProductCategory>> categorylist(@RequestParam("parent_id") Integer parent_id){
        return categoryService.Showcategory(parent_id);
    }

    @CrossOrigin
    @RequestMapping(value = "productcategorys",method = RequestMethod.GET)
    @ApiOperation(value = "商品类别三级联动信息")
    public ServerResponse<Map<String, Map<String,List<String>>>> categorys(){
        return categoryService.Getcategorys();

    }

    @CrossOrigin
    @RequestMapping(value = "addproductspecs",method = RequestMethod.POST)
    @ApiOperation(value = "添加商品基本规格属性",notes = "添加商品基本规格属性")
    public ServerResponse addspecs(@RequestBody ProductSpecs productSpecs){
        return categoryService.addspecs(productSpecs);
    }

}

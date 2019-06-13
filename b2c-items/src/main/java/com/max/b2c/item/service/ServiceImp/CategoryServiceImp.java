package com.max.b2c.item.service.ServiceImp;

import com.max.b2c.common.ServerResponse;

import com.max.b2c.item.service.CategoryService;
import com.max.b2c.item.util.JedisUtil;
import com.max.b2c.mapper.ProductCategoryMapper;
import com.max.b2c.mapper.ProductSpecsMapper;
import com.max.b2c.model.ProductCategory;
import com.max.b2c.model.ProductCategoryExample;
import com.max.b2c.model.ProductSpecs;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.stereotype.Service;

import java.util.*;

@Slf4j
@Service
public class CategoryServiceImp implements CategoryService {


    @Autowired(required = true)
    ProductCategoryMapper productCategoryMapper;

    @Autowired(required = true)
    ProductSpecsMapper productSpecsMapper;

    @Override
    public ServerResponse Addcategory(ProductCategory productCategory) {
        try{
            int i = productCategoryMapper.insertSelective(productCategory);
            if(i>0)
                return ServerResponse.createBySuccessMessage("添加成功");
        }
        catch (Exception e)
        {
            log.info("类别名称重复");
            return ServerResponse.createByErrorMessage("类别名称重复");
        }
        return ServerResponse.createBySuccess();

    }

    @Override
    public ServerResponse Updatecategory(ProductCategory productCategory) {
        try{
            int i=productCategoryMapper.updateByPrimaryKeySelective(productCategory);
        }
        catch(Exception e){
            log.info(e.getMessage());
            return ServerResponse.createByErrorMessage("参数不合法");
        }
        return ServerResponse.createBySuccessMessage("修改成功");
    }

    @Override
    public ServerResponse Delcategory(Integer category_id) {
        int i = productCategoryMapper.deleteByPrimaryKey(category_id);
        if(i>0)
            return ServerResponse.createBySuccessMessage("删除成功");
        return ServerResponse.createByErrorMessage("删除失败");
    }

    @Override
    public ServerResponse<List<ProductCategory>> Showcategory(Integer parent_id) {
        ProductCategoryExample productCategoryExample=new ProductCategoryExample();
        productCategoryExample.createCriteria().andParent_idEqualTo(parent_id);
        List<ProductCategory> productCategories = productCategoryMapper.selectByExample(productCategoryExample);
        if(productCategories!=null)
            return ServerResponse.createBySuccess(productCategories);
        return ServerResponse.createByErrorMessage("查询参数错误");
    }

    @Override
    public ServerResponse<Map<String, Map<String, List<String>>>> Getcategorys() {
        if(JedisUtil.exists("categorys")) {
           Map<String, Map<String, List<String>>> categorys =(Map<String, Map<String, List<String>>>) JedisUtil.getObject("categorys");
            return ServerResponse.createBySuccess(categorys);
        }
        else{
            try{
            synchronized(this) {
                Map<String, Map<String, List<String>>> categorys = new HashMap<>();
                ProductCategoryExample productCategoryExample01 = new ProductCategoryExample();
                productCategoryExample01.createCriteria().andLevelEqualTo(1);
                List<ProductCategory> cate01 = productCategoryMapper.selectByExample(productCategoryExample01);
                for (ProductCategory procate1 : cate01){
                    System.out.println(procate1.getCategory_name());
                    Map<String,List<String>> categorys02=new HashMap<>();
                    ProductCategoryExample productCategoryExample02 = new ProductCategoryExample();
                    productCategoryExample02.createCriteria().andParent_idEqualTo(procate1.getCategory_id());
                    List<ProductCategory> cate02 = productCategoryMapper.selectByExample(productCategoryExample02);
                    for(ProductCategory procate2:cate02){
                        System.out.println(procate2.getCategory_name());
                        List<String> categorys03=new ArrayList<>();
                        ProductCategoryExample productCategoryExample03 = new ProductCategoryExample();
                        productCategoryExample03.createCriteria().andParent_idEqualTo(procate2.getCategory_id());
                        List<ProductCategory> cate03 = productCategoryMapper.selectByExample(productCategoryExample03);

                        for(ProductCategory cate:cate03){
                            categorys03.add(cate.getCategory_name());
                            System.out.println(cate.getCategory_name());
                        }
                        categorys02.put(procate2.getCategory_name(),categorys03);
                    }
                    categorys.put(procate1.getCategory_name(),categorys02);
                }
                JedisUtil.setObject("categorys",categorys);
                return ServerResponse.createBySuccess(categorys);

            }

        }catch (Exception e)
            {
                return ServerResponse.createByErrorMessage("获取列表失败");
            }
    }}

    @Override
    public ServerResponse addspecs(ProductSpecs productSpecs) {
        int i = productSpecsMapper.insertSelective(productSpecs);
        if(i>0)
            return ServerResponse.createBySuccessMessage("添加成功");
        return ServerResponse.createByError();
    }




}

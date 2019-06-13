package com.max.b2c.item.service.ServiceImp;

import com.max.b2c.common.ServerResponse;
import com.max.b2c.item.dao.ProductSpecsDao;
import com.max.b2c.item.dto.ProductAttribute_Vo;
import com.max.b2c.item.dto.Product_Vo;
import com.max.b2c.item.service.ItemService;
import com.max.b2c.mapper.*;
import com.max.b2c.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ItemServiceImp implements ItemService {
    @Autowired(required = true)
    ProductAttributeNameMapper productAttributeNameMapper;

    @Autowired(required = true)
    ProductAttributeValueMapper productAttributeValueMapper;

    @Autowired(required = true)
    ProductSpecsMapper productSpecsMapper;

    @Autowired(required = true)
    ProductSpecsValueMapper productSpecsValueMapper;

    @Autowired(required = true)
    ProductSkuMapper productSkuMapper;

    @Autowired(required = true)
    ProductSpuMapper productSpuMapper;

    @Autowired(required = true)
    ProductImgMapper productImgMapper;

    @Autowired(required = true)
    ProductAttributeRelationMapper productAttributeRelationMapper;

    @Autowired(required = true)
    ProductSpecsSkuRelationMapper specsSkuRelationMapper;

    @Autowired(required = true)
    ProductSpecsDao productSpecsDao;


    @Override
    public ServerResponse addproduct(Product_Vo productVo) {
        //添加商品spu基本信息
        ProductSpu productSpu=productVo;
        int i = productSpuMapper.insertSelective(productSpu);
        Integer product_id = productSpu.getProduct_id();

        //添加商品基本规格属性
        List<ProductSpecsValue> specsList = productVo.getSpecsList();
        for(ProductSpecsValue item:specsList){
            item.setProduct_id(product_id);
        }
        int j = productSpecsDao.insertSpecs(specsList);
        if(j<0)
            return ServerResponse.createByError();

        //添加自定义规格属性
        List<ProductAttribute_Vo> attributeNameVoList = productVo.getAttributeNameVoList();



        //添加sku信息

        //添加sku属性

        //添加图片信息






        return null;
    }
}

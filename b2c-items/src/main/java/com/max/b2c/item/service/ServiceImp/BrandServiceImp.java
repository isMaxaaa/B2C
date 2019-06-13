package com.max.b2c.item.service.ServiceImp;

import com.max.b2c.common.ServerResponse;
import com.max.b2c.item.service.BrandService;
import com.max.b2c.mapper.ProductBrandMapper;
import com.max.b2c.model.ProductBrand;
import com.max.b2c.model.ProductBrandExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImp implements BrandService {
    @Autowired(required = true)
    ProductBrandMapper productBrandMapper;

    @Override
    public ServerResponse addBrand(ProductBrand productBrand) {
        try{
            productBrandMapper.insertSelective(productBrand);
        }catch (Throwable e){
            return  ServerResponse.createByErrorMessage("品牌名字重复！");
        }
        return ServerResponse.createBySuccessMessage("添加成功");
    }

    @Override
    public ServerResponse deleteBrand(Integer brand_id) {
        int i = productBrandMapper.deleteByPrimaryKey(brand_id);
        if(i>0)
            return  ServerResponse.createBySuccessMessage("删除成功");
        return ServerResponse.createByError();
    }

    @Override
    public ServerResponse updateBrand(ProductBrand productBrand) {
        int i = productBrandMapper.updateByPrimaryKeySelective(productBrand);
        if(i>0)
            return ServerResponse.createBySuccessMessage("更新成功");
        return ServerResponse.createByError();
    }

    @Override
    public ServerResponse<List<ProductBrand>> showBrands() {
        ProductBrandExample productBrandExample=new ProductBrandExample();
        productBrandExample.createCriteria().andBrand_idGreaterThan(0);
        List<ProductBrand> productBrands = productBrandMapper.selectByExample(productBrandExample);
        return ServerResponse.createBySuccess(productBrands);
    }

    @Override
    public ServerResponse<List<ProductBrand>> showUncheckBrands() {
        ProductBrandExample productBrandExample=new ProductBrandExample();
        productBrandExample.createCriteria().andBrand_checEqualTo(0);
        List<ProductBrand> productBrands = productBrandMapper.selectByExample(productBrandExample);
        return ServerResponse.createBySuccess(productBrands);
    }



}

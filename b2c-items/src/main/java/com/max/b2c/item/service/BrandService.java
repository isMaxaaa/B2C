package com.max.b2c.item.service;

import com.max.b2c.common.ServerResponse;
import com.max.b2c.model.ProductBrand;

import java.util.List;

public interface BrandService {

    ServerResponse addBrand(ProductBrand productBrand);

    ServerResponse deleteBrand(Integer brand_id);

    ServerResponse updateBrand(ProductBrand productBrand);

    ServerResponse showBrands();

    ServerResponse<List<ProductBrand>> showUncheckBrands();
}

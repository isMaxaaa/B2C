package com.max.b2c.item.service;

import com.max.b2c.common.ServerResponse;
import com.max.b2c.model.ProductCategory;
import com.max.b2c.model.ProductSpecs;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


public interface CategoryService {

    ServerResponse Addcategory(ProductCategory productCategory);

    ServerResponse Updatecategory(ProductCategory productCategory);

    ServerResponse Delcategory(Integer category_id);

    ServerResponse<List<ProductCategory>> Showcategory(Integer parent_id);

    ServerResponse<Map<String, Map<String, List<String>>>> Getcategorys();

    ServerResponse addspecs(ProductSpecs productSpecs);
}

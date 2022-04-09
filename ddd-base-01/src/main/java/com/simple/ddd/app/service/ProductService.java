package com.simple.ddd.app.service;

import com.simple.ddd.domain.product.model.vo.ProductAndSkuInfo;

import java.util.List;

/**
 * 项目: DDD-projects
 * <p>
 * 功能描述:
 *
 * @author: WuChengXing
 * @create: 2022-04-09 18:07
 **/
public interface ProductService {

    List<ProductAndSkuInfo> listProductAndSku(List<String> skuNos);
}

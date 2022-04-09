package com.simple.ddd.domain.product.model.aggregates;

import com.simple.ddd.domain.product.model.sub.SkuInfo;
import com.simple.ddd.domain.product.model.vo.ProductInfo;
import lombok.Data;

import java.util.List;

/**
 * 项目: DDD-projects
 * <p>
 * 功能描述:
 *
 * @author: WuChengXing
 * @create: 2022-04-09 18:24
 **/
@Data
public class ProductRichInfo {
    private ProductInfo productInfo;
    private List<SkuInfo> skuInfos;
}

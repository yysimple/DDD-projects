package com.simple.ddd.domain.product.model.vo;

import lombok.Data;

/**
 * 项目: DDD-projects
 * <p>
 * 功能描述:
 *
 * @author: WuChengXing
 * @create: 2022-04-09 19:55
 **/
@Data
public class ProductAndSkuInfo {
    private String productNo;
    private String productName;
    private String productDesc;
    private String skuNo;
    private String price;
    private String type;
}

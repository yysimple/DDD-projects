package com.simple.ddd.domain.product.model.sub;

import lombok.Data;

/**
 * 项目: DDD-projects
 * <p>
 * 功能描述:
 *
 * @author: WuChengXing
 * @create: 2022-04-09 18:22
 **/
@Data
public class SkuInfo {
    private String productNo;
    private String skuNo;
    private String price;
    private String type;
}

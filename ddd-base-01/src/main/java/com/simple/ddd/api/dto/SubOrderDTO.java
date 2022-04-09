package com.simple.ddd.api.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 项目: DDD-projects
 * <p>
 * 功能描述:
 *
 * @author: WuChengXing
 * @create: 2022-04-09 19:38
 **/
@Data
public class SubOrderDTO {
    private String orderNo;
    private String subOrderNo;
    private String skuNo;
    private BigDecimal price;
    private String productNo;
    private String productName;
    private String productDesc;
    private String type;
}

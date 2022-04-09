package com.simple.ddd.domain.oder.model.sub;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 项目: DDD-projects
 * <p>
 * 功能描述:
 *
 * @author: WuChengXing
 * @create: 2022-04-09 17:45
 **/
@Data
public class SubOrderInfo {
    private String orderNo;
    private String subOrderNo;
    private String productId;
    private BigDecimal price;
}

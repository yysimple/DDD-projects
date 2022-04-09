package com.simple.ddd.api.dto;

import com.simple.ddd.domain.oder.model.aggregates.OrderRichInfo;
import com.simple.ddd.domain.product.model.aggregates.ProductRichInfo;
import lombok.Data;

/**
 * 项目: DDD-projects
 * <p>
 * 功能描述:
 *
 * @author: WuChengXing
 * @create: 2022-04-09 18:00
 **/
@Data
public class OrderDTO {
    private OrderRichInfo orderRichInfo;
    private ProductRichInfo productRichInfo;
}

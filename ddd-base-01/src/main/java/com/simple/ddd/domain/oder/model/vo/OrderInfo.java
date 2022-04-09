package com.simple.ddd.domain.oder.model.vo;

import lombok.Data;

/**
 * 项目: DDD-projects
 * <p>
 * 功能描述:
 *
 * @author: WuChengXing
 * @create: 2022-04-09 17:43
 **/
@Data
public class OrderInfo {
    private String orderNo;
    private String price;
    private String orderTime;
}

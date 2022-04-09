package com.simple.ddd.domain.oder.model.form;

import lombok.Data;

/**
 * 项目: DDD-projects
 * <p>
 * 功能描述:
 *
 * @author: WuChengXing
 * @create: 2022-04-09 18:36
 **/
@Data
public class OrderForm {
    private String orderNo;
    private String priceStart;
    private String priceEnd;
    private String orderTimeStart;
    private String orderTimeEnd;
}

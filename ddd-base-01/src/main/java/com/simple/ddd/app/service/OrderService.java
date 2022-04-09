package com.simple.ddd.app.service;


import com.simple.ddd.domain.oder.model.aggregates.OrderRichInfo;

import java.util.List;

/**
 * 项目: DDD-projects
 * <p>
 * 功能描述:
 *
 * @author: WuChengXing
 * @create: 2022-04-09 17:59
 **/
public interface OrderService {

    List<OrderRichInfo> listOrder();
}

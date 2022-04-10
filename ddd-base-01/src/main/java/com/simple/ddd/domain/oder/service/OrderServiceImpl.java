package com.simple.ddd.domain.oder.service;

import com.simple.ddd.app.service.OrderService;
import com.simple.ddd.domain.oder.model.aggregates.OrderRichInfo;
import com.simple.ddd.domain.oder.model.form.OrderForm;
import com.simple.ddd.infrastructure.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 项目: DDD-projects
 * <p>
 * 功能描述:
 *
 * @author: WuChengXing
 * @create: 2022-04-09 17:52
 **/
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Override
    public List<OrderRichInfo> listOrder(OrderForm form) {
        return null;
    }
}

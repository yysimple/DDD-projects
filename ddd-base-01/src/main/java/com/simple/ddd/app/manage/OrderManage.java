package com.simple.ddd.app.manage;

import com.simple.ddd.api.dto.OrderDTO;
import com.simple.ddd.api.req.OrderRequest;
import com.simple.ddd.app.service.OrderService;
import com.simple.ddd.app.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 项目: DDD-projects
 * <p>
 * 功能描述:
 *
 * @author: WuChengXing
 * @create: 2022-04-09 18:07
 **/
@Component
@Slf4j
public class OrderManage {

    @Autowired
    private OrderService orderService;
    @Autowired
    private ProductService productService;

    /**
     * 查询产品的详细信息
     *
     * @param request
     * @return
     */
    public OrderDTO listOrderDetails(OrderRequest request) {
        orderService.
    }
}

package com.simple.ddd.api;

import com.simple.ddd.api.dto.OrderDTO;
import com.simple.ddd.api.dto.response.SimpleResponse;
import com.simple.ddd.api.req.OrderRequest;
import com.simple.ddd.app.manage.OrderManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 项目: DDD-projects
 * <p>
 * 功能描述:
 *
 * @author: WuChengXing
 * @create: 2022-04-09 18:00
 **/
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderManage orderManage;

    @PostMapping("/listOrderDetails")
    public SimpleResponse<List<OrderDTO>> listOrderDetails(@RequestBody OrderRequest request) {
        return new SimpleResponse<>(orderManage.listOrderDetails(request));
    }
}

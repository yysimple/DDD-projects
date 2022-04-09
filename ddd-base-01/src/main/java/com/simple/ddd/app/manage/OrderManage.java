package com.simple.ddd.app.manage;

import com.simple.ddd.api.dto.OrderDTO;
import com.simple.ddd.api.dto.SubOrderDTO;
import com.simple.ddd.api.req.OrderRequest;
import com.simple.ddd.app.service.OrderService;
import com.simple.ddd.app.service.ProductService;
import com.simple.ddd.domain.oder.model.aggregates.OrderRichInfo;
import com.simple.ddd.domain.oder.model.sub.SubOrderInfo;
import com.simple.ddd.domain.product.model.vo.ProductAndSkuInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
    public List<OrderDTO> listOrderDetails(OrderRequest request) {
        List<OrderRichInfo> orderRichInfos = orderService.listOrder(OrderRequest.req2form(request));
        List<OrderDTO> orderDTOS = new ArrayList<>();
        List<String> skuNos = new ArrayList<>();
        orderRichInfos.forEach(ori -> {
            List<String> collect = ori.getSubOrderInfoList().stream().map(SubOrderInfo::getSkuNo).collect(Collectors.toList());
            skuNos.addAll(collect);
        });
        // 根据sku信息查询出所有的产品信息
        List<ProductAndSkuInfo> productAndSkuInfos = productService.listProductAndSku(skuNos);
        Map<String, ProductAndSkuInfo> collect = productAndSkuInfos.stream().collect(Collectors.toMap(ProductAndSkuInfo::getSkuNo, e -> e));
        orderRichInfos.forEach(ori -> {
            OrderDTO orderDTO = new OrderDTO();
            orderDTO.setOrderInfo(ori.getOrderInfo());
            List<SubOrderDTO> subOrderDTOS = new ArrayList<>();
            // 子订单信息
            ori.getSubOrderInfoList().stream().forEach(sori -> {
                SubOrderDTO subOrderDTO = new SubOrderDTO();
                // 设置子订单信息
                BeanUtils.copyProperties(sori, subOrderDTO);
                BeanUtils.copyProperties(collect.get(sori.getSkuNo()), subOrderDTO);
                subOrderDTOS.add(subOrderDTO);
            });
            orderDTO.setSubOrderDTOS(subOrderDTOS);
            orderDTOS.add(orderDTO);
        });
        return orderDTOS;
    }
}

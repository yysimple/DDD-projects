package com.simple.ddd.api.req;

import com.simple.ddd.domain.oder.model.form.OrderForm;
import lombok.Data;

/**
 * 项目: DDD-projects
 * <p>
 * 功能描述:
 *
 * @author: WuChengXing
 * @create: 2022-04-09 18:11
 **/
@Data
public class OrderRequest {
    private String orderNo;
    private String priceStart;
    private String priceEnd;
    private String orderTimeStart;
    private String orderTimeEnd;

    public static OrderForm req2form(OrderRequest request){
        OrderForm form = new OrderForm();
        form.setOrderNo(request.getOrderNo());
        form.setPriceStart(request.getPriceStart());
        form.setPriceEnd(request.getPriceEnd());
        form.setOrderTimeStart(request.getOrderTimeStart());
        form.setOrderTimeEnd(request.getOrderTimeEnd());
        return form;
    }

}

package com.simple.ddd.domain.oder.model.aggregates;

import com.simple.ddd.domain.oder.model.sub.SubOrderInfo;
import com.simple.ddd.domain.oder.model.vo.OrderInfo;
import lombok.Data;

import java.util.List;

/**
 * 项目: DDD-projects
 * <p>
 * 功能描述:
 *
 * @author: WuChengXing
 * @create: 2022-04-09 17:48
 **/
@Data
public class OrderRichInfo {
    private OrderInfo orderInfo;
    private List<SubOrderInfo> subOrderInfoList;
}

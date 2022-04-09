package com.simple.ddd.api.dto;

import com.simple.ddd.domain.oder.model.vo.OrderInfo;
import lombok.Data;

import java.util.List;

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
    private OrderInfo orderInfo;
    private List<SubOrderDTO> subOrderDTOS;
}

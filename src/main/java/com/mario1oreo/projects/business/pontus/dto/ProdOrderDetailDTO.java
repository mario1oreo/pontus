package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */

@EqualsAndHashCode(callSuper = false)
@Data
public class ProdOrderDetailDTO extends BaseDTO {

    /**
     * 商品订单明细ID
     */
    private int prodOrderDetailId;
    /**
     * 商品订单明细编号
     */
    private int prodOrderDetailNo;
    /**
     * 商品条形码
     */
    private String prodBarCode;
    /**
     * 订单明细商品数量
     */
    private java.math.BigDecimal prodOrderDetailQuantity;
    /**
     * 记录日期
     */
    private java.time.LocalDate recordDate;
    /**
     * 状态:  0-失效  1-有效
     */
    private String status;

}

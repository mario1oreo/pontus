package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */

@EqualsAndHashCode(callSuper = false)
@Data
public class ProdOrderSummaryDTO extends BaseDTO {

    /**
     * 商品订单汇总ID
     */
    private int prodOrderSummaryId;
    /**
     * 商品订单汇总编号
     */
    private int prodOrderSummaryNo;
    /**
     * 商品订单汇总编号
     */
    private int prodOrderDetailNo;
    /**
     * 客户编号
     */
    private String pubCustomerNo;
    /**
     * 商品订单汇总金额--RMB:元
     */
    private java.math.BigDecimal prodOrderAmount;
    /**
     * 快递物流编号
     */
    private String pubExpressNo;
    /**
     * 商品订单物流费用--RMB:元
     */
    private java.math.BigDecimal pubExpressAmount;
    /**
     * 商品订单税费--RMB:元
     */
    private java.math.BigDecimal prodTaxAmount;
    /**
     * 订单汇总信息备注
     */
    private String prodOrderSummaryRemark;
    /**
     * 结算状态:  0-未结清  1-已结清
     */
    private String prodOrderSettlementFlag;
    /**
     * 记录日期
     */
    private java.time.LocalDate recordDate;
    /**
     * 状态:  0-失效  1-有效
     */
    private String status;

}

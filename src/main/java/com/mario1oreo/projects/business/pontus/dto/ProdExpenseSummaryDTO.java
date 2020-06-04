package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */

@EqualsAndHashCode(callSuper = false)
@Data
public class ProdExpenseSummaryDTO extends BaseDTO {

    /**
     * 开销汇总信息ID
     */
    private int prodExpenseSummaryId;
    /**
     * 开销汇总信息编号
     */
    private String prodExpenseSummaryNo;
    /**
     * 开销类型
     */
    private String prodExpenseSummaryType;
    /**
     * 开销费用金额--RMB:元
     */
    private java.math.BigDecimal prodExpenseSummaryAmount;
    /**
     * 开销内容说明
     */
    private String prodExpenseSummaryRemark;
    /**
     * 记录日期
     */
    private java.time.LocalDate recordDate;
    /**
     * 状态:  0-失效  1-有效
     */
    private String status;

}

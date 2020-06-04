package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */

@EqualsAndHashCode(callSuper = false)
@Data
public class ProdExpenseDetailDTO extends BaseDTO {

    /**
     * 开销汇总信息ID
     */
    private int prodExpenseDetailId;
    /**
     * 开销汇总信息编号
     */
    private String prodExpenseDetailNo;
    /**
     * 开销科目名称
     */
    private String prodExpenseDetailSubjectName;
    /**
     * 开销科目编号
     */
    private String prodExpenseDetailSubjectNo;
    /**
     * 开销费用金额--RMB:元
     */
    private java.math.BigDecimal prodExpenseDetailAmount;
    /**
     * 明细发票: 默认有发票 0-没有  1-有
     */
    private String prodExpenseDetailExistsInvoice;
    /**
     * 发票号
     */
    private String prodExpenseDetailInvoiceNo;
    /**
     * 是否公司报销: 默认报销 0-不报销  1-报销
     */
    private String prodExpenseDetailCompanyPay;
    /**
     * 开销内容说明
     */
    private String prodExpenseDetailRemark;
    /**
     * 记录日期
     */
    private java.time.LocalDate recordDate;
    /**
     * 状态:  0-失效  1-有效
     */
    private String status;

}

package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;

/**
 * @author mario1oreo
 * @date 2019-11-10
 */

@Data
public class PrdVoucherInfoDTO {

    /**
     * ID
     */
    private int id;
    /**
     * 订单凭证流水编号
     */
    private String voucherId;
    /**
     * 凭证类型
     */
    private int voucherType;
    /**
     * 凭证金额
     */
    private java.math.BigDecimal voucherAmount;
    /**
     * 实付金额
     */
    private java.math.BigDecimal voucherRealAmount;
    /**
     * 是否需要发票：0：不需要   1：需要
     */
    private int invoiceDemand;
    /**
     * 发票税率
     */
    private java.math.BigDecimal invoiceRate;
    /**
     * 发票金额
     */
    private java.math.BigDecimal invoiceAmount;
    /**
     * 发票号
     */
    private String invoiceNo;
    /**
     * 交易类型：0:支出   1:收入
     */
    private int transactionType;
    /**
     * 交易时间
     */
    private java.time.LocalDateTime transactionTime;
    /**
     * 商品ID
     */
    private String productId;
    /**
     * 商品批次号
     */
    private int batchNo;
    /**
     * 商品数量
     */
    private java.math.BigDecimal productQuantity;
    /**
     * 销售渠道
     */
    private String saleChannel;
    /**
     * 状态：0：正常   1：作废
     */
    private String state;
    /**
     * 创建时间
     */
    private java.time.LocalDateTime createTime;
    /**
     * 创建者
     */
    private String createBy;
    /**
     * 更新时间
     */
    private java.time.LocalDateTime updateTime;
    /**
     * 更新者
     */
    private String updateBy;

}

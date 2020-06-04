package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */

@EqualsAndHashCode(callSuper = false)
@Data
public class PubExpressInfoDTO extends BaseDTO {

    /**
     * 快递物流信息ID
     */
    private int pubExpressId;
    /**
     * 快递物流编号
     */
    private String pubExpressNo;
    /**
     * 快递物流公司名称
     */
    private String pubExpressCompany;
    /**
     * 发件地址信息编号
     */
    private String pubExpressSendAddressInfoNo;
    /**
     * 收件地址信息编号
     */
    private String pubExpressReceiveAddressInfoNo;
    /**
     * 快递物流费用--RMB:元
     */
    private java.math.BigDecimal pubExpressCostPrice;
    /**
     * 快递物流首重1KG费用--RMB:元
     */
    private java.math.BigDecimal pubExpressBasePrice;
    /**
     * 快递物流续重1KG费用--RMB:元
     */
    private java.math.BigDecimal pubExpressAppendPrice;
    /**
     * 快递物流重量:KG
     */
    private java.math.BigDecimal pubExpressWeight;
    /**
     * 快递物流体积:方数=运费重量KG=长(CM)×宽(CM)×高(CM)÷6000 不规则用最大长宽高
     */
    private java.math.BigDecimal pubExpressVolume;
    /**
     * 记录日期
     */
    private java.time.LocalDate recordDate;
    /**
     * 状态:  0-失效  1-有效
     */
    private String status;

}

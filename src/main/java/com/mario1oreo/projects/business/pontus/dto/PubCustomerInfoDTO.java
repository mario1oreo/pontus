package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */

@EqualsAndHashCode(callSuper = false)
@Data
public class PubCustomerInfoDTO extends BaseDTO {

    /**
     * 客户信息ID
     */
    private int pubCustomerInfoId;
    /**
     * 客户信息编号
     */
    private String pubCustomerInfoNo;
    /**
     * 商品批次编号
     */
    private String pubCustomerName;
    /**
     * 性别: N-男   F-女
     */
    private String pubCustomerSex;
    /**
     * 客户主手机号
     */
    private String pubCustomerPhoneNoM;
    /**
     * 客户副手机号
     */
    private String pubCustomerPhoneNoS;
    /**
     * 记录日期
     */
    private java.time.LocalDate recordDate;
    /**
     * 状态:  0-失效  1-有效
     */
    private String status;

}

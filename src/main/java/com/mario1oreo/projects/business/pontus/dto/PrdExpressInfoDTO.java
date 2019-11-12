package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author mario1oreo
 *
 * @date 2019-11-13
 */

@EqualsAndHashCode(callSuper = false)
@Data
public class PrdExpressInfoDTO extends BaseDTO {

    /**
     * ID
     */
    private int id;
    /**
     * 订单凭证流水编号
     */
    private String voucherId;
    /**
     * 物流信息号
     */
    private String expressId;
    /**
     * 物流公司名称
     */
    private String expressCompany;
    /**
     * 发货日期
     */
    private java.time.LocalDateTime senderTime;
    /**
     * 送达日期
     */
    private java.time.LocalDateTime receiveTime;
    /**
     * 物流耗时,单位：小时
     */
    private java.math.BigDecimal expressCostTime;
    /**
     * 物流费用,单位：元RMB
     */
    private java.math.BigDecimal expressFee;
    /**
     * 收件人姓名
     */
    private String receivePersonName;
    /**
     * 收件人电话号码
     */
    private String receivePhoneNumber;
    /**
     * 收货完整地址
     */
    private String receiveAddress;
    /**
     * 收货地址-省
     */
    private String receiveProvince;
    /**
     * 收货地址-市
     */
    private String receiveCity;
    /**
     * 收货地址-区
     */
    private String receiveRegion;
    /**
     * 收货地址-街道
     */
    private String receiveStreet;
    /**
     * 发件人姓名
     */
    private String senderPersonName;
    /**
     * 发件人电话号码
     */
    private String senderPhoneNumber;
    /**
     * 发货完整地址
     */
    private String senderAddress;
    /**
     * 发货地址-省
     */
    private String senderProvince;
    /**
     * 发货地址-市
     */
    private String senderCity;
    /**
     * 发货地址-区
     */
    private String senderRegion;
    /**
     * 发货地址-街道
     */
    private String senderStreet;

}

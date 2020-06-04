package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */

@EqualsAndHashCode(callSuper = false)
@Data
public class PubAddressInfoDTO extends BaseDTO {

    /**
     * 地址信息ID
     */
    private int pubAddressInfoId;
    /**
     * 地址信息编号
     */
    private String pubAddressInfoNo;
    /**
     * 完整详细地址
     */
    private String pubAddressFull;
    /**
     * 国家
     */
    private String pubAddressCountry;
    /**
     * 省份
     */
    private String pubAddressProvince;
    /**
     * 城市
     */
    private String pubAddressCity;
    /**
     * 区/县
     */
    private String pubAddressRegion;
    /**
     * 具体地址:小区/楼号/楼层/户
     */
    private String pubAddressStreet;
    /**
     * 邮政编码
     */
    private String pubAddressZipCode;
    /**
     * 记录日期
     */
    private java.time.LocalDate recordDate;
    /**
     * 状态:  0-失效  1-有效
     */
    private String status;

}

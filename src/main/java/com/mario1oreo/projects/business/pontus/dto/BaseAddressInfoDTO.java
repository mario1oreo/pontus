package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;

/**
 * @author mario1oreo
 * @date 2019-11-10
 */

@Data
public class BaseAddressInfoDTO {

    /**
     * ID
     */
    private int id;
    /**
     * 地址编号
     */
    private String addressId;
    /**
     * 地址全称
     */
    private String addressFull;
    /**
     * 完整地址
     */
    private String addressAddress;
    /**
     * 地址-省
     */
    private String addressProvince;
    /**
     * 地址-市
     */
    private String addressCity;
    /**
     * 地址-区
     */
    private String addressRegion;
    /**
     * 地址-街道
     */
    private String addressStreet;
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

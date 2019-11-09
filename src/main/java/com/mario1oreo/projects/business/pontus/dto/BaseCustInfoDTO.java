package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;

/**
 * @author mario1oreo
 * @date 2019-11-10
 */

@Data
public class BaseCustInfoDTO {

    /**
     * ID
     */
    private int id;
    /**
     * 客户编号
     */
    private String custId;
    /**
     * 客户姓名
     */
    private String custName;
    /**
     * 客户电话号码
     */
    private String custPhoneNumber;
    /**
     * 客户性别 0:女 1:男
     */
    private int custSex;
    /**
     * 客户备注信息
     */
    private String description;
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

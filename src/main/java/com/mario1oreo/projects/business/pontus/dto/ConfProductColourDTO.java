package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;

/**
 * @author mario1oreo
 * @date 2019-11-10
 */

@Data
public class ConfProductColourDTO {

    /**
     * ID
     */
    private int id;
    /**
     * 颜色ID
     */
    private int formatColourId;
    /**
     * 颜色色号编码 RGB色号 #开头
     */
    private String formatColourCode;
    /**
     * 颜色名称
     */
    private String formatColourName;
    /**
     * 颜色类别 英文命名
     */
    private String formatColourClass;
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

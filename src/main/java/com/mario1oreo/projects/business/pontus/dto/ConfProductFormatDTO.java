package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;

/**
 * @author mario1oreo
 * @date 2019-11-10
 */

@Data
public class ConfProductFormatDTO {

    /**
     * ID
     */
    private int id;
    /**
     * 规格ID
     */
    private int formatId;
    /**
     * 规格编号
     */
    private String formatCode;
    /**
     * 规格长度,单位:毫米 mm
     */
    private int formatLength;
    /**
     * 规格宽度,单位:毫米 mm
     */
    private int formatWidth;
    /**
     * 规格高度,单位:毫米 mm
     */
    private int formatHeight;
    /**
     * 规格重量,单位:克 g
     */
    private int formatWeight;
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

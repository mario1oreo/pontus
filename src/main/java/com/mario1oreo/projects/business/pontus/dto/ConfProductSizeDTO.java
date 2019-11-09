package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;

/**
 * @author mario1oreo
 * @date 2019-11-10
 */

@Data
public class ConfProductSizeDTO {

    /**
     * ID
     */
    private int id;
    /**
     * 尺码ID
     */
    private int formatSizeId;
    /**
     * 尺寸码 鞋子EUR 欧码  衣服标准码
     */
    private String formatSizeCode;
    /**
     * 尺码名称
     */
    private String formatSizeName;
    /**
     * 尺码类型  鞋子 欧码
     */
    private String formatSizeClass;
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

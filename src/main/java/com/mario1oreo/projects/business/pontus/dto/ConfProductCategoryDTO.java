package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;

/**
 * @author mario1oreo
 * @date 2019-11-10
 */

@Data
public class ConfProductCategoryDTO {

    /**
     * ID
     */
    private int id;
    /**
     * 产品类别ID
     */
    private String productCategoryId;
    /**
     * 产品类别编码
     */
    private String productCategoryCode;
    /**
     * 产品类别名称
     */
    private String productCategoryName;
    /**
     * 产品类别级别 1 2 3
     */
    private int productCategoryLevel;
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

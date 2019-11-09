package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;

/**
 * @author mario1oreo
 * @date 2019-11-10
 */

@Data
public class BiInventoryInfoDTO {

    /**
     * ID
     */
    private int id;
    /**
     * 商品ID
     */
    private String productId;
    /**
     * 商品批次号
     */
    private int batchNo;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 产品规格单位
     */
    private String productUnit;
    /**
     * 商品数量
     */
    private java.math.BigDecimal productQuantity;
    /**
     * 日期分区
     */
    private java.time.LocalDate partitionDt;
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

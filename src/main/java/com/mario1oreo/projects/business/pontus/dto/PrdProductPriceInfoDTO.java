package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;

/**
 * @author mario1oreo
 * @date 2019-11-10
 */

@Data
public class PrdProductPriceInfoDTO {

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
     * 采购价格
     */
    private java.math.BigDecimal buyPrice;
    /**
     * 出售价格
     */
    private java.math.BigDecimal salePrice;
    /**
     * 成本价格
     */
    private java.math.BigDecimal costPrice;
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

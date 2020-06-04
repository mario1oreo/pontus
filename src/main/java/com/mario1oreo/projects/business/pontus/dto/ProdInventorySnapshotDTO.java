package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */

@EqualsAndHashCode(callSuper = false)
@Data
public class ProdInventorySnapshotDTO extends BaseDTO {

    /**
     * 商品库存快照ID
     */
    private int prodInventorySnapshotId;
    /**
     * 商品库存信息ID
     */
    private int prodInventorySummaryId;
    /**
     * 商品条形码
     */
    private String prodBarCode;
    /**
     * 商品库存数量
     */
    private java.math.BigDecimal prodInventoryQuantity;
    /**
     * 记录日期
     */
    private java.time.LocalDate recordDate;
    /**
     * 库存信息版本
     */
    private int prodInventoryVersion;
    /**
     * 状态:  0-失效  1-有效
     */
    private String status;

}

package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */

@EqualsAndHashCode(callSuper = false)
@Data
public class ProdInventorySummaryDTO extends BaseDTO {

    /**
     * 商品库存信息ID
     */
    private int prodInventorySummaryId;
    /**
     * 商品库存数量
     */
    private java.math.BigDecimal prodInventoryQuantity;
    /**
     * 库存单位:默认:个=件,套,双,若为重量，则默认个=KG
     */
    private String prodInventoryUnit;
    /**
     * 商品条形码
     */
    private String prodBarCode;
    /**
     * 状态:  0-失效  1-有效
     */
    private String status;

}

package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */

@EqualsAndHashCode(callSuper = false)
@Data
public class ProdProductPriceDTO extends BaseDTO {

    /**
     * 商品价格ID
     */
    private int prodProductPriceId;
    /**
     * 商品价格编号
     */
    private String prodProductPriceNo;
    /**
     * 商品批次编号
     */
    private String prodProductBatchNo;
    /**
     * 商品条形码
     */
    private String prodBarCode;
    /**
     * 商品成本价格--RMB:元
     */
    private java.math.BigDecimal prodCostPrice;
    /**
     * 商品销售价格--RMB:元
     */
    private java.math.BigDecimal prodSellPrice;
    /**
     * 商品VIP价格--RMB:元
     */
    private java.math.BigDecimal prodVipSellPrice;
    /**
     * 记录日期
     */
    private java.time.LocalDate recordDate;
    /**
     * 状态:  0-失效  1-有效
     */
    private String status;

}

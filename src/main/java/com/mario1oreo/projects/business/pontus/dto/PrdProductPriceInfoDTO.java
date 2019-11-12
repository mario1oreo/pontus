package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author mario1oreo
 *
 * @date 2019-11-13
 */

@EqualsAndHashCode(callSuper = false)
@Data
public class PrdProductPriceInfoDTO extends BaseDTO {

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

}

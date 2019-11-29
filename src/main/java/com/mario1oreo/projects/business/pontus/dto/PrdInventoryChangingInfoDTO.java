package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author mario1oreo
 *
 * @date 2019-11-20
 */

@EqualsAndHashCode(callSuper = false)
@Data
public class PrdInventoryChangingInfoDTO extends BaseDTO {

    /**
     * ID
     */
    private int id;
    /**
     * 订单凭证流水编号
     */
    private String voucherId;
    /**
     * 商品ID
     */
    private String productId;
    /**
     * 商品批次号
     */
    private int batchNo;
    /**
     * 产品规格单位
     */
    private String productUnit;
    /**
     * 商品数量,增加库存正数，减少库存负数
     */
    private java.math.BigDecimal productQuantity;

}

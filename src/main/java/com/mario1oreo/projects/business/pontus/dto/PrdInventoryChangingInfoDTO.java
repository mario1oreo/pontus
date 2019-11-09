package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;

/**
 * @author mario1oreo
 * @date 2019-11-10
 */

@Data
public class PrdInventoryChangingInfoDTO {

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
     * 商品名称
     */
    private String productName;
    /**
     * 产品规格单位
     */
    private String productUnit;
    /**
     * 商品数量,增加库存正数，减少库存负数
     */
    private java.math.BigDecimal productQuantity;
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

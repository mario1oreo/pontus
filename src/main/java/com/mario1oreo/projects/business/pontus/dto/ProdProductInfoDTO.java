package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */

@EqualsAndHashCode(callSuper = false)
@Data
public class ProdProductInfoDTO extends BaseDTO {

    /**
     * 商品信息ID
     */
    private int prodProductInfoId;
    /**
     * 商品信息编号
     */
    private String prodProductInfoNo;
    /**
     * 商品名称
     */
    private String prodProductName;
    /**
     * 商品条形码
     */
    private String prodBarCode;
    /**
     * 商品批次编号
     */
    private String prodProductBatchNo;
    /**
     * 商品价格编号
     */
    private String prodProductPriceNo;
    /**
     * 商品分类1级
     */
    private String prodProductCategory1;
    /**
     * 商品分类2级
     */
    private String prodProductCategory2;
    /**
     * 商品分类3级
     */
    private String prodProductCategory3;
    /**
     * 商品分类4级
     */
    private String prodProductCategory4;
    /**
     * 商品信息备注
     */
    private String prodProductRemark;
    /**
     * 记录日期
     */
    private java.time.LocalDate recordDate;
    /**
     * 状态:  0-失效  1-有效
     */
    private String status;

}

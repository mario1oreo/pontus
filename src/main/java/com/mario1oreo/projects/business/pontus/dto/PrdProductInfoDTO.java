package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;

/**
 * @author mario1oreo
 * @date 2019-11-10
 */

@Data
public class PrdProductInfoDTO {

    /**
     * ID
     */
    private int id;
    /**
     * 条形码
     */
    private String barCode;
    /**
     * 商品ID
     */
    private String productId;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 商品类别:一级
     */
    private String productCategoryOne;
    /**
     * 商品类别:二级
     */
    private String productCategoryTwo;
    /**
     * 产品度量单位
     */
    private String productUnit;
    /**
     * 商品描述信息
     */
    private String description;
    /**
     * 产品颜色
     */
    private int formatColourId;
    /**
     * 产品尺码
     */
    private int formatSizeId;
    /**
     * 产品规格
     */
    private int formatId;
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

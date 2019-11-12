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
public class PrdProductInfoDTO extends BaseDTO {

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

}

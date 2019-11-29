package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class ShowGoodsBO extends BaseDTO {

    /**
     * 商品ID
     */
    private String productId;
    /**
     * 条形码
     */
    private String barCode;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 商品数量
     */
    private java.math.BigDecimal productQuantity;
    /**
     * 产品度量单位
     */
    private String productUnit;
    /**
     * 商品类别:一级
     */
    private String productCategoryOne;
    /**
     * 商品类别:二级
     */
    private String productCategoryTwo;
    /**
     * 商品类别:三级
     */
    private String productCategoryThr;
    /**
     * 商品类别:四级
     */
    private String productCategoryFor;
    /**
     * 产品颜色
     */
    private String formatColourName;
    /**
     * 产品尺码
     */
    private String formatSizeCode;
    /**
     * 产品规格
     */
    private String formatCode;
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
     * 商品描述信息
     */
    private String description;


}

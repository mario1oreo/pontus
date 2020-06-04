package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */

@EqualsAndHashCode(callSuper = false)
@Data
public class ProdBarCodeDTO extends BaseDTO {

    /**
     * 商品条形码
     */
    private String confBarCode;
    /**
     * 商品信息编号
     */
    private String prodProductInfoNo;
    /**
     * 商品名称
     */
    private String prodProductName;
    /**
     * 记录日期
     */
    private java.time.LocalDate recordDate;

}

package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author mario1oreo
 * @date 2019-11-18
 */

@EqualsAndHashCode(callSuper = false)
@Data
public class ConfBarCodeDTO extends BaseDTO {

    /**
     * 条形码编码
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

}

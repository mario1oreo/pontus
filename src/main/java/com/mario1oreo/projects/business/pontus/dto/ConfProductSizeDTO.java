package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author mario1oreo
 *
 * @date 2019-11-18
 */

@EqualsAndHashCode(callSuper = false)
@Data
public class ConfProductSizeDTO extends BaseDTO {

    /**
     * ID
     */
    private int id;
    /**
     * 尺码ID
     */
    private int formatSizeId;
    /**
     * 尺寸码 鞋子EUR 欧码  衣服标准码
     */
    private String formatSizeCode;
    /**
     * 尺码名称
     */
    private String formatSizeName;
    /**
     * 尺码类型  鞋子 欧码
     */
    private String formatSizeClass;
    /**
     * 尺寸信息备注说明
     */
    private String formatSizeMemo;

}

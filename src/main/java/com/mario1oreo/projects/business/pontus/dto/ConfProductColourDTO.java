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
public class ConfProductColourDTO extends BaseDTO {

    /**
     * ID
     */
    private int id;
    /**
     * 颜色ID
     */
    private int formatColourId;
    /**
     * 颜色色号编码 RGB色号 #开头
     */
    private String formatColourCode;
    /**
     * 颜色名称
     */
    private String formatColourName;
    /**
     * 颜色类别 英文命名
     */
    private String formatColourClass;
    /**
     * 颜色信息备注说明
     */
    private String formatColourMemo;

}

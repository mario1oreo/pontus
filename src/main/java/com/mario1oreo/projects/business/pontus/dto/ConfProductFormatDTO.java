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
public class ConfProductFormatDTO extends BaseDTO {

    /**
     * ID
     */
    private int id;
    /**
     * 规格ID
     */
    private int formatId;
    /**
     * 规格编号
     */
    private String formatCode;
    /**
     * 规格长度,单位:毫米 mm
     */
    private int formatLength;
    /**
     * 规格宽度,单位:毫米 mm
     */
    private int formatWidth;
    /**
     * 规格高度,单位:毫米 mm
     */
    private int formatHeight;
    /**
     * 规格重量,单位:克 g
     */
    private int formatWeight;

}

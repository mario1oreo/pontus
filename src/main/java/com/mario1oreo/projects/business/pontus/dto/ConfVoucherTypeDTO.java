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
public class ConfVoucherTypeDTO extends BaseDTO {

    /**
     * ID
     */
    private int id;
    /**
     * 凭证类型
     */
    private int voucherType;
    /**
     * 凭证类型说明
     */
    private String voucherTypeMemo;

}

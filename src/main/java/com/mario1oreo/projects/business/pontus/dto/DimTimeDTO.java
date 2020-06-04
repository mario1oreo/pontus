package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */

@EqualsAndHashCode(callSuper = false)
@Data
public class DimTimeDTO extends BaseDTO {

    /**
     * 时间ID
     */
    private int timeId;
    /**
     * 时间编码 格式[HH:mm:ss]
     */
    private String timeCode;
    /**
     * 上午/下午,AM/PM
     */
    private String amPm;
    /**
     * 小时
     */
    private int hour;
    /**
     * 分钟
     */
    private int minute;
    /**
     * 秒
     */
    private int second;
    /**
     * 所在天的第几秒
     */
    private int secondOfDay;
    /**
     * 所在小时的第几秒
     */
    private int secondOfHour;
    /**
     * 秒所在分钟是当天的第几分钟
     */
    private int secondOfMinuteInDay;

}

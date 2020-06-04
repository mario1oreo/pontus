package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */

@EqualsAndHashCode(callSuper = false)
@Data
public class DimDateDTO extends BaseDTO {

    /**
     * 日期ID
     */
    private int dateId;
    /**
     * 日期编码
     */
    private String dateCode;
    /**
     * 日期值
     */
    private java.time.LocalDate dateValue;
    /**
     * 是否闰年
     */
    private int isLeapYear;
    /**
     * 是否周末
     */
    private int isWeekend;
    /**
     * 是否节假日
     */
    private int isHoliday;
    /**
     * 年份
     */
    private int year;
    /**
     * 季度
     */
    private int quarter;
    /**
     * 月份
     */
    private int month;
    /**
     * 所在月份的第几天
     */
    private int dayOfMonth;
    /**
     * 所在年份的第几周
     */
    private int weekOfYear;
    /**
     * 所在月份的第几周
     */
    private int weekOfMonth;
    /**
     * 所在年的第几天
     */
    private int dayOfYear;
    /**
     * 所在周的第几天，周日第1天，周一第2天
     */
    private int dayOfWeek;
    /**
     * 天所在周是这个月的第几周
     */
    private int dayOfWeekInMonth;
    /**
     * 天所在的日期年份和季度 格式：[20193]表示2019年第三季度
     */
    private int dayOfYearAndQuarter;
    /**
     * 天所在的日期是上半年还是下半年  0:上半年 1:下半年
     */
    private int dayOfFirstHalfOfYear;

}

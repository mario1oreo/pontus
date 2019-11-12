package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author mario1oreo
 * @date 2019-11-13
 */

@EqualsAndHashCode(callSuper = false)
@Data
public class Cnarea2018DTO extends BaseDTO {

    private int id;
    /**
     * 层级
     */
    private int level;
    /**
     * 父级行政代码
     */
    private int parentCode;
    /**
     * 行政代码
     */
    private int areaCode;
    /**
     * 邮政编码
     */
    private int zipCode;
    /**
     * 区号
     */
    private String cityCode;
    /**
     * 名称
     */
    private String name;
    /**
     * 简称
     */
    private String shortName;
    /**
     * 组合名
     */
    private String mergerName;
    /**
     * 拼音
     */
    private String pinyin;
    /**
     * 经度
     */
    private java.math.BigDecimal lng;
    /**
     * 纬度
     */
    private java.math.BigDecimal lat;

}

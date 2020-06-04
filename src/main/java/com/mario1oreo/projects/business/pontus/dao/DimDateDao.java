package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.DimDateDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */
@Mapper
public interface DimDateDao {


    @Select("SELECT  DATE_ID, DATE_CODE, DATE_VALUE, IS_LEAP_YEAR, IS_WEEKEND, IS_HOLIDAY, YEAR, QUARTER, MONTH, DAY_OF_MONTH, WEEK_OF_YEAR, WEEK_OF_MONTH, DAY_OF_YEAR, DAY_OF_WEEK, DAY_OF_WEEK_IN_MONTH, DAY_OF_YEAR_AND_QUARTER, DAY_OF_FIRST_HALF_OF_YEAR, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM DIM_DATE")
    @Results({
            @Result(column = "DATE_ID", property = "dateId"),
            @Result(column = "DATE_CODE", property = "dateCode"),
            @Result(column = "DATE_VALUE", property = "dateValue"),
            @Result(column = "IS_LEAP_YEAR", property = "isLeapYear"),
            @Result(column = "IS_WEEKEND", property = "isWeekend"),
            @Result(column = "IS_HOLIDAY", property = "isHoliday"),
            @Result(column = "YEAR", property = "year"),
            @Result(column = "QUARTER", property = "quarter"),
            @Result(column = "MONTH", property = "month"),
            @Result(column = "DAY_OF_MONTH", property = "dayOfMonth"),
            @Result(column = "WEEK_OF_YEAR", property = "weekOfYear"),
            @Result(column = "WEEK_OF_MONTH", property = "weekOfMonth"),
            @Result(column = "DAY_OF_YEAR", property = "dayOfYear"),
            @Result(column = "DAY_OF_WEEK", property = "dayOfWeek"),
            @Result(column = "DAY_OF_WEEK_IN_MONTH", property = "dayOfWeekInMonth"),
            @Result(column = "DAY_OF_YEAR_AND_QUARTER", property = "dayOfYearAndQuarter"),
            @Result(column = "DAY_OF_FIRST_HALF_OF_YEAR", property = "dayOfFirstHalfOfYear"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<DimDateDTO> findAll();

    @Select("SELECT  DATE_ID, DATE_CODE, DATE_VALUE, IS_LEAP_YEAR, IS_WEEKEND, IS_HOLIDAY, YEAR, QUARTER, MONTH, DAY_OF_MONTH, WEEK_OF_YEAR, WEEK_OF_MONTH, DAY_OF_YEAR, DAY_OF_WEEK, DAY_OF_WEEK_IN_MONTH, DAY_OF_YEAR_AND_QUARTER, DAY_OF_FIRST_HALF_OF_YEAR, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM DIM_DATE LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "DATE_ID", property = "dateId"),
            @Result(column = "DATE_CODE", property = "dateCode"),
            @Result(column = "DATE_VALUE", property = "dateValue"),
            @Result(column = "IS_LEAP_YEAR", property = "isLeapYear"),
            @Result(column = "IS_WEEKEND", property = "isWeekend"),
            @Result(column = "IS_HOLIDAY", property = "isHoliday"),
            @Result(column = "YEAR", property = "year"),
            @Result(column = "QUARTER", property = "quarter"),
            @Result(column = "MONTH", property = "month"),
            @Result(column = "DAY_OF_MONTH", property = "dayOfMonth"),
            @Result(column = "WEEK_OF_YEAR", property = "weekOfYear"),
            @Result(column = "WEEK_OF_MONTH", property = "weekOfMonth"),
            @Result(column = "DAY_OF_YEAR", property = "dayOfYear"),
            @Result(column = "DAY_OF_WEEK", property = "dayOfWeek"),
            @Result(column = "DAY_OF_WEEK_IN_MONTH", property = "dayOfWeekInMonth"),
            @Result(column = "DAY_OF_YEAR_AND_QUARTER", property = "dayOfYearAndQuarter"),
            @Result(column = "DAY_OF_FIRST_HALF_OF_YEAR", property = "dayOfFirstHalfOfYear"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<DimDateDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO DIM_DATE( DATE_ID, DATE_CODE, DATE_VALUE, IS_LEAP_YEAR, IS_WEEKEND, IS_HOLIDAY, YEAR, QUARTER, MONTH, DAY_OF_MONTH, WEEK_OF_YEAR, WEEK_OF_MONTH, DAY_OF_YEAR, DAY_OF_WEEK, DAY_OF_WEEK_IN_MONTH, DAY_OF_YEAR_AND_QUARTER, DAY_OF_FIRST_HALF_OF_YEAR, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{dateId}, #{dateCode}, #{dateValue}, #{isLeapYear}, #{isWeekend}, #{isHoliday}, #{year}, #{quarter}, #{month}, #{dayOfMonth}, #{weekOfYear}, #{weekOfMonth}, #{dayOfYear}, #{dayOfWeek}, #{dayOfWeekInMonth}, #{dayOfYearAndQuarter}, #{dayOfFirstHalfOfYear}, #{state}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(DimDateDTO dimDateDTO);

}

package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.DimTimeDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 * @date 2019-11-13
 */
@Mapper
public interface DimTimeDao {


    @Select("SELECT  TIME_ID, TIME_CODE, AM_PM, HOUR, MINUTE, SECOND, SECOND_OF_DAY, SECOND_OF_HOUR, SECOND_OF_MINUTE_IN_DAY, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM DIM_TIME")
    @Results({
            @Result(column = "TIME_ID", property = "timeId"),
            @Result(column = "TIME_CODE", property = "timeCode"),
            @Result(column = "AM_PM", property = "amPm"),
            @Result(column = "HOUR", property = "hour"),
            @Result(column = "MINUTE", property = "minute"),
            @Result(column = "SECOND", property = "second"),
            @Result(column = "SECOND_OF_DAY", property = "secondOfDay"),
            @Result(column = "SECOND_OF_HOUR", property = "secondOfHour"),
            @Result(column = "SECOND_OF_MINUTE_IN_DAY", property = "secondOfMinuteInDay"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<DimTimeDTO> findAll();

    @Select("SELECT  TIME_ID, TIME_CODE, AM_PM, HOUR, MINUTE, SECOND, SECOND_OF_DAY, SECOND_OF_HOUR, SECOND_OF_MINUTE_IN_DAY, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM DIM_TIME LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "TIME_ID", property = "timeId"),
            @Result(column = "TIME_CODE", property = "timeCode"),
            @Result(column = "AM_PM", property = "amPm"),
            @Result(column = "HOUR", property = "hour"),
            @Result(column = "MINUTE", property = "minute"),
            @Result(column = "SECOND", property = "second"),
            @Result(column = "SECOND_OF_DAY", property = "secondOfDay"),
            @Result(column = "SECOND_OF_HOUR", property = "secondOfHour"),
            @Result(column = "SECOND_OF_MINUTE_IN_DAY", property = "secondOfMinuteInDay"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<DimTimeDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO DIM_TIME( TIME_ID, TIME_CODE, AM_PM, HOUR, MINUTE, SECOND, SECOND_OF_DAY, SECOND_OF_HOUR, SECOND_OF_MINUTE_IN_DAY, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{timeId}, #{timeCode}, #{amPm}, #{hour}, #{minute}, #{second}, #{secondOfDay}, #{secondOfHour}, #{secondOfMinuteInDay}, #{state}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(DimTimeDTO dimTimeDTO);

}

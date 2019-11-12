package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.ConfProductFormatDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 *
 * @date 2019-11-13
 *
 */
@Mapper
public interface ConfProductFormatDao {


    @Select("SELECT  ID, FORMAT_ID, FORMAT_CODE, FORMAT_LENGTH, FORMAT_WIDTH, FORMAT_HEIGHT, FORMAT_WEIGHT, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM CONF_PRODUCT_FORMAT")
    @Results({
            @Result(column = "ID", property = "id"),
            @Result(column = "FORMAT_ID", property = "formatId"),
            @Result(column = "FORMAT_CODE", property = "formatCode"),
            @Result(column = "FORMAT_LENGTH", property = "formatLength"),
            @Result(column = "FORMAT_WIDTH", property = "formatWidth"),
            @Result(column = "FORMAT_HEIGHT", property = "formatHeight"),
            @Result(column = "FORMAT_WEIGHT", property = "formatWeight"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ConfProductFormatDTO> findAll();

    @Select("SELECT  ID, FORMAT_ID, FORMAT_CODE, FORMAT_LENGTH, FORMAT_WIDTH, FORMAT_HEIGHT, FORMAT_WEIGHT, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM CONF_PRODUCT_FORMAT LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "ID", property = "id"),
            @Result(column = "FORMAT_ID", property = "formatId"),
            @Result(column = "FORMAT_CODE", property = "formatCode"),
            @Result(column = "FORMAT_LENGTH", property = "formatLength"),
            @Result(column = "FORMAT_WIDTH", property = "formatWidth"),
            @Result(column = "FORMAT_HEIGHT", property = "formatHeight"),
            @Result(column = "FORMAT_WEIGHT", property = "formatWeight"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ConfProductFormatDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO CONF_PRODUCT_FORMAT( ID, FORMAT_ID, FORMAT_CODE, FORMAT_LENGTH, FORMAT_WIDTH, FORMAT_HEIGHT, FORMAT_WEIGHT, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{id}, #{formatId}, #{formatCode}, #{formatLength}, #{formatWidth}, #{formatHeight}, #{formatWeight}, #{state}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(ConfProductFormatDTO confProductFormatDTO);

}

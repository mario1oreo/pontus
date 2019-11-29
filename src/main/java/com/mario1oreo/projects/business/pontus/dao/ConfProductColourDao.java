package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.ConfProductColourDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 *
 * @date 2019-11-18
 *
 */
@Mapper
public interface ConfProductColourDao {


    @Select("SELECT  ID, FORMAT_COLOUR_ID, FORMAT_COLOUR_CODE, FORMAT_COLOUR_NAME, FORMAT_COLOUR_CLASS, FORMAT_COLOUR_MEMO, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM CONF_PRODUCT_COLOUR")
    @Results({
            @Result(column = "ID", property = "id"),
            @Result(column = "FORMAT_COLOUR_ID", property = "formatColourId"),
            @Result(column = "FORMAT_COLOUR_CODE", property = "formatColourCode"),
            @Result(column = "FORMAT_COLOUR_NAME", property = "formatColourName"),
            @Result(column = "FORMAT_COLOUR_CLASS", property = "formatColourClass"),
            @Result(column = "FORMAT_COLOUR_MEMO", property = "formatColourMemo"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ConfProductColourDTO> findAll();

    @Select("SELECT  ID, FORMAT_COLOUR_ID, FORMAT_COLOUR_CODE, FORMAT_COLOUR_NAME, FORMAT_COLOUR_CLASS, FORMAT_COLOUR_MEMO, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM CONF_PRODUCT_COLOUR LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "ID", property = "id"),
            @Result(column = "FORMAT_COLOUR_ID", property = "formatColourId"),
            @Result(column = "FORMAT_COLOUR_CODE", property = "formatColourCode"),
            @Result(column = "FORMAT_COLOUR_NAME", property = "formatColourName"),
            @Result(column = "FORMAT_COLOUR_CLASS", property = "formatColourClass"),
            @Result(column = "FORMAT_COLOUR_MEMO", property = "formatColourMemo"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ConfProductColourDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Select("SELECT MAX(FORMAT_COLOUR_ID)+1 FROM CONF_PRODUCT_COLOUR")
    int findNextFormatColourId();

    @Insert("INSERT INTO CONF_PRODUCT_COLOUR( ID, FORMAT_COLOUR_ID, FORMAT_COLOUR_CODE, FORMAT_COLOUR_NAME, FORMAT_COLOUR_CLASS, FORMAT_COLOUR_MEMO, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{id}, #{formatColourId}, #{formatColourCode}, #{formatColourName}, #{formatColourClass}, #{formatColourMemo}, #{state}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(ConfProductColourDTO confProductColourDTO);

}

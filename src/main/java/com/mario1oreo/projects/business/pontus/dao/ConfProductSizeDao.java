package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.ConfProductSizeDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 *
 * @date 2019-11-13
 *
 */
@Mapper
public interface ConfProductSizeDao {


    @Select("SELECT  ID, FORMAT_SIZE_ID, FORMAT_SIZE_CODE, FORMAT_SIZE_NAME, FORMAT_SIZE_CLASS, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM CONF_PRODUCT_SIZE")
    @Results({
            @Result(column = "ID", property = "id"),
            @Result(column = "FORMAT_SIZE_ID", property = "formatSizeId"),
            @Result(column = "FORMAT_SIZE_CODE", property = "formatSizeCode"),
            @Result(column = "FORMAT_SIZE_NAME", property = "formatSizeName"),
            @Result(column = "FORMAT_SIZE_CLASS", property = "formatSizeClass"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ConfProductSizeDTO> findAll();

    @Select("SELECT  ID, FORMAT_SIZE_ID, FORMAT_SIZE_CODE, FORMAT_SIZE_NAME, FORMAT_SIZE_CLASS, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM CONF_PRODUCT_SIZE LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "ID", property = "id"),
            @Result(column = "FORMAT_SIZE_ID", property = "formatSizeId"),
            @Result(column = "FORMAT_SIZE_CODE", property = "formatSizeCode"),
            @Result(column = "FORMAT_SIZE_NAME", property = "formatSizeName"),
            @Result(column = "FORMAT_SIZE_CLASS", property = "formatSizeClass"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ConfProductSizeDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO CONF_PRODUCT_SIZE( ID, FORMAT_SIZE_ID, FORMAT_SIZE_CODE, FORMAT_SIZE_NAME, FORMAT_SIZE_CLASS, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{id}, #{formatSizeId}, #{formatSizeCode}, #{formatSizeName}, #{formatSizeClass}, #{state}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(ConfProductSizeDTO confProductSizeDTO);

}

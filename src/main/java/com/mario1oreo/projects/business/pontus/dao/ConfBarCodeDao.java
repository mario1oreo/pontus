package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.ConfBarCodeDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 * @date 2019-11-18
 */
@Mapper
public interface ConfBarCodeDao {


    @Select("SELECT  BAR_CODE, PRODUCT_ID, PRODUCT_NAME, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM CONF_BAR_CODE")
    @Results({
            @Result(column = "BAR_CODE", property = "barCode"),
            @Result(column = "PRODUCT_ID", property = "productId"),
            @Result(column = "PRODUCT_NAME", property = "productName"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ConfBarCodeDTO> findAll();

    @Select("SELECT  BAR_CODE, PRODUCT_ID, PRODUCT_NAME, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM CONF_BAR_CODE LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "BAR_CODE", property = "barCode"),
            @Result(column = "PRODUCT_ID", property = "productId"),
            @Result(column = "PRODUCT_NAME", property = "productName"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ConfBarCodeDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Select("SELECT  BAR_CODE, PRODUCT_ID, PRODUCT_NAME, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM CONF_BAR_CODE WHERE STATE = '0' LIMIT 1")
    @Results({
            @Result(column = "BAR_CODE", property = "barCode"),
            @Result(column = "PRODUCT_ID", property = "productId"),
            @Result(column = "PRODUCT_NAME", property = "productName"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    ConfBarCodeDTO findUnUseOne();

    @Insert("UPDATE CONF_BAR_CODE SET STATE='1',PRODUCT_ID=#{productId},PRODUCT_NAME=#{productName} WHERE BAR_CODE=#{barCode} AND STATE='0'")
    int updateToUsedByBarCode(ConfBarCodeDTO confBarCodeDTO);


    @Insert("INSERT INTO CONF_BAR_CODE( BAR_CODE, PRODUCT_ID, PRODUCT_NAME, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{barCode}, #{productId}, #{productName}, #{state}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(ConfBarCodeDTO confBarCodeDTO);

}

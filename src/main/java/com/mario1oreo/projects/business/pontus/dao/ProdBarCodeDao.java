package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.ProdBarCodeDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */
@Mapper
public interface ProdBarCodeDao {


    @Select("SELECT  CONF_BAR_CODE, PROD_PRODUCT_INFO_NO, PROD_PRODUCT_NAME, RECORD_DATE, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PROD_BAR_CODE")
    @Results({
            @Result(column = "CONF_BAR_CODE", property = "confBarCode"),
            @Result(column = "PROD_PRODUCT_INFO_NO", property = "prodProductInfoNo"),
            @Result(column = "PROD_PRODUCT_NAME", property = "prodProductName"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ProdBarCodeDTO> findAll();

    @Select("SELECT  CONF_BAR_CODE, PROD_PRODUCT_INFO_NO, PROD_PRODUCT_NAME, RECORD_DATE, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PROD_BAR_CODE LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "CONF_BAR_CODE", property = "confBarCode"),
            @Result(column = "PROD_PRODUCT_INFO_NO", property = "prodProductInfoNo"),
            @Result(column = "PROD_PRODUCT_NAME", property = "prodProductName"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ProdBarCodeDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO PROD_BAR_CODE( CONF_BAR_CODE, PROD_PRODUCT_INFO_NO, PROD_PRODUCT_NAME, RECORD_DATE, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{confBarCode}, #{prodProductInfoNo}, #{prodProductName}, #{recordDate}, #{state}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(ProdBarCodeDTO prodBarCodeDTO);

}

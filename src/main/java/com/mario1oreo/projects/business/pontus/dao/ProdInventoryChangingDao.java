package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.ProdInventoryChangingDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */
@Mapper
public interface ProdInventoryChangingDao {


    @Select("SELECT  PROD_INVENTORY_CHANGING_ID, PROD_BAR_CODE, PROD_INVENTORY_QUANTITY, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PROD_INVENTORY_CHANGING")
    @Results({
            @Result(column = "PROD_INVENTORY_CHANGING_ID", property = "prodInventoryChangingId"),
            @Result(column = "PROD_BAR_CODE", property = "prodBarCode"),
            @Result(column = "PROD_INVENTORY_QUANTITY", property = "prodInventoryQuantity"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ProdInventoryChangingDTO> findAll();

    @Select("SELECT  PROD_INVENTORY_CHANGING_ID, PROD_BAR_CODE, PROD_INVENTORY_QUANTITY, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PROD_INVENTORY_CHANGING LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "PROD_INVENTORY_CHANGING_ID", property = "prodInventoryChangingId"),
            @Result(column = "PROD_BAR_CODE", property = "prodBarCode"),
            @Result(column = "PROD_INVENTORY_QUANTITY", property = "prodInventoryQuantity"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ProdInventoryChangingDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO PROD_INVENTORY_CHANGING( PROD_INVENTORY_CHANGING_ID, PROD_BAR_CODE, PROD_INVENTORY_QUANTITY, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{prodInventoryChangingId}, #{prodBarCode}, #{prodInventoryQuantity}, #{recordDate}, #{status}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(ProdInventoryChangingDTO prodInventoryChangingDTO);

}

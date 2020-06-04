package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.ProdInventorySummaryDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */
@Mapper
public interface ProdInventorySummaryDao {


    @Select("SELECT  PROD_INVENTORY_SUMMARY_ID, PROD_INVENTORY_QUANTITY, PROD_INVENTORY_UNIT, PROD_BAR_CODE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PROD_INVENTORY_SUMMARY")
    @Results({
            @Result(column = "PROD_INVENTORY_SUMMARY_ID", property = "prodInventorySummaryId"),
            @Result(column = "PROD_INVENTORY_QUANTITY", property = "prodInventoryQuantity"),
            @Result(column = "PROD_INVENTORY_UNIT", property = "prodInventoryUnit"),
            @Result(column = "PROD_BAR_CODE", property = "prodBarCode"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ProdInventorySummaryDTO> findAll();

    @Select("SELECT  PROD_INVENTORY_SUMMARY_ID, PROD_INVENTORY_QUANTITY, PROD_INVENTORY_UNIT, PROD_BAR_CODE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PROD_INVENTORY_SUMMARY LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "PROD_INVENTORY_SUMMARY_ID", property = "prodInventorySummaryId"),
            @Result(column = "PROD_INVENTORY_QUANTITY", property = "prodInventoryQuantity"),
            @Result(column = "PROD_INVENTORY_UNIT", property = "prodInventoryUnit"),
            @Result(column = "PROD_BAR_CODE", property = "prodBarCode"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ProdInventorySummaryDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO PROD_INVENTORY_SUMMARY( PROD_INVENTORY_SUMMARY_ID, PROD_INVENTORY_QUANTITY, PROD_INVENTORY_UNIT, PROD_BAR_CODE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{prodInventorySummaryId}, #{prodInventoryQuantity}, #{prodInventoryUnit}, #{prodBarCode}, #{status}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(ProdInventorySummaryDTO prodInventorySummaryDTO);

}

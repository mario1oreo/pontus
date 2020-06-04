package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.ProdInventorySnapshotDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */
@Mapper
public interface ProdInventorySnapshotDao {


    @Select("SELECT  PROD_INVENTORY_SNAPSHOT_ID, PROD_INVENTORY_SUMMARY_ID, PROD_BAR_CODE, PROD_INVENTORY_QUANTITY, RECORD_DATE, PROD_INVENTORY_VERSION, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PROD_INVENTORY_SNAPSHOT")
    @Results({
            @Result(column = "PROD_INVENTORY_SNAPSHOT_ID", property = "prodInventorySnapshotId"),
            @Result(column = "PROD_INVENTORY_SUMMARY_ID", property = "prodInventorySummaryId"),
            @Result(column = "PROD_BAR_CODE", property = "prodBarCode"),
            @Result(column = "PROD_INVENTORY_QUANTITY", property = "prodInventoryQuantity"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "PROD_INVENTORY_VERSION", property = "prodInventoryVersion"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ProdInventorySnapshotDTO> findAll();

    @Select("SELECT  PROD_INVENTORY_SNAPSHOT_ID, PROD_INVENTORY_SUMMARY_ID, PROD_BAR_CODE, PROD_INVENTORY_QUANTITY, RECORD_DATE, PROD_INVENTORY_VERSION, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PROD_INVENTORY_SNAPSHOT LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "PROD_INVENTORY_SNAPSHOT_ID", property = "prodInventorySnapshotId"),
            @Result(column = "PROD_INVENTORY_SUMMARY_ID", property = "prodInventorySummaryId"),
            @Result(column = "PROD_BAR_CODE", property = "prodBarCode"),
            @Result(column = "PROD_INVENTORY_QUANTITY", property = "prodInventoryQuantity"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "PROD_INVENTORY_VERSION", property = "prodInventoryVersion"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ProdInventorySnapshotDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO PROD_INVENTORY_SNAPSHOT( PROD_INVENTORY_SNAPSHOT_ID, PROD_INVENTORY_SUMMARY_ID, PROD_BAR_CODE, PROD_INVENTORY_QUANTITY, RECORD_DATE, PROD_INVENTORY_VERSION, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{prodInventorySnapshotId}, #{prodInventorySummaryId}, #{prodBarCode}, #{prodInventoryQuantity}, #{recordDate}, #{prodInventoryVersion}, #{status}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(ProdInventorySnapshotDTO prodInventorySnapshotDTO);

}

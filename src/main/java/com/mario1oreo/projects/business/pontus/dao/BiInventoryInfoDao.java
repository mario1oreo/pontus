package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.BiInventoryInfoDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 * @date 2019-11-10
 */
@Mapper
public interface BiInventoryInfoDao {


    @Select("SELECT  ID, PRODUCT_ID, BATCH_NO, PRODUCT_NAME, PRODUCT_UNIT, PRODUCT_QUANTITY, PARTITION_DT, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM BI_INVENTORY_INFO")
    @Results({
            @Result(column = "ID", property = "id"),
            @Result(column = "PRODUCT_ID", property = "productId"),
            @Result(column = "BATCH_NO", property = "batchNo"),
            @Result(column = "PRODUCT_NAME", property = "productName"),
            @Result(column = "PRODUCT_UNIT", property = "productUnit"),
            @Result(column = "PRODUCT_QUANTITY", property = "productQuantity"),
            @Result(column = "PARTITION_DT", property = "partitionDt"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<BiInventoryInfoDTO> findAll();

    @Select("SELECT  ID, PRODUCT_ID, BATCH_NO, PRODUCT_NAME, PRODUCT_UNIT, PRODUCT_QUANTITY, PARTITION_DT, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM BI_INVENTORY_INFO LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "ID", property = "id"),
            @Result(column = "PRODUCT_ID", property = "productId"),
            @Result(column = "BATCH_NO", property = "batchNo"),
            @Result(column = "PRODUCT_NAME", property = "productName"),
            @Result(column = "PRODUCT_UNIT", property = "productUnit"),
            @Result(column = "PRODUCT_QUANTITY", property = "productQuantity"),
            @Result(column = "PARTITION_DT", property = "partitionDt"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<BiInventoryInfoDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO BI_INVENTORY_INFO( ID, PRODUCT_ID, BATCH_NO, PRODUCT_NAME, PRODUCT_UNIT, PRODUCT_QUANTITY, PARTITION_DT, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{id}, #{productId}, #{batchNo}, #{productName}, #{productUnit}, #{productQuantity}, #{partitionDt}, #{state}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(BiInventoryInfoDTO biInventoryInfoDTO);

}

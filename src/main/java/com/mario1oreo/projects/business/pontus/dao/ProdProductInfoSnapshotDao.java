package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.ProdProductInfoSnapshotDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */
@Mapper
public interface ProdProductInfoSnapshotDao {


    @Select("SELECT  PROD_PRODUCT_INFO_SNAPSHOT_ID, PROD_BAR_CODE, PROD_PRODUCT_BATCH_NO, PROD_PRODUCT_PRICE_NO, PROD_PRODUCT_CATEGORY_1, PROD_PRODUCT_CATEGORY_2, PROD_PRODUCT_CATEGORY_3, PROD_PRODUCT_CATEGORY_4, PROD_PRODUCT_REMARK, RECORD_DATE, PROD_PRODUCT_VERSION, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PROD_PRODUCT_INFO_SNAPSHOT")
    @Results({
            @Result(column = "PROD_PRODUCT_INFO_SNAPSHOT_ID", property = "prodProductInfoSnapshotId"),
            @Result(column = "PROD_BAR_CODE", property = "prodBarCode"),
            @Result(column = "PROD_PRODUCT_BATCH_NO", property = "prodProductBatchNo"),
            @Result(column = "PROD_PRODUCT_PRICE_NO", property = "prodProductPriceNo"),
            @Result(column = "PROD_PRODUCT_CATEGORY_1", property = "prodProductCategory1"),
            @Result(column = "PROD_PRODUCT_CATEGORY_2", property = "prodProductCategory2"),
            @Result(column = "PROD_PRODUCT_CATEGORY_3", property = "prodProductCategory3"),
            @Result(column = "PROD_PRODUCT_CATEGORY_4", property = "prodProductCategory4"),
            @Result(column = "PROD_PRODUCT_REMARK", property = "prodProductRemark"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "PROD_PRODUCT_VERSION", property = "prodProductVersion"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ProdProductInfoSnapshotDTO> findAll();

    @Select("SELECT  PROD_PRODUCT_INFO_SNAPSHOT_ID, PROD_BAR_CODE, PROD_PRODUCT_BATCH_NO, PROD_PRODUCT_PRICE_NO, PROD_PRODUCT_CATEGORY_1, PROD_PRODUCT_CATEGORY_2, PROD_PRODUCT_CATEGORY_3, PROD_PRODUCT_CATEGORY_4, PROD_PRODUCT_REMARK, RECORD_DATE, PROD_PRODUCT_VERSION, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PROD_PRODUCT_INFO_SNAPSHOT LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "PROD_PRODUCT_INFO_SNAPSHOT_ID", property = "prodProductInfoSnapshotId"),
            @Result(column = "PROD_BAR_CODE", property = "prodBarCode"),
            @Result(column = "PROD_PRODUCT_BATCH_NO", property = "prodProductBatchNo"),
            @Result(column = "PROD_PRODUCT_PRICE_NO", property = "prodProductPriceNo"),
            @Result(column = "PROD_PRODUCT_CATEGORY_1", property = "prodProductCategory1"),
            @Result(column = "PROD_PRODUCT_CATEGORY_2", property = "prodProductCategory2"),
            @Result(column = "PROD_PRODUCT_CATEGORY_3", property = "prodProductCategory3"),
            @Result(column = "PROD_PRODUCT_CATEGORY_4", property = "prodProductCategory4"),
            @Result(column = "PROD_PRODUCT_REMARK", property = "prodProductRemark"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "PROD_PRODUCT_VERSION", property = "prodProductVersion"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ProdProductInfoSnapshotDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO PROD_PRODUCT_INFO_SNAPSHOT( PROD_PRODUCT_INFO_SNAPSHOT_ID, PROD_BAR_CODE, PROD_PRODUCT_BATCH_NO, PROD_PRODUCT_PRICE_NO, PROD_PRODUCT_CATEGORY_1, PROD_PRODUCT_CATEGORY_2, PROD_PRODUCT_CATEGORY_3, PROD_PRODUCT_CATEGORY_4, PROD_PRODUCT_REMARK, RECORD_DATE, PROD_PRODUCT_VERSION, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{prodProductInfoSnapshotId}, #{prodBarCode}, #{prodProductBatchNo}, #{prodProductPriceNo}, #{prodProductCategory1}, #{prodProductCategory2}, #{prodProductCategory3}, #{prodProductCategory4}, #{prodProductRemark}, #{recordDate}, #{prodProductVersion}, #{status}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(ProdProductInfoSnapshotDTO prodProductInfoSnapshotDTO);

}

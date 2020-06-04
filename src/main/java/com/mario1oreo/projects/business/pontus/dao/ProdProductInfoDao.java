package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.ProdProductInfoDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */
@Mapper
public interface ProdProductInfoDao {


    @Select("SELECT  PROD_PRODUCT_INFO_ID, PROD_PRODUCT_INFO_NO, PROD_PRODUCT_NAME, PROD_BAR_CODE, PROD_PRODUCT_BATCH_NO, PROD_PRODUCT_PRICE_NO, PROD_PRODUCT_CATEGORY_1, PROD_PRODUCT_CATEGORY_2, PROD_PRODUCT_CATEGORY_3, PROD_PRODUCT_CATEGORY_4, PROD_PRODUCT_REMARK, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PROD_PRODUCT_INFO")
    @Results({
            @Result(column = "PROD_PRODUCT_INFO_ID", property = "prodProductInfoId"),
            @Result(column = "PROD_PRODUCT_INFO_NO", property = "prodProductInfoNo"),
            @Result(column = "PROD_PRODUCT_NAME", property = "prodProductName"),
            @Result(column = "PROD_BAR_CODE", property = "prodBarCode"),
            @Result(column = "PROD_PRODUCT_BATCH_NO", property = "prodProductBatchNo"),
            @Result(column = "PROD_PRODUCT_PRICE_NO", property = "prodProductPriceNo"),
            @Result(column = "PROD_PRODUCT_CATEGORY_1", property = "prodProductCategory1"),
            @Result(column = "PROD_PRODUCT_CATEGORY_2", property = "prodProductCategory2"),
            @Result(column = "PROD_PRODUCT_CATEGORY_3", property = "prodProductCategory3"),
            @Result(column = "PROD_PRODUCT_CATEGORY_4", property = "prodProductCategory4"),
            @Result(column = "PROD_PRODUCT_REMARK", property = "prodProductRemark"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ProdProductInfoDTO> findAll();

    @Select("SELECT  PROD_PRODUCT_INFO_ID, PROD_PRODUCT_INFO_NO, PROD_PRODUCT_NAME, PROD_BAR_CODE, PROD_PRODUCT_BATCH_NO, PROD_PRODUCT_PRICE_NO, PROD_PRODUCT_CATEGORY_1, PROD_PRODUCT_CATEGORY_2, PROD_PRODUCT_CATEGORY_3, PROD_PRODUCT_CATEGORY_4, PROD_PRODUCT_REMARK, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PROD_PRODUCT_INFO LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "PROD_PRODUCT_INFO_ID", property = "prodProductInfoId"),
            @Result(column = "PROD_PRODUCT_INFO_NO", property = "prodProductInfoNo"),
            @Result(column = "PROD_PRODUCT_NAME", property = "prodProductName"),
            @Result(column = "PROD_BAR_CODE", property = "prodBarCode"),
            @Result(column = "PROD_PRODUCT_BATCH_NO", property = "prodProductBatchNo"),
            @Result(column = "PROD_PRODUCT_PRICE_NO", property = "prodProductPriceNo"),
            @Result(column = "PROD_PRODUCT_CATEGORY_1", property = "prodProductCategory1"),
            @Result(column = "PROD_PRODUCT_CATEGORY_2", property = "prodProductCategory2"),
            @Result(column = "PROD_PRODUCT_CATEGORY_3", property = "prodProductCategory3"),
            @Result(column = "PROD_PRODUCT_CATEGORY_4", property = "prodProductCategory4"),
            @Result(column = "PROD_PRODUCT_REMARK", property = "prodProductRemark"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ProdProductInfoDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO PROD_PRODUCT_INFO( PROD_PRODUCT_INFO_ID, PROD_PRODUCT_INFO_NO, PROD_PRODUCT_NAME, PROD_BAR_CODE, PROD_PRODUCT_BATCH_NO, PROD_PRODUCT_PRICE_NO, PROD_PRODUCT_CATEGORY_1, PROD_PRODUCT_CATEGORY_2, PROD_PRODUCT_CATEGORY_3, PROD_PRODUCT_CATEGORY_4, PROD_PRODUCT_REMARK, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{prodProductInfoId}, #{prodProductInfoNo}, #{prodProductName}, #{prodBarCode}, #{prodProductBatchNo}, #{prodProductPriceNo}, #{prodProductCategory1}, #{prodProductCategory2}, #{prodProductCategory3}, #{prodProductCategory4}, #{prodProductRemark}, #{recordDate}, #{status}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(ProdProductInfoDTO prodProductInfoDTO);

}

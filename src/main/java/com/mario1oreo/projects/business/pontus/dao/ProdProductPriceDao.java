package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.ProdProductPriceDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */
@Mapper
public interface ProdProductPriceDao {


    @Select("SELECT  PROD_PRODUCT_PRICE_ID, PROD_PRODUCT_PRICE_NO, PROD_PRODUCT_BATCH_NO, PROD_BAR_CODE, PROD_COST_PRICE, PROD_SELL_PRICE, PROD_VIP_SELL_PRICE, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PROD_PRODUCT_PRICE")
    @Results({
            @Result(column = "PROD_PRODUCT_PRICE_ID", property = "prodProductPriceId"),
            @Result(column = "PROD_PRODUCT_PRICE_NO", property = "prodProductPriceNo"),
            @Result(column = "PROD_PRODUCT_BATCH_NO", property = "prodProductBatchNo"),
            @Result(column = "PROD_BAR_CODE", property = "prodBarCode"),
            @Result(column = "PROD_COST_PRICE", property = "prodCostPrice"),
            @Result(column = "PROD_SELL_PRICE", property = "prodSellPrice"),
            @Result(column = "PROD_VIP_SELL_PRICE", property = "prodVipSellPrice"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ProdProductPriceDTO> findAll();

    @Select("SELECT  PROD_PRODUCT_PRICE_ID, PROD_PRODUCT_PRICE_NO, PROD_PRODUCT_BATCH_NO, PROD_BAR_CODE, PROD_COST_PRICE, PROD_SELL_PRICE, PROD_VIP_SELL_PRICE, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PROD_PRODUCT_PRICE LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "PROD_PRODUCT_PRICE_ID", property = "prodProductPriceId"),
            @Result(column = "PROD_PRODUCT_PRICE_NO", property = "prodProductPriceNo"),
            @Result(column = "PROD_PRODUCT_BATCH_NO", property = "prodProductBatchNo"),
            @Result(column = "PROD_BAR_CODE", property = "prodBarCode"),
            @Result(column = "PROD_COST_PRICE", property = "prodCostPrice"),
            @Result(column = "PROD_SELL_PRICE", property = "prodSellPrice"),
            @Result(column = "PROD_VIP_SELL_PRICE", property = "prodVipSellPrice"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ProdProductPriceDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO PROD_PRODUCT_PRICE( PROD_PRODUCT_PRICE_ID, PROD_PRODUCT_PRICE_NO, PROD_PRODUCT_BATCH_NO, PROD_BAR_CODE, PROD_COST_PRICE, PROD_SELL_PRICE, PROD_VIP_SELL_PRICE, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{prodProductPriceId}, #{prodProductPriceNo}, #{prodProductBatchNo}, #{prodBarCode}, #{prodCostPrice}, #{prodSellPrice}, #{prodVipSellPrice}, #{recordDate}, #{status}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(ProdProductPriceDTO prodProductPriceDTO);

}

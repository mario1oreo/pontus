package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.PrdProductPriceInfoDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 *
 * @date 2019-11-20
 *
 */
@Mapper
public interface PrdProductPriceInfoDao {


    @Select("SELECT  ID, PRODUCT_ID, BATCH_NO, BUY_PRICE, SALE_PRICE, COST_PRICE, PRODUCT_QUANTITY, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PRD_PRODUCT_PRICE_INFO")
    @Results({
            @Result(column = "ID", property = "id"),
            @Result(column = "PRODUCT_ID", property = "productId"),
            @Result(column = "BATCH_NO", property = "batchNo"),
            @Result(column = "BUY_PRICE", property = "buyPrice"),
            @Result(column = "SALE_PRICE", property = "salePrice"),
            @Result(column = "COST_PRICE", property = "costPrice"),
            @Result(column = "PRODUCT_QUANTITY", property = "productQuantity"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<PrdProductPriceInfoDTO> findAll();

    @Select("SELECT  ID, PRODUCT_ID, BATCH_NO, BUY_PRICE, SALE_PRICE, COST_PRICE, PRODUCT_QUANTITY, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PRD_PRODUCT_PRICE_INFO LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "ID", property = "id"),
            @Result(column = "PRODUCT_ID", property = "productId"),
            @Result(column = "BATCH_NO", property = "batchNo"),
            @Result(column = "BUY_PRICE", property = "buyPrice"),
            @Result(column = "SALE_PRICE", property = "salePrice"),
            @Result(column = "COST_PRICE", property = "costPrice"),
            @Result(column = "PRODUCT_QUANTITY", property = "productQuantity"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<PrdProductPriceInfoDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO PRD_PRODUCT_PRICE_INFO( ID, PRODUCT_ID, BATCH_NO, BUY_PRICE, SALE_PRICE, COST_PRICE, PRODUCT_QUANTITY, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{id}, #{productId}, #{batchNo}, #{buyPrice}, #{salePrice}, #{costPrice}, #{productQuantity}, #{state}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(PrdProductPriceInfoDTO prdProductPriceInfoDTO);

}

package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.BiIncomeInfoDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 * @date 2019-11-10
 */
@Mapper
public interface BiIncomeInfoDao {


    @Select("SELECT  ID, PRODUCT_ID, BATCH_NO, PRODUCT_QUANTITY, SALE_PRICE, COST_PRICE, EXPRESS_QUANTITY, EXPRESS_FEE, NET_PROFIT, PARTITION_DT, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM BI_INCOME_INFO")
    @Results({
            @Result(column = "ID", property = "id"),
            @Result(column = "PRODUCT_ID", property = "productId"),
            @Result(column = "BATCH_NO", property = "batchNo"),
            @Result(column = "PRODUCT_QUANTITY", property = "productQuantity"),
            @Result(column = "SALE_PRICE", property = "salePrice"),
            @Result(column = "COST_PRICE", property = "costPrice"),
            @Result(column = "EXPRESS_QUANTITY", property = "expressQuantity"),
            @Result(column = "EXPRESS_FEE", property = "expressFee"),
            @Result(column = "NET_PROFIT", property = "netProfit"),
            @Result(column = "PARTITION_DT", property = "partitionDt"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<BiIncomeInfoDTO> findAll();

    @Select("SELECT  ID, PRODUCT_ID, BATCH_NO, PRODUCT_QUANTITY, SALE_PRICE, COST_PRICE, EXPRESS_QUANTITY, EXPRESS_FEE, NET_PROFIT, PARTITION_DT, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM BI_INCOME_INFO LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "ID", property = "id"),
            @Result(column = "PRODUCT_ID", property = "productId"),
            @Result(column = "BATCH_NO", property = "batchNo"),
            @Result(column = "PRODUCT_QUANTITY", property = "productQuantity"),
            @Result(column = "SALE_PRICE", property = "salePrice"),
            @Result(column = "COST_PRICE", property = "costPrice"),
            @Result(column = "EXPRESS_QUANTITY", property = "expressQuantity"),
            @Result(column = "EXPRESS_FEE", property = "expressFee"),
            @Result(column = "NET_PROFIT", property = "netProfit"),
            @Result(column = "PARTITION_DT", property = "partitionDt"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<BiIncomeInfoDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO BI_INCOME_INFO( ID, PRODUCT_ID, BATCH_NO, PRODUCT_QUANTITY, SALE_PRICE, COST_PRICE, EXPRESS_QUANTITY, EXPRESS_FEE, NET_PROFIT, PARTITION_DT, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{id}, #{productId}, #{batchNo}, #{productQuantity}, #{salePrice}, #{costPrice}, #{expressQuantity}, #{expressFee}, #{netProfit}, #{partitionDt}, #{state}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(BiIncomeInfoDTO biIncomeInfoDTO);

}

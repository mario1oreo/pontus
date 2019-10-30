package com.mario1oreo.projects.business.pontus.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;


/**
 * @author mario1oreo
 * @date 2019-6-28 14:51:05
 */
@Mapper
public interface BIIncomeInfoDao {

    @Select("SELECT T.ID,T.PRODUCT_ID,T.BATCH_NO,T.PRODUCT_QUANTITY,T.SALE_PRICE,T.COST_PRICE,T.EXPRESS_QUANTITY,T.EXPRESS_FEE,T.NET_PROFIT,T.`PARTITION`,T.`STATUS` FROM BI_INCOME_INFO T")
    List<Map<String,String>> findAll();


}

package com.mario1oreo.projects.business.pontus.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author mario1oreo
 * @date 2019-6-28 15:13:19
 */
@Mapper
public interface ProductPriceInfoDao {

    @Select("SELECT T.ID,T.PRODUCT_ID,T.BATCH_NO,T.BUY_PRICE,T.SALE_PRICE,T.COST_PRICE,T.`STATUS` FROM prd_product_price_info T")
    List<Map<String, String>> findAll();
}

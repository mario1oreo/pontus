package com.mario1oreo.projects.business.pontus.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author mario1oreo
 * @date 2019-6-28 14:56:34
 */
@Mapper
public interface InventoryInfoDao {

    @Select("SELECT T.ID,T.PRODUCT_ID,T.BATCH_NO,T.PRODUCT_NAME,T.PRODUCT_UNIT,T.PRODUCT_QUANTITY,T.`STATUS` FROM prd_inventory_info T")
    List<Map<String, String>> findAll();

}

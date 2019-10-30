package com.mario1oreo.projects.business.pontus.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author mario1oreo
 * @date 2019-6-28 15:19:49
 */
@Mapper
public interface ProductInfoDao {

    @Select("SELECT T.ID,T.PRODUCT_ID,T.PRODUCT_CATEGORY,T.PRODUCT_NAME,T.PRODUCT_UNIT FROM prd_product_info T")
    List<Map<String, String>> findAll();
}

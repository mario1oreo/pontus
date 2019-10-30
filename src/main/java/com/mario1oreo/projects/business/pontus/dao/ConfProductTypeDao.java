package com.mario1oreo.projects.business.pontus.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface ConfProductTypeDao {

    @Select("SELECT T.SHORT_NAME shortName,T.DESCRIPTION description,T.CONFIG_TYPE configType FROM CONF_PRODUCT_TYPE T WHERE T.`STATUS` = 0")
    List<Map<String, String>> findAll();
}

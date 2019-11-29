package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.ConfProductCategoryDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 *
 * @date 2019-11-18
 *
 */
@Mapper
public interface ConfProductCategoryDao {


    @Select("SELECT  ID, PRODUCT_CATEGORY_ID, PRODUCT_CATEGORY_CODE, PRODUCT_CATEGORY_NAME, PRODUCT_CATEGORY_LEVEL, PRODUCT_CATEGORY_MEMO, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM CONF_PRODUCT_CATEGORY")
    @Results({
            @Result(column = "ID", property = "id"),
            @Result(column = "PRODUCT_CATEGORY_ID", property = "productCategoryId"),
            @Result(column = "PRODUCT_CATEGORY_CODE", property = "productCategoryCode"),
            @Result(column = "PRODUCT_CATEGORY_NAME", property = "productCategoryName"),
            @Result(column = "PRODUCT_CATEGORY_LEVEL", property = "productCategoryLevel"),
            @Result(column = "PRODUCT_CATEGORY_MEMO", property = "productCategoryMemo"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ConfProductCategoryDTO> findAll();

    @Select("SELECT  ID, PRODUCT_CATEGORY_ID, PRODUCT_CATEGORY_CODE, PRODUCT_CATEGORY_NAME, PRODUCT_CATEGORY_LEVEL, PRODUCT_CATEGORY_MEMO, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM CONF_PRODUCT_CATEGORY LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "ID", property = "id"),
            @Result(column = "PRODUCT_CATEGORY_ID", property = "productCategoryId"),
            @Result(column = "PRODUCT_CATEGORY_CODE", property = "productCategoryCode"),
            @Result(column = "PRODUCT_CATEGORY_NAME", property = "productCategoryName"),
            @Result(column = "PRODUCT_CATEGORY_LEVEL", property = "productCategoryLevel"),
            @Result(column = "PRODUCT_CATEGORY_MEMO", property = "productCategoryMemo"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ConfProductCategoryDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO CONF_PRODUCT_CATEGORY( ID, PRODUCT_CATEGORY_ID, PRODUCT_CATEGORY_CODE, PRODUCT_CATEGORY_NAME, PRODUCT_CATEGORY_LEVEL, PRODUCT_CATEGORY_MEMO, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{id}, #{productCategoryId}, #{productCategoryCode}, #{productCategoryName}, #{productCategoryLevel}, #{productCategoryMemo}, #{state}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(ConfProductCategoryDTO confProductCategoryDTO);

}

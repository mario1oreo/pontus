package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.PrdProductInfoDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 *
 * @date 2019-11-20
 *
 */
@Mapper
public interface PrdProductInfoDao {


    @Select("SELECT  ID, BAR_CODE, PRODUCT_ID, PRODUCT_NAME, PRODUCT_CATEGORY_ONE, PRODUCT_CATEGORY_TWO, PRODUCT_CATEGORY_THR, PRODUCT_CATEGORY_FOR, DESCRIPTION, FORMAT_COLOUR_ID, FORMAT_SIZE_ID, FORMAT_ID, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PRD_PRODUCT_INFO")
    @Results({
            @Result(column = "ID", property = "id"),
            @Result(column = "BAR_CODE", property = "barCode"),
            @Result(column = "PRODUCT_ID", property = "productId"),
            @Result(column = "PRODUCT_NAME", property = "productName"),
            @Result(column = "PRODUCT_CATEGORY_ONE", property = "productCategoryOne"),
            @Result(column = "PRODUCT_CATEGORY_TWO", property = "productCategoryTwo"),
            @Result(column = "PRODUCT_CATEGORY_THR", property = "productCategoryThr"),
            @Result(column = "PRODUCT_CATEGORY_FOR", property = "productCategoryFor"),
            @Result(column = "DESCRIPTION", property = "description"),
            @Result(column = "FORMAT_COLOUR_ID", property = "formatColourId"),
            @Result(column = "FORMAT_SIZE_ID", property = "formatSizeId"),
            @Result(column = "FORMAT_ID", property = "formatId"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<PrdProductInfoDTO> findAll();

    @Select("SELECT  ID, BAR_CODE, PRODUCT_ID, PRODUCT_NAME, PRODUCT_CATEGORY_ONE, PRODUCT_CATEGORY_TWO, PRODUCT_CATEGORY_THR, PRODUCT_CATEGORY_FOR, DESCRIPTION, FORMAT_COLOUR_ID, FORMAT_SIZE_ID, FORMAT_ID, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PRD_PRODUCT_INFO LIMIT #{startNum} , #{pageSize}")
    @Results({
            @Result(column = "ID", property = "id"),
            @Result(column = "BAR_CODE", property = "barCode"),
            @Result(column = "PRODUCT_ID", property = "productId"),
            @Result(column = "PRODUCT_NAME", property = "productName"),
            @Result(column = "PRODUCT_CATEGORY_ONE", property = "productCategoryOne"),
            @Result(column = "PRODUCT_CATEGORY_TWO", property = "productCategoryTwo"),
            @Result(column = "PRODUCT_CATEGORY_THR", property = "productCategoryThr"),
            @Result(column = "PRODUCT_CATEGORY_FOR", property = "productCategoryFor"),
            @Result(column = "DESCRIPTION", property = "description"),
            @Result(column = "FORMAT_COLOUR_ID", property = "formatColourId"),
            @Result(column = "FORMAT_SIZE_ID", property = "formatSizeId"),
            @Result(column = "FORMAT_ID", property = "formatId"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<PrdProductInfoDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO PRD_PRODUCT_INFO( ID, BAR_CODE, PRODUCT_ID, PRODUCT_NAME, PRODUCT_CATEGORY_ONE, PRODUCT_CATEGORY_TWO, PRODUCT_CATEGORY_THR, PRODUCT_CATEGORY_FOR, DESCRIPTION, FORMAT_COLOUR_ID, FORMAT_SIZE_ID, FORMAT_ID, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{id}, #{barCode}, #{productId}, #{productName}, #{productCategoryOne}, #{productCategoryTwo}, #{productCategoryThr}, #{productCategoryFor}, #{description}, #{formatColourId}, #{formatSizeId}, #{formatId}, #{state}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(PrdProductInfoDTO prdProductInfoDTO);


    @Select("SELECT  ID, BAR_CODE, PRODUCT_ID, PRODUCT_NAME, PRODUCT_CATEGORY_ONE, PRODUCT_CATEGORY_TWO, PRODUCT_CATEGORY_THR, PRODUCT_CATEGORY_FOR, DESCRIPTION, FORMAT_COLOUR_ID, FORMAT_SIZE_ID, FORMAT_ID, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PRD_PRODUCT_INFO LIMIT #{startNum} , #{pageSize}")
    @Results({
            @Result(column = "ID", property = "id"),
            @Result(column = "BAR_CODE", property = "barCode"),
            @Result(column = "PRODUCT_ID", property = "productId"),
            @Result(column = "PRODUCT_NAME", property = "productName"),
            @Result(column = "PRODUCT_CATEGORY_ONE", property = "productCategoryOne"),
            @Result(column = "PRODUCT_CATEGORY_TWO", property = "productCategoryTwo"),
            @Result(column = "PRODUCT_CATEGORY_THR", property = "productCategoryThr"),
            @Result(column = "PRODUCT_CATEGORY_FOR", property = "productCategoryFor"),
            @Result(column = "DESCRIPTION", property = "description"),
            @Result(column = "FORMAT_COLOUR_ID", property = "formatColourId"),
            @Result(column = "FORMAT_SIZE_ID", property = "formatSizeId"),
            @Result(column = "FORMAT_ID", property = "formatId"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<PrdProductInfoDTO> listGoodsInfoByBarCodes(@Param("barCode") String barCode);
}

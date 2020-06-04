package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.ProdOrderDetailDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */
@Mapper
public interface ProdOrderDetailDao {


    @Select("SELECT  PROD_ORDER_DETAIL_ID, PROD_ORDER_DETAIL_NO, PROD_BAR_CODE, PROD_ORDER_DETAIL_QUANTITY, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PROD_ORDER_DETAIL")
    @Results({
            @Result(column = "PROD_ORDER_DETAIL_ID", property = "prodOrderDetailId"),
            @Result(column = "PROD_ORDER_DETAIL_NO", property = "prodOrderDetailNo"),
            @Result(column = "PROD_BAR_CODE", property = "prodBarCode"),
            @Result(column = "PROD_ORDER_DETAIL_QUANTITY", property = "prodOrderDetailQuantity"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ProdOrderDetailDTO> findAll();

    @Select("SELECT  PROD_ORDER_DETAIL_ID, PROD_ORDER_DETAIL_NO, PROD_BAR_CODE, PROD_ORDER_DETAIL_QUANTITY, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PROD_ORDER_DETAIL LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "PROD_ORDER_DETAIL_ID", property = "prodOrderDetailId"),
            @Result(column = "PROD_ORDER_DETAIL_NO", property = "prodOrderDetailNo"),
            @Result(column = "PROD_BAR_CODE", property = "prodBarCode"),
            @Result(column = "PROD_ORDER_DETAIL_QUANTITY", property = "prodOrderDetailQuantity"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ProdOrderDetailDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO PROD_ORDER_DETAIL( PROD_ORDER_DETAIL_ID, PROD_ORDER_DETAIL_NO, PROD_BAR_CODE, PROD_ORDER_DETAIL_QUANTITY, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{prodOrderDetailId}, #{prodOrderDetailNo}, #{prodBarCode}, #{prodOrderDetailQuantity}, #{recordDate}, #{status}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(ProdOrderDetailDTO prodOrderDetailDTO);

}

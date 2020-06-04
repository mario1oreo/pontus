package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.ProdExpenseSummaryDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */
@Mapper
public interface ProdExpenseSummaryDao {


    @Select("SELECT  PROD_EXPENSE_SUMMARY_ID, PROD_EXPENSE_SUMMARY_NO, PROD_EXPENSE_SUMMARY_TYPE, PROD_EXPENSE_SUMMARY_AMOUNT, PROD_EXPENSE_SUMMARY_REMARK, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PROD_EXPENSE_SUMMARY")
    @Results({
            @Result(column = "PROD_EXPENSE_SUMMARY_ID", property = "prodExpenseSummaryId"),
            @Result(column = "PROD_EXPENSE_SUMMARY_NO", property = "prodExpenseSummaryNo"),
            @Result(column = "PROD_EXPENSE_SUMMARY_TYPE", property = "prodExpenseSummaryType"),
            @Result(column = "PROD_EXPENSE_SUMMARY_AMOUNT", property = "prodExpenseSummaryAmount"),
            @Result(column = "PROD_EXPENSE_SUMMARY_REMARK", property = "prodExpenseSummaryRemark"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ProdExpenseSummaryDTO> findAll();

    @Select("SELECT  PROD_EXPENSE_SUMMARY_ID, PROD_EXPENSE_SUMMARY_NO, PROD_EXPENSE_SUMMARY_TYPE, PROD_EXPENSE_SUMMARY_AMOUNT, PROD_EXPENSE_SUMMARY_REMARK, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PROD_EXPENSE_SUMMARY LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "PROD_EXPENSE_SUMMARY_ID", property = "prodExpenseSummaryId"),
            @Result(column = "PROD_EXPENSE_SUMMARY_NO", property = "prodExpenseSummaryNo"),
            @Result(column = "PROD_EXPENSE_SUMMARY_TYPE", property = "prodExpenseSummaryType"),
            @Result(column = "PROD_EXPENSE_SUMMARY_AMOUNT", property = "prodExpenseSummaryAmount"),
            @Result(column = "PROD_EXPENSE_SUMMARY_REMARK", property = "prodExpenseSummaryRemark"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ProdExpenseSummaryDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO PROD_EXPENSE_SUMMARY( PROD_EXPENSE_SUMMARY_ID, PROD_EXPENSE_SUMMARY_NO, PROD_EXPENSE_SUMMARY_TYPE, PROD_EXPENSE_SUMMARY_AMOUNT, PROD_EXPENSE_SUMMARY_REMARK, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{prodExpenseSummaryId}, #{prodExpenseSummaryNo}, #{prodExpenseSummaryType}, #{prodExpenseSummaryAmount}, #{prodExpenseSummaryRemark}, #{recordDate}, #{status}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(ProdExpenseSummaryDTO prodExpenseSummaryDTO);

}

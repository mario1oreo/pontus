package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.ProdExpenseDetailDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */
@Mapper
public interface ProdExpenseDetailDao {


    @Select("SELECT  PROD_EXPENSE_DETAIL_ID, PROD_EXPENSE_DETAIL_NO, PROD_EXPENSE_DETAIL_SUBJECT_NAME, PROD_EXPENSE_DETAIL_SUBJECT_NO, PROD_EXPENSE_DETAIL_AMOUNT, PROD_EXPENSE_DETAIL_EXISTS_INVOICE, PROD_EXPENSE_DETAIL_INVOICE_NO, PROD_EXPENSE_DETAIL_COMPANY_PAY, PROD_EXPENSE_DETAIL_REMARK, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PROD_EXPENSE_DETAIL")
    @Results({
            @Result(column = "PROD_EXPENSE_DETAIL_ID", property = "prodExpenseDetailId"),
            @Result(column = "PROD_EXPENSE_DETAIL_NO", property = "prodExpenseDetailNo"),
            @Result(column = "PROD_EXPENSE_DETAIL_SUBJECT_NAME", property = "prodExpenseDetailSubjectName"),
            @Result(column = "PROD_EXPENSE_DETAIL_SUBJECT_NO", property = "prodExpenseDetailSubjectNo"),
            @Result(column = "PROD_EXPENSE_DETAIL_AMOUNT", property = "prodExpenseDetailAmount"),
            @Result(column = "PROD_EXPENSE_DETAIL_EXISTS_INVOICE", property = "prodExpenseDetailExistsInvoice"),
            @Result(column = "PROD_EXPENSE_DETAIL_INVOICE_NO", property = "prodExpenseDetailInvoiceNo"),
            @Result(column = "PROD_EXPENSE_DETAIL_COMPANY_PAY", property = "prodExpenseDetailCompanyPay"),
            @Result(column = "PROD_EXPENSE_DETAIL_REMARK", property = "prodExpenseDetailRemark"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ProdExpenseDetailDTO> findAll();

    @Select("SELECT  PROD_EXPENSE_DETAIL_ID, PROD_EXPENSE_DETAIL_NO, PROD_EXPENSE_DETAIL_SUBJECT_NAME, PROD_EXPENSE_DETAIL_SUBJECT_NO, PROD_EXPENSE_DETAIL_AMOUNT, PROD_EXPENSE_DETAIL_EXISTS_INVOICE, PROD_EXPENSE_DETAIL_INVOICE_NO, PROD_EXPENSE_DETAIL_COMPANY_PAY, PROD_EXPENSE_DETAIL_REMARK, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PROD_EXPENSE_DETAIL LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "PROD_EXPENSE_DETAIL_ID", property = "prodExpenseDetailId"),
            @Result(column = "PROD_EXPENSE_DETAIL_NO", property = "prodExpenseDetailNo"),
            @Result(column = "PROD_EXPENSE_DETAIL_SUBJECT_NAME", property = "prodExpenseDetailSubjectName"),
            @Result(column = "PROD_EXPENSE_DETAIL_SUBJECT_NO", property = "prodExpenseDetailSubjectNo"),
            @Result(column = "PROD_EXPENSE_DETAIL_AMOUNT", property = "prodExpenseDetailAmount"),
            @Result(column = "PROD_EXPENSE_DETAIL_EXISTS_INVOICE", property = "prodExpenseDetailExistsInvoice"),
            @Result(column = "PROD_EXPENSE_DETAIL_INVOICE_NO", property = "prodExpenseDetailInvoiceNo"),
            @Result(column = "PROD_EXPENSE_DETAIL_COMPANY_PAY", property = "prodExpenseDetailCompanyPay"),
            @Result(column = "PROD_EXPENSE_DETAIL_REMARK", property = "prodExpenseDetailRemark"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ProdExpenseDetailDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO PROD_EXPENSE_DETAIL( PROD_EXPENSE_DETAIL_ID, PROD_EXPENSE_DETAIL_NO, PROD_EXPENSE_DETAIL_SUBJECT_NAME, PROD_EXPENSE_DETAIL_SUBJECT_NO, PROD_EXPENSE_DETAIL_AMOUNT, PROD_EXPENSE_DETAIL_EXISTS_INVOICE, PROD_EXPENSE_DETAIL_INVOICE_NO, PROD_EXPENSE_DETAIL_COMPANY_PAY, PROD_EXPENSE_DETAIL_REMARK, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{prodExpenseDetailId}, #{prodExpenseDetailNo}, #{prodExpenseDetailSubjectName}, #{prodExpenseDetailSubjectNo}, #{prodExpenseDetailAmount}, #{prodExpenseDetailExistsInvoice}, #{prodExpenseDetailInvoiceNo}, #{prodExpenseDetailCompanyPay}, #{prodExpenseDetailRemark}, #{recordDate}, #{status}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(ProdExpenseDetailDTO prodExpenseDetailDTO);

}

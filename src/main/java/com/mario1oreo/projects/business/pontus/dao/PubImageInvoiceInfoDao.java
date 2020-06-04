package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.PubImageInvoiceInfoDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */
@Mapper
public interface PubImageInvoiceInfoDao {


    @Select("SELECT  PUB_IMAGE_FILE_INVOICE_ID, PUB_IMAGE_FILE_INVOICE_NO, PROD_EXPENSE_DETAIL_INVOICE_NO, PUB_IMAGE_FILE_PATH, PUB_IMAGE_FILE_REMARK, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PUB_IMAGE_INVOICE_INFO")
    @Results({
            @Result(column = "PUB_IMAGE_FILE_INVOICE_ID", property = "pubImageFileInvoiceId"),
            @Result(column = "PUB_IMAGE_FILE_INVOICE_NO", property = "pubImageFileInvoiceNo"),
            @Result(column = "PROD_EXPENSE_DETAIL_INVOICE_NO", property = "prodExpenseDetailInvoiceNo"),
            @Result(column = "PUB_IMAGE_FILE_PATH", property = "pubImageFilePath"),
            @Result(column = "PUB_IMAGE_FILE_REMARK", property = "pubImageFileRemark"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<PubImageInvoiceInfoDTO> findAll();

    @Select("SELECT  PUB_IMAGE_FILE_INVOICE_ID, PUB_IMAGE_FILE_INVOICE_NO, PROD_EXPENSE_DETAIL_INVOICE_NO, PUB_IMAGE_FILE_PATH, PUB_IMAGE_FILE_REMARK, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PUB_IMAGE_INVOICE_INFO LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "PUB_IMAGE_FILE_INVOICE_ID", property = "pubImageFileInvoiceId"),
            @Result(column = "PUB_IMAGE_FILE_INVOICE_NO", property = "pubImageFileInvoiceNo"),
            @Result(column = "PROD_EXPENSE_DETAIL_INVOICE_NO", property = "prodExpenseDetailInvoiceNo"),
            @Result(column = "PUB_IMAGE_FILE_PATH", property = "pubImageFilePath"),
            @Result(column = "PUB_IMAGE_FILE_REMARK", property = "pubImageFileRemark"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<PubImageInvoiceInfoDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO PUB_IMAGE_INVOICE_INFO( PUB_IMAGE_FILE_INVOICE_ID, PUB_IMAGE_FILE_INVOICE_NO, PROD_EXPENSE_DETAIL_INVOICE_NO, PUB_IMAGE_FILE_PATH, PUB_IMAGE_FILE_REMARK, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{pubImageFileInvoiceId}, #{pubImageFileInvoiceNo}, #{prodExpenseDetailInvoiceNo}, #{pubImageFilePath}, #{pubImageFileRemark}, #{recordDate}, #{status}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(PubImageInvoiceInfoDTO pubImageInvoiceInfoDTO);

}

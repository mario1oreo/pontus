package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.PrdVoucherInfoDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 *
 * @date 2019-11-13
 *
 */
@Mapper
public interface PrdVoucherInfoDao {


    @Select("SELECT  ID, VOUCHER_ID, VOUCHER_TYPE, VOUCHER_AMOUNT, VOUCHER_REAL_AMOUNT, INVOICE_DEMAND, INVOICE_RATE, INVOICE_AMOUNT, INVOICE_NO, TRANSACTION_TYPE, TRANSACTION_TIME, PRODUCT_ID, BATCH_NO, PRODUCT_QUANTITY, SALE_CHANNEL, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PRD_VOUCHER_INFO")
    @Results({
            @Result(column = "ID", property = "id"),
            @Result(column = "VOUCHER_ID", property = "voucherId"),
            @Result(column = "VOUCHER_TYPE", property = "voucherType"),
            @Result(column = "VOUCHER_AMOUNT", property = "voucherAmount"),
            @Result(column = "VOUCHER_REAL_AMOUNT", property = "voucherRealAmount"),
            @Result(column = "INVOICE_DEMAND", property = "invoiceDemand"),
            @Result(column = "INVOICE_RATE", property = "invoiceRate"),
            @Result(column = "INVOICE_AMOUNT", property = "invoiceAmount"),
            @Result(column = "INVOICE_NO", property = "invoiceNo"),
            @Result(column = "TRANSACTION_TYPE", property = "transactionType"),
            @Result(column = "TRANSACTION_TIME", property = "transactionTime"),
            @Result(column = "PRODUCT_ID", property = "productId"),
            @Result(column = "BATCH_NO", property = "batchNo"),
            @Result(column = "PRODUCT_QUANTITY", property = "productQuantity"),
            @Result(column = "SALE_CHANNEL", property = "saleChannel"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<PrdVoucherInfoDTO> findAll();

    @Select("SELECT  ID, VOUCHER_ID, VOUCHER_TYPE, VOUCHER_AMOUNT, VOUCHER_REAL_AMOUNT, INVOICE_DEMAND, INVOICE_RATE, INVOICE_AMOUNT, INVOICE_NO, TRANSACTION_TYPE, TRANSACTION_TIME, PRODUCT_ID, BATCH_NO, PRODUCT_QUANTITY, SALE_CHANNEL, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PRD_VOUCHER_INFO LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "ID", property = "id"),
            @Result(column = "VOUCHER_ID", property = "voucherId"),
            @Result(column = "VOUCHER_TYPE", property = "voucherType"),
            @Result(column = "VOUCHER_AMOUNT", property = "voucherAmount"),
            @Result(column = "VOUCHER_REAL_AMOUNT", property = "voucherRealAmount"),
            @Result(column = "INVOICE_DEMAND", property = "invoiceDemand"),
            @Result(column = "INVOICE_RATE", property = "invoiceRate"),
            @Result(column = "INVOICE_AMOUNT", property = "invoiceAmount"),
            @Result(column = "INVOICE_NO", property = "invoiceNo"),
            @Result(column = "TRANSACTION_TYPE", property = "transactionType"),
            @Result(column = "TRANSACTION_TIME", property = "transactionTime"),
            @Result(column = "PRODUCT_ID", property = "productId"),
            @Result(column = "BATCH_NO", property = "batchNo"),
            @Result(column = "PRODUCT_QUANTITY", property = "productQuantity"),
            @Result(column = "SALE_CHANNEL", property = "saleChannel"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<PrdVoucherInfoDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO PRD_VOUCHER_INFO( ID, VOUCHER_ID, VOUCHER_TYPE, VOUCHER_AMOUNT, VOUCHER_REAL_AMOUNT, INVOICE_DEMAND, INVOICE_RATE, INVOICE_AMOUNT, INVOICE_NO, TRANSACTION_TYPE, TRANSACTION_TIME, PRODUCT_ID, BATCH_NO, PRODUCT_QUANTITY, SALE_CHANNEL, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{id}, #{voucherId}, #{voucherType}, #{voucherAmount}, #{voucherRealAmount}, #{invoiceDemand}, #{invoiceRate}, #{invoiceAmount}, #{invoiceNo}, #{transactionType}, #{transactionTime}, #{productId}, #{batchNo}, #{productQuantity}, #{saleChannel}, #{state}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(PrdVoucherInfoDTO prdVoucherInfoDTO);

}

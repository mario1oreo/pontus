package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.ProdOrderSummaryDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */
@Mapper
public interface ProdOrderSummaryDao {


    @Select("SELECT  PROD_ORDER_SUMMARY_ID, PROD_ORDER_SUMMARY_NO, PROD_ORDER_DETAIL_NO, PUB_CUSTOMER_NO, PROD_ORDER_AMOUNT, PUB_EXPRESS_NO, PUB_EXPRESS_AMOUNT, PROD_TAX_AMOUNT, PROD_ORDER_SUMMARY_REMARK, PROD_ORDER_SETTLEMENT_FLAG, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PROD_ORDER_SUMMARY")
    @Results({
            @Result(column = "PROD_ORDER_SUMMARY_ID", property = "prodOrderSummaryId"),
            @Result(column = "PROD_ORDER_SUMMARY_NO", property = "prodOrderSummaryNo"),
            @Result(column = "PROD_ORDER_DETAIL_NO", property = "prodOrderDetailNo"),
            @Result(column = "PUB_CUSTOMER_NO", property = "pubCustomerNo"),
            @Result(column = "PROD_ORDER_AMOUNT", property = "prodOrderAmount"),
            @Result(column = "PUB_EXPRESS_NO", property = "pubExpressNo"),
            @Result(column = "PUB_EXPRESS_AMOUNT", property = "pubExpressAmount"),
            @Result(column = "PROD_TAX_AMOUNT", property = "prodTaxAmount"),
            @Result(column = "PROD_ORDER_SUMMARY_REMARK", property = "prodOrderSummaryRemark"),
            @Result(column = "PROD_ORDER_SETTLEMENT_FLAG", property = "prodOrderSettlementFlag"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ProdOrderSummaryDTO> findAll();

    @Select("SELECT  PROD_ORDER_SUMMARY_ID, PROD_ORDER_SUMMARY_NO, PROD_ORDER_DETAIL_NO, PUB_CUSTOMER_NO, PROD_ORDER_AMOUNT, PUB_EXPRESS_NO, PUB_EXPRESS_AMOUNT, PROD_TAX_AMOUNT, PROD_ORDER_SUMMARY_REMARK, PROD_ORDER_SETTLEMENT_FLAG, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PROD_ORDER_SUMMARY LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "PROD_ORDER_SUMMARY_ID", property = "prodOrderSummaryId"),
            @Result(column = "PROD_ORDER_SUMMARY_NO", property = "prodOrderSummaryNo"),
            @Result(column = "PROD_ORDER_DETAIL_NO", property = "prodOrderDetailNo"),
            @Result(column = "PUB_CUSTOMER_NO", property = "pubCustomerNo"),
            @Result(column = "PROD_ORDER_AMOUNT", property = "prodOrderAmount"),
            @Result(column = "PUB_EXPRESS_NO", property = "pubExpressNo"),
            @Result(column = "PUB_EXPRESS_AMOUNT", property = "pubExpressAmount"),
            @Result(column = "PROD_TAX_AMOUNT", property = "prodTaxAmount"),
            @Result(column = "PROD_ORDER_SUMMARY_REMARK", property = "prodOrderSummaryRemark"),
            @Result(column = "PROD_ORDER_SETTLEMENT_FLAG", property = "prodOrderSettlementFlag"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ProdOrderSummaryDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO PROD_ORDER_SUMMARY( PROD_ORDER_SUMMARY_ID, PROD_ORDER_SUMMARY_NO, PROD_ORDER_DETAIL_NO, PUB_CUSTOMER_NO, PROD_ORDER_AMOUNT, PUB_EXPRESS_NO, PUB_EXPRESS_AMOUNT, PROD_TAX_AMOUNT, PROD_ORDER_SUMMARY_REMARK, PROD_ORDER_SETTLEMENT_FLAG, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{prodOrderSummaryId}, #{prodOrderSummaryNo}, #{prodOrderDetailNo}, #{pubCustomerNo}, #{prodOrderAmount}, #{pubExpressNo}, #{pubExpressAmount}, #{prodTaxAmount}, #{prodOrderSummaryRemark}, #{prodOrderSettlementFlag}, #{recordDate}, #{status}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(ProdOrderSummaryDTO prodOrderSummaryDTO);

}

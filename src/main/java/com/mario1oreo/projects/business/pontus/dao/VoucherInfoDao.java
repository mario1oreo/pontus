package com.mario1oreo.projects.business.pontus.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author mario1oreo
 * @date 2019-6-28 15:17:01
 */
@Mapper
public interface VoucherInfoDao {

    @Select("SELECT T.ID,T.VOUCHER_ID,T.VOUCHER_AMOUNT,T.VOUCHER_REAL_AMOUNT,T.INVOICE_DEMAND,T.INVOICE_RATE,T.INVOICE_AMOUNT,T.INVOICE_NO,T.TRANSATION_TYPE,T.TRANSATION_TIME,T.PRODUCT_ID,T.BATCH_NO,T.PRODUCT_QUANTITY,T.CHANNEL,T.`STATUS` FROM prd_voucher_info T")
    List<Map<String, String>> findAll();

}

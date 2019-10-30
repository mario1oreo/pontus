package com.mario1oreo.projects.business.pontus.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author mario1oreo
 * @date 2019-6-28 14:50:29
 */
@Mapper
public interface ExpressInfoDao {

    @Select("SELECT T.ID,T.VOUCHER_ID,T.EXPRESS_ID,T.EXPRESS_COMPANY,T.SENDER_TIME,T.RECEIVE_TIME,T.EXPRESS_COST_TIME,T.EXPRESS_FEE,T.RECEIVE_ADDRESS,T.RECEIVE_PROVINCE,T.RECEIVE_CITY,T.RECEIVE_REGION,T.RECEIVE_STRESST,T.SENDER_ADDRESS,T.SENDER_PROVINCE,T.SENDER_CITY,T.SENDER_REGION,T.SENDER_STRESST,T.`STATUS` FROM prd_express_info T")
    List<Map<String, String>> findAll();
}

package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.PrdExpressInfoDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 * @date 2019-11-10
 */
@Mapper
public interface PrdExpressInfoDao {


    @Select("SELECT  ID, VOUCHER_ID, EXPRESS_ID, EXPRESS_COMPANY, SENDER_TIME, RECEIVE_TIME, EXPRESS_COST_TIME, EXPRESS_FEE, RECEIVE_PERSON_NAME, RECEIVE_PHONE_NUMBER, RECEIVE_ADDRESS, RECEIVE_PROVINCE, RECEIVE_CITY, RECEIVE_REGION, RECEIVE_STREET, SENDER_PERSON_NAME, SENDER_PHONE_NUMBER, SENDER_ADDRESS, SENDER_PROVINCE, SENDER_CITY, SENDER_REGION, SENDER_STREET, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PRD_EXPRESS_INFO")
    @Results({
            @Result(column = "ID", property = "id"),
            @Result(column = "VOUCHER_ID", property = "voucherId"),
            @Result(column = "EXPRESS_ID", property = "expressId"),
            @Result(column = "EXPRESS_COMPANY", property = "expressCompany"),
            @Result(column = "SENDER_TIME", property = "senderTime"),
            @Result(column = "RECEIVE_TIME", property = "receiveTime"),
            @Result(column = "EXPRESS_COST_TIME", property = "expressCostTime"),
            @Result(column = "EXPRESS_FEE", property = "expressFee"),
            @Result(column = "RECEIVE_PERSON_NAME", property = "receivePersonName"),
            @Result(column = "RECEIVE_PHONE_NUMBER", property = "receivePhoneNumber"),
            @Result(column = "RECEIVE_ADDRESS", property = "receiveAddress"),
            @Result(column = "RECEIVE_PROVINCE", property = "receiveProvince"),
            @Result(column = "RECEIVE_CITY", property = "receiveCity"),
            @Result(column = "RECEIVE_REGION", property = "receiveRegion"),
            @Result(column = "RECEIVE_STREET", property = "receiveStreet"),
            @Result(column = "SENDER_PERSON_NAME", property = "senderPersonName"),
            @Result(column = "SENDER_PHONE_NUMBER", property = "senderPhoneNumber"),
            @Result(column = "SENDER_ADDRESS", property = "senderAddress"),
            @Result(column = "SENDER_PROVINCE", property = "senderProvince"),
            @Result(column = "SENDER_CITY", property = "senderCity"),
            @Result(column = "SENDER_REGION", property = "senderRegion"),
            @Result(column = "SENDER_STREET", property = "senderStreet"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<PrdExpressInfoDTO> findAll();

    @Select("SELECT  ID, VOUCHER_ID, EXPRESS_ID, EXPRESS_COMPANY, SENDER_TIME, RECEIVE_TIME, EXPRESS_COST_TIME, EXPRESS_FEE, RECEIVE_PERSON_NAME, RECEIVE_PHONE_NUMBER, RECEIVE_ADDRESS, RECEIVE_PROVINCE, RECEIVE_CITY, RECEIVE_REGION, RECEIVE_STREET, SENDER_PERSON_NAME, SENDER_PHONE_NUMBER, SENDER_ADDRESS, SENDER_PROVINCE, SENDER_CITY, SENDER_REGION, SENDER_STREET, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PRD_EXPRESS_INFO LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "ID", property = "id"),
            @Result(column = "VOUCHER_ID", property = "voucherId"),
            @Result(column = "EXPRESS_ID", property = "expressId"),
            @Result(column = "EXPRESS_COMPANY", property = "expressCompany"),
            @Result(column = "SENDER_TIME", property = "senderTime"),
            @Result(column = "RECEIVE_TIME", property = "receiveTime"),
            @Result(column = "EXPRESS_COST_TIME", property = "expressCostTime"),
            @Result(column = "EXPRESS_FEE", property = "expressFee"),
            @Result(column = "RECEIVE_PERSON_NAME", property = "receivePersonName"),
            @Result(column = "RECEIVE_PHONE_NUMBER", property = "receivePhoneNumber"),
            @Result(column = "RECEIVE_ADDRESS", property = "receiveAddress"),
            @Result(column = "RECEIVE_PROVINCE", property = "receiveProvince"),
            @Result(column = "RECEIVE_CITY", property = "receiveCity"),
            @Result(column = "RECEIVE_REGION", property = "receiveRegion"),
            @Result(column = "RECEIVE_STREET", property = "receiveStreet"),
            @Result(column = "SENDER_PERSON_NAME", property = "senderPersonName"),
            @Result(column = "SENDER_PHONE_NUMBER", property = "senderPhoneNumber"),
            @Result(column = "SENDER_ADDRESS", property = "senderAddress"),
            @Result(column = "SENDER_PROVINCE", property = "senderProvince"),
            @Result(column = "SENDER_CITY", property = "senderCity"),
            @Result(column = "SENDER_REGION", property = "senderRegion"),
            @Result(column = "SENDER_STREET", property = "senderStreet"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<PrdExpressInfoDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO PRD_EXPRESS_INFO( ID, VOUCHER_ID, EXPRESS_ID, EXPRESS_COMPANY, SENDER_TIME, RECEIVE_TIME, EXPRESS_COST_TIME, EXPRESS_FEE, RECEIVE_PERSON_NAME, RECEIVE_PHONE_NUMBER, RECEIVE_ADDRESS, RECEIVE_PROVINCE, RECEIVE_CITY, RECEIVE_REGION, RECEIVE_STREET, SENDER_PERSON_NAME, SENDER_PHONE_NUMBER, SENDER_ADDRESS, SENDER_PROVINCE, SENDER_CITY, SENDER_REGION, SENDER_STREET, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{id}, #{voucherId}, #{expressId}, #{expressCompany}, #{senderTime}, #{receiveTime}, #{expressCostTime}, #{expressFee}, #{receivePersonName}, #{receivePhoneNumber}, #{receiveAddress}, #{receiveProvince}, #{receiveCity}, #{receiveRegion}, #{receiveStreet}, #{senderPersonName}, #{senderPhoneNumber}, #{senderAddress}, #{senderProvince}, #{senderCity}, #{senderRegion}, #{senderStreet}, #{state}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(PrdExpressInfoDTO prdExpressInfoDTO);

}

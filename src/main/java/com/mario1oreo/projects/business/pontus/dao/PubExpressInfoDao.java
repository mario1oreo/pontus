package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.PubExpressInfoDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */
@Mapper
public interface PubExpressInfoDao {


    @Select("SELECT  PUB_EXPRESS_ID, PUB_EXPRESS_NO, PUB_EXPRESS_COMPANY, PUB_EXPRESS_SEND_ADDRESS_INFO_NO, PUB_EXPRESS_RECEIVE_ADDRESS_INFO_NO, PUB_EXPRESS_COST_PRICE, PUB_EXPRESS_BASE_PRICE, PUB_EXPRESS_APPEND_PRICE, PUB_EXPRESS_WEIGHT, PUB_EXPRESS_VOLUME, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PUB_EXPRESS_INFO")
    @Results({
            @Result(column = "PUB_EXPRESS_ID", property = "pubExpressId"),
            @Result(column = "PUB_EXPRESS_NO", property = "pubExpressNo"),
            @Result(column = "PUB_EXPRESS_COMPANY", property = "pubExpressCompany"),
            @Result(column = "PUB_EXPRESS_SEND_ADDRESS_INFO_NO", property = "pubExpressSendAddressInfoNo"),
            @Result(column = "PUB_EXPRESS_RECEIVE_ADDRESS_INFO_NO", property = "pubExpressReceiveAddressInfoNo"),
            @Result(column = "PUB_EXPRESS_COST_PRICE", property = "pubExpressCostPrice"),
            @Result(column = "PUB_EXPRESS_BASE_PRICE", property = "pubExpressBasePrice"),
            @Result(column = "PUB_EXPRESS_APPEND_PRICE", property = "pubExpressAppendPrice"),
            @Result(column = "PUB_EXPRESS_WEIGHT", property = "pubExpressWeight"),
            @Result(column = "PUB_EXPRESS_VOLUME", property = "pubExpressVolume"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<PubExpressInfoDTO> findAll();

    @Select("SELECT  PUB_EXPRESS_ID, PUB_EXPRESS_NO, PUB_EXPRESS_COMPANY, PUB_EXPRESS_SEND_ADDRESS_INFO_NO, PUB_EXPRESS_RECEIVE_ADDRESS_INFO_NO, PUB_EXPRESS_COST_PRICE, PUB_EXPRESS_BASE_PRICE, PUB_EXPRESS_APPEND_PRICE, PUB_EXPRESS_WEIGHT, PUB_EXPRESS_VOLUME, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PUB_EXPRESS_INFO LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "PUB_EXPRESS_ID", property = "pubExpressId"),
            @Result(column = "PUB_EXPRESS_NO", property = "pubExpressNo"),
            @Result(column = "PUB_EXPRESS_COMPANY", property = "pubExpressCompany"),
            @Result(column = "PUB_EXPRESS_SEND_ADDRESS_INFO_NO", property = "pubExpressSendAddressInfoNo"),
            @Result(column = "PUB_EXPRESS_RECEIVE_ADDRESS_INFO_NO", property = "pubExpressReceiveAddressInfoNo"),
            @Result(column = "PUB_EXPRESS_COST_PRICE", property = "pubExpressCostPrice"),
            @Result(column = "PUB_EXPRESS_BASE_PRICE", property = "pubExpressBasePrice"),
            @Result(column = "PUB_EXPRESS_APPEND_PRICE", property = "pubExpressAppendPrice"),
            @Result(column = "PUB_EXPRESS_WEIGHT", property = "pubExpressWeight"),
            @Result(column = "PUB_EXPRESS_VOLUME", property = "pubExpressVolume"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<PubExpressInfoDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO PUB_EXPRESS_INFO( PUB_EXPRESS_ID, PUB_EXPRESS_NO, PUB_EXPRESS_COMPANY, PUB_EXPRESS_SEND_ADDRESS_INFO_NO, PUB_EXPRESS_RECEIVE_ADDRESS_INFO_NO, PUB_EXPRESS_COST_PRICE, PUB_EXPRESS_BASE_PRICE, PUB_EXPRESS_APPEND_PRICE, PUB_EXPRESS_WEIGHT, PUB_EXPRESS_VOLUME, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{pubExpressId}, #{pubExpressNo}, #{pubExpressCompany}, #{pubExpressSendAddressInfoNo}, #{pubExpressReceiveAddressInfoNo}, #{pubExpressCostPrice}, #{pubExpressBasePrice}, #{pubExpressAppendPrice}, #{pubExpressWeight}, #{pubExpressVolume}, #{recordDate}, #{status}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(PubExpressInfoDTO pubExpressInfoDTO);

}

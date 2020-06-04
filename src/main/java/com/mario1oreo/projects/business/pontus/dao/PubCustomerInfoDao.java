package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.PubCustomerInfoDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */
@Mapper
public interface PubCustomerInfoDao {


    @Select("SELECT  PUB_CUSTOMER_INFO_ID, PUB_CUSTOMER_INFO_NO, PUB_CUSTOMER_NAME, PUB_CUSTOMER_SEX, PUB_CUSTOMER_PHONE_NO_M, PUB_CUSTOMER_PHONE_NO_S, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PUB_CUSTOMER_INFO")
    @Results({
            @Result(column = "PUB_CUSTOMER_INFO_ID", property = "pubCustomerInfoId"),
            @Result(column = "PUB_CUSTOMER_INFO_NO", property = "pubCustomerInfoNo"),
            @Result(column = "PUB_CUSTOMER_NAME", property = "pubCustomerName"),
            @Result(column = "PUB_CUSTOMER_SEX", property = "pubCustomerSex"),
            @Result(column = "PUB_CUSTOMER_PHONE_NO_M", property = "pubCustomerPhoneNoM"),
            @Result(column = "PUB_CUSTOMER_PHONE_NO_S", property = "pubCustomerPhoneNoS"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<PubCustomerInfoDTO> findAll();

    @Select("SELECT  PUB_CUSTOMER_INFO_ID, PUB_CUSTOMER_INFO_NO, PUB_CUSTOMER_NAME, PUB_CUSTOMER_SEX, PUB_CUSTOMER_PHONE_NO_M, PUB_CUSTOMER_PHONE_NO_S, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PUB_CUSTOMER_INFO LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "PUB_CUSTOMER_INFO_ID", property = "pubCustomerInfoId"),
            @Result(column = "PUB_CUSTOMER_INFO_NO", property = "pubCustomerInfoNo"),
            @Result(column = "PUB_CUSTOMER_NAME", property = "pubCustomerName"),
            @Result(column = "PUB_CUSTOMER_SEX", property = "pubCustomerSex"),
            @Result(column = "PUB_CUSTOMER_PHONE_NO_M", property = "pubCustomerPhoneNoM"),
            @Result(column = "PUB_CUSTOMER_PHONE_NO_S", property = "pubCustomerPhoneNoS"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<PubCustomerInfoDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO PUB_CUSTOMER_INFO( PUB_CUSTOMER_INFO_ID, PUB_CUSTOMER_INFO_NO, PUB_CUSTOMER_NAME, PUB_CUSTOMER_SEX, PUB_CUSTOMER_PHONE_NO_M, PUB_CUSTOMER_PHONE_NO_S, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{pubCustomerInfoId}, #{pubCustomerInfoNo}, #{pubCustomerName}, #{pubCustomerSex}, #{pubCustomerPhoneNoM}, #{pubCustomerPhoneNoS}, #{recordDate}, #{status}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(PubCustomerInfoDTO pubCustomerInfoDTO);

}

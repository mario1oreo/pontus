package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.BaseCustInfoDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 *
 * @date 2019-11-13
 *
 */
@Mapper
public interface BaseCustInfoDao {


    @Select("SELECT  ID, CUST_ID, CUST_NAME, CUST_PHONE_NUMBER, CUST_SEX, DESCRIPTION, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM BASE_CUST_INFO")
    @Results({
            @Result(column = "ID", property = "id"),
            @Result(column = "CUST_ID", property = "custId"),
            @Result(column = "CUST_NAME", property = "custName"),
            @Result(column = "CUST_PHONE_NUMBER", property = "custPhoneNumber"),
            @Result(column = "CUST_SEX", property = "custSex"),
            @Result(column = "DESCRIPTION", property = "description"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<BaseCustInfoDTO> findAll();

    @Select("SELECT  ID, CUST_ID, CUST_NAME, CUST_PHONE_NUMBER, CUST_SEX, DESCRIPTION, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM BASE_CUST_INFO LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "ID", property = "id"),
            @Result(column = "CUST_ID", property = "custId"),
            @Result(column = "CUST_NAME", property = "custName"),
            @Result(column = "CUST_PHONE_NUMBER", property = "custPhoneNumber"),
            @Result(column = "CUST_SEX", property = "custSex"),
            @Result(column = "DESCRIPTION", property = "description"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<BaseCustInfoDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO BASE_CUST_INFO( ID, CUST_ID, CUST_NAME, CUST_PHONE_NUMBER, CUST_SEX, DESCRIPTION, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{id}, #{custId}, #{custName}, #{custPhoneNumber}, #{custSex}, #{description}, #{state}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(BaseCustInfoDTO baseCustInfoDTO);

}

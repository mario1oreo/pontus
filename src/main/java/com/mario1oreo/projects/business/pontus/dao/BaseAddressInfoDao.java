package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.BaseAddressInfoDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 *
 * @date 2019-11-13
 *
 */
@Mapper
public interface BaseAddressInfoDao {


    @Select("SELECT  ID, ADDRESS_ID, ADDRESS_FULL, ADDRESS_ADDRESS, ADDRESS_PROVINCE, ADDRESS_CITY, ADDRESS_REGION, ADDRESS_STREET, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM BASE_ADDRESS_INFO")
    @Results({
            @Result(column = "ID", property = "id"),
            @Result(column = "ADDRESS_ID", property = "addressId"),
            @Result(column = "ADDRESS_FULL", property = "addressFull"),
            @Result(column = "ADDRESS_ADDRESS", property = "addressAddress"),
            @Result(column = "ADDRESS_PROVINCE", property = "addressProvince"),
            @Result(column = "ADDRESS_CITY", property = "addressCity"),
            @Result(column = "ADDRESS_REGION", property = "addressRegion"),
            @Result(column = "ADDRESS_STREET", property = "addressStreet"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<BaseAddressInfoDTO> findAll();

    @Select("SELECT  ID, ADDRESS_ID, ADDRESS_FULL, ADDRESS_ADDRESS, ADDRESS_PROVINCE, ADDRESS_CITY, ADDRESS_REGION, ADDRESS_STREET, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM BASE_ADDRESS_INFO LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "ID", property = "id"),
            @Result(column = "ADDRESS_ID", property = "addressId"),
            @Result(column = "ADDRESS_FULL", property = "addressFull"),
            @Result(column = "ADDRESS_ADDRESS", property = "addressAddress"),
            @Result(column = "ADDRESS_PROVINCE", property = "addressProvince"),
            @Result(column = "ADDRESS_CITY", property = "addressCity"),
            @Result(column = "ADDRESS_REGION", property = "addressRegion"),
            @Result(column = "ADDRESS_STREET", property = "addressStreet"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<BaseAddressInfoDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO BASE_ADDRESS_INFO( ID, ADDRESS_ID, ADDRESS_FULL, ADDRESS_ADDRESS, ADDRESS_PROVINCE, ADDRESS_CITY, ADDRESS_REGION, ADDRESS_STREET, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{id}, #{addressId}, #{addressFull}, #{addressAddress}, #{addressProvince}, #{addressCity}, #{addressRegion}, #{addressStreet}, #{state}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(BaseAddressInfoDTO baseAddressInfoDTO);

}

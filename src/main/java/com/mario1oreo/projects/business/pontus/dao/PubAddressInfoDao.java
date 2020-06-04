package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.PubAddressInfoDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */
@Mapper
public interface PubAddressInfoDao {


    @Select("SELECT  PUB_ADDRESS_INFO_ID, PUB_ADDRESS_INFO_NO, PUB_ADDRESS_FULL, PUB_ADDRESS_COUNTRY, PUB_ADDRESS_PROVINCE, PUB_ADDRESS_CITY, PUB_ADDRESS_REGION, PUB_ADDRESS_STREET, PUB_ADDRESS_ZIP_CODE, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PUB_ADDRESS_INFO")
    @Results({
            @Result(column = "PUB_ADDRESS_INFO_ID", property = "pubAddressInfoId"),
            @Result(column = "PUB_ADDRESS_INFO_NO", property = "pubAddressInfoNo"),
            @Result(column = "PUB_ADDRESS_FULL", property = "pubAddressFull"),
            @Result(column = "PUB_ADDRESS_COUNTRY", property = "pubAddressCountry"),
            @Result(column = "PUB_ADDRESS_PROVINCE", property = "pubAddressProvince"),
            @Result(column = "PUB_ADDRESS_CITY", property = "pubAddressCity"),
            @Result(column = "PUB_ADDRESS_REGION", property = "pubAddressRegion"),
            @Result(column = "PUB_ADDRESS_STREET", property = "pubAddressStreet"),
            @Result(column = "PUB_ADDRESS_ZIP_CODE", property = "pubAddressZipCode"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<PubAddressInfoDTO> findAll();

    @Select("SELECT  PUB_ADDRESS_INFO_ID, PUB_ADDRESS_INFO_NO, PUB_ADDRESS_FULL, PUB_ADDRESS_COUNTRY, PUB_ADDRESS_PROVINCE, PUB_ADDRESS_CITY, PUB_ADDRESS_REGION, PUB_ADDRESS_STREET, PUB_ADDRESS_ZIP_CODE, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM PUB_ADDRESS_INFO LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "PUB_ADDRESS_INFO_ID", property = "pubAddressInfoId"),
            @Result(column = "PUB_ADDRESS_INFO_NO", property = "pubAddressInfoNo"),
            @Result(column = "PUB_ADDRESS_FULL", property = "pubAddressFull"),
            @Result(column = "PUB_ADDRESS_COUNTRY", property = "pubAddressCountry"),
            @Result(column = "PUB_ADDRESS_PROVINCE", property = "pubAddressProvince"),
            @Result(column = "PUB_ADDRESS_CITY", property = "pubAddressCity"),
            @Result(column = "PUB_ADDRESS_REGION", property = "pubAddressRegion"),
            @Result(column = "PUB_ADDRESS_STREET", property = "pubAddressStreet"),
            @Result(column = "PUB_ADDRESS_ZIP_CODE", property = "pubAddressZipCode"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<PubAddressInfoDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO PUB_ADDRESS_INFO( PUB_ADDRESS_INFO_ID, PUB_ADDRESS_INFO_NO, PUB_ADDRESS_FULL, PUB_ADDRESS_COUNTRY, PUB_ADDRESS_PROVINCE, PUB_ADDRESS_CITY, PUB_ADDRESS_REGION, PUB_ADDRESS_STREET, PUB_ADDRESS_ZIP_CODE, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{pubAddressInfoId}, #{pubAddressInfoNo}, #{pubAddressFull}, #{pubAddressCountry}, #{pubAddressProvince}, #{pubAddressCity}, #{pubAddressRegion}, #{pubAddressStreet}, #{pubAddressZipCode}, #{recordDate}, #{status}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(PubAddressInfoDTO pubAddressInfoDTO);

}

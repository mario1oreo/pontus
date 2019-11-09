package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.ConfVoucherTypeDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 * @date 2019-11-10
 */
@Mapper
public interface ConfVoucherTypeDao {


    @Select("SELECT  ID, VOUCHER_TYPE, VOUCHER_TYPE_MEMO, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM CONF_VOUCHER_TYPE")
    @Results({
            @Result(column = "ID", property = "id"),
            @Result(column = "VOUCHER_TYPE", property = "voucherType"),
            @Result(column = "VOUCHER_TYPE_MEMO", property = "voucherTypeMemo"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ConfVoucherTypeDTO> findAll();

    @Select("SELECT  ID, VOUCHER_TYPE, VOUCHER_TYPE_MEMO, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM CONF_VOUCHER_TYPE LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "ID", property = "id"),
            @Result(column = "VOUCHER_TYPE", property = "voucherType"),
            @Result(column = "VOUCHER_TYPE_MEMO", property = "voucherTypeMemo"),
            @Result(column = "STATE", property = "state"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<ConfVoucherTypeDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO CONF_VOUCHER_TYPE( ID, VOUCHER_TYPE, VOUCHER_TYPE_MEMO, STATE, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{id}, #{voucherType}, #{voucherTypeMemo}, #{state}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(ConfVoucherTypeDTO confVoucherTypeDTO);

}

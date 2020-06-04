package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.RepairErrorLogDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */
@Mapper
public interface RepairErrorLogDao {


    @Select("SELECT  REPAIR_ERROR_LOG_ID, REPAIR_ERROR_LOG_NO, REPAIR_ERROR_LOG_ACTION, REPAIR_ERROR_LOG_LEVEL, REPAIR_ERROR_LOG_CODE_PATH, REPAIR_ERROR_LOG_DETAIL, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM REPAIR_ERROR_LOG")
    @Results({
            @Result(column = "REPAIR_ERROR_LOG_ID", property = "repairErrorLogId"),
            @Result(column = "REPAIR_ERROR_LOG_NO", property = "repairErrorLogNo"),
            @Result(column = "REPAIR_ERROR_LOG_ACTION", property = "repairErrorLogAction"),
            @Result(column = "REPAIR_ERROR_LOG_LEVEL", property = "repairErrorLogLevel"),
            @Result(column = "REPAIR_ERROR_LOG_CODE_PATH", property = "repairErrorLogCodePath"),
            @Result(column = "REPAIR_ERROR_LOG_DETAIL", property = "repairErrorLogDetail"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<RepairErrorLogDTO> findAll();

    @Select("SELECT  REPAIR_ERROR_LOG_ID, REPAIR_ERROR_LOG_NO, REPAIR_ERROR_LOG_ACTION, REPAIR_ERROR_LOG_LEVEL, REPAIR_ERROR_LOG_CODE_PATH, REPAIR_ERROR_LOG_DETAIL, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM REPAIR_ERROR_LOG LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "REPAIR_ERROR_LOG_ID", property = "repairErrorLogId"),
            @Result(column = "REPAIR_ERROR_LOG_NO", property = "repairErrorLogNo"),
            @Result(column = "REPAIR_ERROR_LOG_ACTION", property = "repairErrorLogAction"),
            @Result(column = "REPAIR_ERROR_LOG_LEVEL", property = "repairErrorLogLevel"),
            @Result(column = "REPAIR_ERROR_LOG_CODE_PATH", property = "repairErrorLogCodePath"),
            @Result(column = "REPAIR_ERROR_LOG_DETAIL", property = "repairErrorLogDetail"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<RepairErrorLogDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO REPAIR_ERROR_LOG( REPAIR_ERROR_LOG_ID, REPAIR_ERROR_LOG_NO, REPAIR_ERROR_LOG_ACTION, REPAIR_ERROR_LOG_LEVEL, REPAIR_ERROR_LOG_CODE_PATH, REPAIR_ERROR_LOG_DETAIL, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{repairErrorLogId}, #{repairErrorLogNo}, #{repairErrorLogAction}, #{repairErrorLogLevel}, #{repairErrorLogCodePath}, #{repairErrorLogDetail}, #{recordDate}, #{status}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(RepairErrorLogDTO repairErrorLogDTO);

}

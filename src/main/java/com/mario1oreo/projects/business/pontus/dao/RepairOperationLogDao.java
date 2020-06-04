package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.RepairOperationLogDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */
@Mapper
public interface RepairOperationLogDao {


    @Select("SELECT  REPAIR_OPERATION_LOG_ID, REPAIR_OPERATION_LOG_NO, REPAIR_OPERATION_LOG_TRACE_NO, REPAIR_OPERATION_LOG_ACTION, REPAIR_OPERATION_LOG_DETAIL, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM REPAIR_OPERATION_LOG")
    @Results({
            @Result(column = "REPAIR_OPERATION_LOG_ID", property = "repairOperationLogId"),
            @Result(column = "REPAIR_OPERATION_LOG_NO", property = "repairOperationLogNo"),
            @Result(column = "REPAIR_OPERATION_LOG_TRACE_NO", property = "repairOperationLogTraceNo"),
            @Result(column = "REPAIR_OPERATION_LOG_ACTION", property = "repairOperationLogAction"),
            @Result(column = "REPAIR_OPERATION_LOG_DETAIL", property = "repairOperationLogDetail"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<RepairOperationLogDTO> findAll();

    @Select("SELECT  REPAIR_OPERATION_LOG_ID, REPAIR_OPERATION_LOG_NO, REPAIR_OPERATION_LOG_TRACE_NO, REPAIR_OPERATION_LOG_ACTION, REPAIR_OPERATION_LOG_DETAIL, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY FROM REPAIR_OPERATION_LOG LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "REPAIR_OPERATION_LOG_ID", property = "repairOperationLogId"),
            @Result(column = "REPAIR_OPERATION_LOG_NO", property = "repairOperationLogNo"),
            @Result(column = "REPAIR_OPERATION_LOG_TRACE_NO", property = "repairOperationLogTraceNo"),
            @Result(column = "REPAIR_OPERATION_LOG_ACTION", property = "repairOperationLogAction"),
            @Result(column = "REPAIR_OPERATION_LOG_DETAIL", property = "repairOperationLogDetail"),
            @Result(column = "RECORD_DATE", property = "recordDate"),
            @Result(column = "STATUS", property = "status"),
            @Result(column = "CREATE_BY", property = "createBy"),
            @Result(column = "UPDATE_BY", property = "updateBy")
    })
    List<RepairOperationLogDTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO REPAIR_OPERATION_LOG( REPAIR_OPERATION_LOG_ID, REPAIR_OPERATION_LOG_NO, REPAIR_OPERATION_LOG_TRACE_NO, REPAIR_OPERATION_LOG_ACTION, REPAIR_OPERATION_LOG_DETAIL, RECORD_DATE, STATUS, CREATE_TIME, CREATE_BY, UPDATE_TIME, UPDATE_BY) " +
            "VALUES(#{repairOperationLogId}, #{repairOperationLogNo}, #{repairOperationLogTraceNo}, #{repairOperationLogAction}, #{repairOperationLogDetail}, #{recordDate}, #{status}, #{createTime}, #{createBy}, #{updateTime}, #{updateBy})")
    int insert(RepairOperationLogDTO repairOperationLogDTO);

}

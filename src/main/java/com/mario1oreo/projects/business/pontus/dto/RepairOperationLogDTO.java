package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */

@EqualsAndHashCode(callSuper = false)
@Data
public class RepairOperationLogDTO extends BaseDTO {

    /**
     * 操作记录ID
     */
    private int repairOperationLogId;
    /**
     * 操作记录编号
     */
    private String repairOperationLogNo;
    /**
     * 追踪编号
     */
    private String repairOperationLogTraceNo;
    /**
     * 操作事件名称
     */
    private String repairOperationLogAction;
    /**
     * 操作事件说明
     */
    private String repairOperationLogDetail;
    /**
     * 记录日期
     */
    private java.time.LocalDate recordDate;
    /**
     * 状态:  0-失效  1-有效
     */
    private String status;

}

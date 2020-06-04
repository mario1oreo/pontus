package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */

@EqualsAndHashCode(callSuper = false)
@Data
public class RepairErrorLogDTO extends BaseDTO {

    /**
     * 操作记录ID
     */
    private int repairErrorLogId;
    /**
     * 操作记录编号
     */
    private String repairErrorLogNo;
    /**
     * 操作事件名称
     */
    private String repairErrorLogAction;
    /**
     * 事件错误级别: DEBUG,INFO,WARN,ERROR,TRACE
     */
    private String repairErrorLogLevel;
    /**
     * 代码错误位置
     */
    private String repairErrorLogCodePath;
    /**
     * 错误日志明细
     */
    private String repairErrorLogDetail;
    /**
     * 记录日期
     */
    private java.time.LocalDate recordDate;
    /**
     * 状态:  0-失效  1-有效
     */
    private String status;

}

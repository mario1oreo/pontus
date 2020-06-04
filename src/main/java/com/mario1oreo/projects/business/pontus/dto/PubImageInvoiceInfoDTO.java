package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author mario1oreo
 * @date 2020-06-05
 */

@EqualsAndHashCode(callSuper = false)
@Data
public class PubImageInvoiceInfoDTO extends BaseDTO {

    /**
     * 影像文件ID
     */
    private int pubImageFileInvoiceId;
    /**
     * 影像照片编号
     */
    private String pubImageFileInvoiceNo;
    /**
     * 发票号
     */
    private String prodExpenseDetailInvoiceNo;
    /**
     * 影像照片文件路径
     */
    private String pubImageFilePath;
    /**
     * 影像文件内容说明
     */
    private String pubImageFileRemark;
    /**
     * 记录日期
     */
    private java.time.LocalDate recordDate;
    /**
     * 状态:  0-失效  1-有效
     */
    private String status;

}

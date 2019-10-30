package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;

@Data
public class PrdInventoryInfo {

    private long id;
    private String productId;
    private String batchNo;
    private String productName;
    private String productUnit;
    private double productQuantity;
    private String status;
    private String createBy;
    private String updateBy;

}

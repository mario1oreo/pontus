package com.mario1oreo.projects.business.pontus.dto;


import lombok.Data;

import java.time.LocalDate;

@Data
public class BiInventoryInfo {

    private long id;
    private String productId;
    private String batchNo;
    private String productName;
    private String productUnit;
    private double productQuantity;
    private LocalDate partition;
    private String status;
    private String createBy;
    private String updateBy;

}

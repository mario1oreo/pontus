package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BiIncomeInfo {

    private long id;
    private String productId;
    private String batchNo;
    private double productQuantity;
    private double salePrice;
    private double costPrice;
    private double expressQuantity;
    private double expressFee;
    private double netProfit;
    private LocalDate partition;
    private String status;
    private String createBy;
    private String updateBy;
}

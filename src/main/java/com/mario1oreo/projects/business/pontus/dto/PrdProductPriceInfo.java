package com.mario1oreo.projects.business.pontus.dto;


import lombok.Data;

@Data
public class PrdProductPriceInfo {

    private long id;
    private String productId;
    private String batchNo;
    private double buyPrice;
    private double salePrice;
    private double costPrice;
    private String status;
    private String createBy;
    private String updateBy;
}

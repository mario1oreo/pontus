package com.mario1oreo.projects.business.pontus.dto;


import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class BiIncomeInfo {

    private int id;
    private String productId;
    private String batchNo;
    private BigDecimal productQuantity;
    private BigDecimal salePrice;
    private BigDecimal costPrice;
    private BigDecimal expressQuantity;
    private BigDecimal expressFee;
    private BigDecimal netProfit;
    private LocalDate partition;
    private String status;
    private String createBy;
    private String updateBy;

}

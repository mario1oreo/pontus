package com.mario1oreo.projects.business.pontus.dto;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class PrdInventoryChangingInfo {

  private int id;
  private String voucherId;
    private String productId;
    private String batchNo;
    private String productName;
    private String productUnit;
  private BigDecimal productQuantity;
    private String status;
    private String createBy;
    private String updateBy;

}

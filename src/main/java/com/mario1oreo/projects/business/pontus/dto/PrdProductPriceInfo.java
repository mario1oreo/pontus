package com.mario1oreo.projects.business.pontus.dto;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class PrdProductPriceInfo {

  private int id;
  private String productId;
  private int batchNo;
  private BigDecimal buyPrice;
  private BigDecimal salePrice;
  private BigDecimal costPrice;
  private String status;
  private String createBy;
  private String updateBy;

}

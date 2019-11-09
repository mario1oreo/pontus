package com.mario1oreo.projects.business.pontus.dto;


import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class PrdVoucherInfo {

  private int id;
  private String voucherId;
  private int voucherType;
  private BigDecimal voucherAmount;
  private BigDecimal voucherRealAmount;
  private int invoiceDemand;
  private BigDecimal invoiceRate;
  private BigDecimal invoiceAmount;
  private String invoiceNo;
  private int transactionType;
  private LocalDateTime transactionTime;
  private String productId;
  private int batchNo;
  private BigDecimal productQuantity;
  private String channel;
  private String status;
  private String createBy;
  private String updateBy;

}

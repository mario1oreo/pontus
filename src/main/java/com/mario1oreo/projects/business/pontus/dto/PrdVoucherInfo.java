package com.mario1oreo.projects.business.pontus.dto;

import lombok.Data;

import java.time.LocalTime;

@Data
public class PrdVoucherInfo {

  private long id;
  private String voucherId;
  private double voucherAmount;
  private double voucherRealAmount;
  private String invoiceDemand;
  private double invoiceRate;
  private double invoiceAmount;
  private String invoiceNo;
  private String transactionType;
  private LocalTime transactionTime;
  private String productId;
  private String batchNo;
  private double productQuantity;
  private String channel;
  private String status;
  private String createBy;
  private String updateBy;
}

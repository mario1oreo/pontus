package com.mario1oreo.projects.business.pontus.dto;


import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class PrdExpressInfo {

  private int id;
    private String voucherId;
    private String expressId;
    private String expressCompany;
  private LocalDateTime senderTime;
  private LocalDateTime receiveTime;
  private BigDecimal expressCostTime;
  private BigDecimal expressFee;
  private String receivePersonName;
  private String receivePhoneNumber;
    private String receiveAddress;
    private String receiveProvince;
    private String receiveCity;
    private String receiveRegion;
    private String receiveStreet;
  private String senderPersonName;
  private String senderPhoneNumber;
    private String senderAddress;
    private String senderProvince;
    private String senderCity;
    private String senderRegion;
    private String senderStreet;
    private String status;
    private String createBy;
    private String updateBy;

}

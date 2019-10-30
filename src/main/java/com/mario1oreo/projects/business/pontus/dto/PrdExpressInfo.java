package com.mario1oreo.projects.business.pontus.dto;


import lombok.Data;

import java.time.LocalTime;

@Data
public class PrdExpressInfo {

    private long id;
    private String voucherId;
    private String expressId;
    private String expressCompany;
    private LocalTime senderTime;
    private LocalTime receiveTime;
    private double expressCostTime;
    private double expressFee;
    private String receiveAddress;
    private String receiveProvince;
    private String receiveCity;
    private String receiveRegion;
    private String receiveStreet;
    private String senderAddress;
    private String senderProvince;
    private String senderCity;
    private String senderRegion;
    private String senderStreet;
    private String status;
    private String createBy;
    private String updateBy;

}

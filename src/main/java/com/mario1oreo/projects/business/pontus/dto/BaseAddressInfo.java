package com.mario1oreo.projects.business.pontus.dto;


import lombok.Data;

@Data
public class BaseAddressInfo {

    private int id;
    private String addressId;
    private String addressFull;
    private String addressAddress;
    private String addressProvince;
    private String addressCity;
    private String addressRegion;
    private String addressStreet;
    private String status;
    private String createBy;
    private String updateBy;
}

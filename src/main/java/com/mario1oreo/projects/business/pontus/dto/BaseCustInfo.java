package com.mario1oreo.projects.business.pontus.dto;


import lombok.Data;

@Data
public class BaseCustInfo {

    private int id;
    private String custId;
    private String custName;
    private String custPhoneNumber;
    private int custSex;
    private String description;
    private String status;
    private String createBy;
    private String updateBy;

}

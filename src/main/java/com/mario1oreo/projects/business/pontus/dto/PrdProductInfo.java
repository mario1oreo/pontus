package com.mario1oreo.projects.business.pontus.dto;


import lombok.Data;

@Data
public class PrdProductInfo {

    private long id;
    private String productId;
    private String productCategory;
    private String productName;
    private String productUnit;
    private String description;
    private String status;
    private String createBy;
    private String updateBy;

}

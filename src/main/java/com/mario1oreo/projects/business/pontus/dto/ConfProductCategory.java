package com.mario1oreo.projects.business.pontus.dto;


import lombok.Data;

@Data
public class ConfProductCategory {

    private int id;
    private String productCategoryId;
    private String productCategoryCode;
    private String productCategoryName;
    private int productCategoryLevel;
    private String status;
    private String createBy;
    private String updateBy;

}

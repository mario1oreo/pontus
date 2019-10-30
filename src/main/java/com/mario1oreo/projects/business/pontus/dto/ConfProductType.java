package com.mario1oreo.projects.business.pontus.dto;


import lombok.Data;

@Data
public class ConfProductType {

    private long id;
    private String fullName;
    private String shortName;
    private String description;
    private String configType;
    private String status;
    private String createBy;
    private String updateBy;


}

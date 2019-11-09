package com.mario1oreo.projects.business.pontus.dto;


import lombok.Data;

@Data
public class ConfProductSize {

    private int id;
    private int formatSizeId;
    private String formatSizeCode;
    private String formatSizeName;
    private String formatSizeClass;
    private String status;
    private String createBy;
    private String updateBy;

}

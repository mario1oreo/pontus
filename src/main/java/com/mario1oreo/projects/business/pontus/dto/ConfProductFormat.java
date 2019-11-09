package com.mario1oreo.projects.business.pontus.dto;


import lombok.Data;

@Data
public class ConfProductFormat {

    private int id;
    private int formatId;
    private String formatCode;
    private int formatLength;
    private int formatWidth;
    private int formatHeight;
    private int formatWeight;
    private String status;
    private String createBy;
    private String updateBy;

}

package com.mario1oreo.projects.business.pontus.dto;


import lombok.Data;

@Data
public class ConfVoucherType {

    private int id;
    private int voucherType;
    private String voucherTypeMemo;
    private String status;
    private String createBy;
    private String updateBy;

}

package com.mario1oreo.projects.business.pontus.dto;


import lombok.Data;

@Data
public class PrdProductInfo {

  private int id;
  private String barCode;
    private String productId;
    private String productName;
  private String productCategoryOne;
  private String productCategoryTwo;
    private String productUnit;
    private String description;
  private int formatColourId;
  private int formatSizeId;
  private int formatId;
    private String status;
    private String createBy;
    private String updateBy;

}

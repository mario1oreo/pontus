package com.mario1oreo.projects.business.pontus.service;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import com.mario1oreo.projects.business.pontus.dto.AddGoodsBO;
import com.mario1oreo.projects.business.pontus.dto.PrdProductInfoDTO;

import java.util.List;


public interface ProductInfoService {

    JSONObject addGoodsInfo(AddGoodsBO bo);

    JSONArray listGoodsInfo(int pageNum, int pageSize);

    List<PrdProductInfoDTO> findProductInfoByPage(int startNum, int pageSize);

}

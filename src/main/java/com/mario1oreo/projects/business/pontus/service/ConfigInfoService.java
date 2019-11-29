package com.mario1oreo.projects.business.pontus.service;

import cn.hutool.json.JSONObject;
import com.mario1oreo.projects.business.pontus.dto.*;

import java.util.List;


public interface ConfigInfoService {

    JSONObject addColourInfo(ConfProductColourDTO dto);

    List<ConfProductColourDTO> findAllColourInfo();

    JSONObject addSizeInfo(ConfProductSizeDTO dto);

    List<ConfProductSizeDTO> findAllSizeInfo();

    JSONObject addFormatInfo(ConfProductFormatDTO dto);

    List<ConfProductFormatDTO> findAllFormatInfo();

    JSONObject addCategoryInfo(ConfProductCategoryDTO dto);

    List<ConfProductCategoryDTO> findAllCategoryInfo();

    ConfBarCodeDTO findUnUseOneBarCode();

    int updateToUsedByBarCode(ConfBarCodeDTO dto);

    int addBarCodeInfo(ConfBarCodeDTO dto);

    List<ConfProductSizeDTO> getSizeInfoCache();

    List<ConfProductColourDTO> getColourInfoCache();

    List<ConfProductFormatDTO> getFormatInfoCache();

    List<ConfProductCategoryDTO> getCategoryInfoCache();
}

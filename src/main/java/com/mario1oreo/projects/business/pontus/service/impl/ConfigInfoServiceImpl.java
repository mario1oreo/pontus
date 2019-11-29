package com.mario1oreo.projects.business.pontus.service.impl;

import cn.hutool.json.JSONObject;
import com.mario1oreo.projects.business.pontus.dao.*;
import com.mario1oreo.projects.business.pontus.dto.*;
import com.mario1oreo.projects.business.pontus.service.ConfigInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class ConfigInfoServiceImpl implements ConfigInfoService {

    private boolean confInit = false;

    private static List<ConfProductSizeDTO> sizeInfoCache = new ArrayList<>();
    private static List<ConfProductColourDTO> colourInfoCache = new ArrayList<>();
    private static List<ConfProductFormatDTO> formatInfoCache = new ArrayList<>();
    private static List<ConfProductCategoryDTO> categoryInfoCache = new ArrayList<>();


    @Resource
    ConfProductSizeDao confProductSizeDao;

    @Resource
    ConfProductColourDao confProductColourDao;

    @Resource
    ConfProductFormatDao confProductFormatDao;

    @Resource
    ConfProductCategoryDao confProductCategoryDao;

    @Resource
    ConfBarCodeDao confBarCodeDao;

    @Override
    public JSONObject addColourInfo(ConfProductColourDTO dto) {
        JSONObject result = new JSONObject();
        dto.setFormatColourId(confProductColourDao.findNextFormatColourId());
        log.info("addColourInfo.findNextFormatColourId:{}", dto.getFormatColourId());
        try {
            log.info("begin addColourInfo.insert(dto)");
            confProductColourDao.insert(dto);
            this.confInit = false;
            log.info("succeed end addColourInfo.insert(dto)");
            result.put("status", true);
        } catch (Exception e) {
            result.put("status", false);
            result.put("message", e.getMessage());
            log.error("addColourInfo.insert(dto) error!!!   message:{}", result.get("message"));
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<ConfProductColourDTO> findAllColourInfo() {
        return confProductColourDao.findAll();
    }


    @Override
    public JSONObject addSizeInfo(ConfProductSizeDTO dto) {
        JSONObject result = new JSONObject();
        dto.setFormatSizeId(confProductSizeDao.findNextFormatSizeId());
        log.info("addSizeInfo.findNextFormatSizeId:{}", dto.getFormatSizeId());
        try {
            log.info("begin addSizeInfo.insert(dto)");
            confProductSizeDao.insert(dto);
            this.confInit = false;
            log.info("confInit:{}", this.confInit);
            log.info("succeed end addSizeInfo.insert(dto)");
            result.put("status", true);
        } catch (Exception e) {
            result.put("status", false);
            result.put("message", e.getMessage());
            log.error("addSizeInfo.insert(dto) error!!!   message:{}", result.get("message"));
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<ConfProductSizeDTO> findAllSizeInfo() {
        return confProductSizeDao.findAll();
    }

    @Override
    public JSONObject addFormatInfo(ConfProductFormatDTO dto) {
        JSONObject result = new JSONObject();
        dto.setFormatId(confProductFormatDao.findNextFormatId());
        log.info("addFormatInfo.findNextFormatSizeId:{}", dto.getFormatId());
        try {
            log.info("addFormatInfo.insert(dto)");
            confProductFormatDao.insert(dto);
            this.confInit = false;
            log.info("confInit:{}", this.confInit);
            log.info("succeed end addFormatInfo.insert(dto)");
            result.put("status", true);
        } catch (Exception e) {
            result.put("status", false);
            result.put("message", e.getMessage());
            log.error("addFormatInfo.insert(dto) error!!!   message:{}", result.get("message"));
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<ConfProductFormatDTO> findAllFormatInfo() {
        return confProductFormatDao.findAll();
    }

    @Override
    public JSONObject addCategoryInfo(ConfProductCategoryDTO dto) {
        JSONObject result = new JSONObject();
        try {
            log.info("addCategoryInfo.insert(dto)");
            confProductCategoryDao.insert(dto);
            this.confInit = false;
            log.info("confInit:{}", this.confInit);
            log.info("succeed end addCategoryInfo.insert(dto)");
            result.put("status", true);
        } catch (Exception e) {
            result.put("status", false);
            result.put("message", e.getMessage());
            log.error("addCategoryInfo.insert(dto) error!!!   message:{}", result.get("message"));
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<ConfProductCategoryDTO> findAllCategoryInfo() {
        return confProductCategoryDao.findAll();
    }

    @Override
    public ConfBarCodeDTO findUnUseOneBarCode() {
        return confBarCodeDao.findUnUseOne();
    }

    @Override
    public int updateToUsedByBarCode(ConfBarCodeDTO dto) {
        return confBarCodeDao.updateToUsedByBarCode(dto);
    }

    @Override
    public int addBarCodeInfo(ConfBarCodeDTO dto) {
        return confBarCodeDao.insert(dto);
    }

    public void initConfigCache() {
        if (!this.confInit) {
            this.confInit = initConfig();
        }
    }

    public boolean initConfig() {
        sizeInfoCache = findAllSizeInfo();
        colourInfoCache = findAllColourInfo();
        formatInfoCache = findAllFormatInfo();
        categoryInfoCache = findAllCategoryInfo();
        return true;
    }

    @Override
    public List<ConfProductSizeDTO> getSizeInfoCache() {
        initConfig();
        return sizeInfoCache;
    }

    @Override
    public List<ConfProductColourDTO> getColourInfoCache() {
        initConfig();
        return colourInfoCache;
    }

    @Override
    public List<ConfProductFormatDTO> getFormatInfoCache() {
        initConfig();
        return formatInfoCache;
    }

    @Override
    public List<ConfProductCategoryDTO> getCategoryInfoCache() {
        initConfig();
        return categoryInfoCache;
    }
}

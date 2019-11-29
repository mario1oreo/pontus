package com.mario1oreo.projects.business.pontus.rest;


import cn.hutool.json.JSONObject;
import com.mario1oreo.projects.business.pontus.dto.ConfProductCategoryDTO;
import com.mario1oreo.projects.business.pontus.dto.ConfProductColourDTO;
import com.mario1oreo.projects.business.pontus.dto.ConfProductFormatDTO;
import com.mario1oreo.projects.business.pontus.dto.ConfProductSizeDTO;
import com.mario1oreo.projects.business.pontus.service.ConfigInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mario1oreo
 * @date 2019-6-28 14:51:14
 */
@RestController
@Slf4j
@CrossOrigin
@RequestMapping("config")
public class ConfigInfoRest {


    @Autowired
    ConfigInfoService configInfoService;

    @RequestMapping(value = "/addProductColour")
    @ResponseBody
    public JSONObject addProductColour(ConfProductColourDTO confProductColourDTO) {
        log.info("entry addProductColour!");
        JSONObject result = new JSONObject();
        if (confProductColourDTO != null) {
            log.info("confProductColourDTO is not null, then configInfoService.addFormatSizeInfo");
            result = configInfoService.addColourInfo(confProductColourDTO);
            log.info("configInfoService.addFormatSizeInfo.isSucceed:{}", result.get("status"));
        }
        log.info("addProductColour result:{}", result.toStringPretty());
        return result;
    }


    @RequestMapping(value = "/addProductSize")
    @ResponseBody
    public JSONObject addProductSize(ConfProductSizeDTO confProductSizeDTO) {
        log.info("entry addProductSize!");
        JSONObject result = new JSONObject();
        if (confProductSizeDTO != null) {
            log.info("confProductSizeDTO is not null, then configInfoService.addFormatSizeInfo");
            result = configInfoService.addSizeInfo(confProductSizeDTO);
            log.info("configInfoService.addFormatSizeInfo.isSucceed:{}", result.get("status"));
        }
        log.info("addProductSize result:{}", result.toStringPretty());
        return result;
    }

    @RequestMapping(value = "/addProductFormat")
    @ResponseBody
    public JSONObject addProductFormat(ConfProductFormatDTO confProductSizeDTO) {
        log.info("entry addProductFormat!");
        JSONObject result = new JSONObject();
        if (confProductSizeDTO != null) {
            log.info("confProductSizeDTO is not null, then configInfoService.addFormatSizeInfo");
            result = configInfoService.addFormatInfo(confProductSizeDTO);
            log.info("configInfoService.addFormatSizeInfo.isSucceed:{}", result.get("status"));
        }
        log.info("addProductFormat result:{}", result.toStringPretty());
        return result;
    }

    @RequestMapping(value = "/addProductCategory")
    @ResponseBody
    public JSONObject addProductCategory(ConfProductCategoryDTO confProductCategoryDTO) {
        log.info("entry addProductCategory!");
        JSONObject result = new JSONObject();
        if (confProductCategoryDTO != null) {
            log.info("confProductSizeDTO is not null, then configInfoService.addCategoryInfo");
            result = configInfoService.addCategoryInfo(confProductCategoryDTO);
            log.info("configInfoService.addCategoryInfo.isSucceed:{}", result.get("status"));
        }
        log.info("addProductCategory result:{}", result.toStringPretty());
        return result;
    }

}

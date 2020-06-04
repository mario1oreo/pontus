package com.mario1oreo.projects.business.pontus.rest;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import com.mario1oreo.projects.business.pontus.dto.DimDateDTO;
import com.mario1oreo.projects.business.pontus.dto.DimTimeDTO;
import com.mario1oreo.projects.business.pontus.dto.ResultBO;
import com.mario1oreo.projects.business.pontus.service.DimensionInfoService;
import com.mario1oreo.projects.business.pontus.utils.tools.CreateBarCode;
import com.mario1oreo.projects.business.pontus.utils.tools.CreateDateDim;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author mario1oreo
 * @date 2019-6-28 14:51:14
 */
@RestController
@Slf4j
@CrossOrigin
@RequestMapping("product")
public class ProductRest {

    @Resource
    DimensionInfoService dimensionInfoServiceImpl;



    @RequestMapping("/mockExpress")
    @ResponseBody
    public String mockExpress() {
        JSONObject result = new JSONObject();
        JSONArray data = new JSONArray();
        for (int i = 0; i < 20; i++) {
            JSONObject eachData = new JSONObject();
            eachData.put("id", i);
            eachData.put("date", DateUtil.formatDate(RandomUtil.randomDate(DateUtil.date(), DateField.DAY_OF_MONTH, 1, 25)));
            eachData.put("name", "name_" + RandomUtil.randomStringUpper(8));
            eachData.put("address", "address_" + RandomUtil.randomStringUpper(20));
            data.add(eachData);
        }
        result.put("tableData", data);
        result.put("message", "成功");
        result.put("code", "1");
        log.info("mockExpress result:{}", result.toStringPretty());
        return result.toString();
    }




    @RequestMapping("/getDate")
    @ResponseBody
    public JSONArray getDate() {
        long t1 = System.currentTimeMillis();
        long t2 = System.currentTimeMillis();
        log.debug("getDate query cost:{}", t2 - t1);
        long t3 = System.currentTimeMillis();
        JSONArray selectOptions = new JSONArray();
        selectOptions.add("2018-01-23");
//        selectOptions.add("2019-03-12");
        long t4 = System.currentTimeMillis();
        log.debug("getDate deal cost:{}", t4 - t3);
        log.info("getDate result:{}", selectOptions.toString());
        log.debug("====>> getDate END!");
        return selectOptions;
    }



    @RequestMapping("/initDimDate")
    @ResponseBody
    public JSONObject initDimDate() {
        JSONObject result = new JSONObject();
        String startDate = "1990-01-01";
        String endDate = "2049-12-31";
        JSONArray dateArr = CreateDateDim.generDate(startDate, endDate, DateField.DAY_OF_YEAR);
        int countSucceed = 0;
        long preTime = System.currentTimeMillis();
        for (int i = 0; i < dateArr.size(); i++) {
            DimDateDTO dto = dateArr.getJSONObject(i).toBean(DimDateDTO.class);
            if (i % 1000 == 0) {
                log.info("第{}条记录开始插入! dto:{}", i, dto.toString());
            }
            countSucceed += dimensionInfoServiceImpl.addDimDate(dto);
        }
        log.info("insert spend time :{}ms", DateUtil.spendMs(preTime));
        result.put("dataArr.size", dateArr.size());
        log.info("dataArr.size : {}", dateArr.size());
        result.put("countSucceed", countSucceed);
        log.info("countSucceed : {}", countSucceed);
        return result;
    }

    @RequestMapping("/initDimTime")
    @ResponseBody
    public JSONObject initDimTime() {
        JSONObject result = new JSONObject();
        JSONArray dateArr = CreateDateDim.generTime();
        int countSucceed = 0;
        long preTime = System.currentTimeMillis();
        for (int i = 0; i < dateArr.size(); i++) {
            DimTimeDTO dto = dateArr.getJSONObject(i).toBean(DimTimeDTO.class);
            if (i % 1000 == 0) {
                log.info("第{}条记录开始插入! dto:{}", i, dto.toString());
            }
            countSucceed += dimensionInfoServiceImpl.addDimTime(dto);
        }
        log.info("insert spend time :{}ms", DateUtil.spendMs(preTime));
        result.put("dataArr.size", dateArr.size());
        log.info("dataArr.size : {}", dateArr.size());
        result.put("countSucceed", countSucceed);
        log.info("countSucceed : {}", countSucceed);
        return result;
    }

    @RequestMapping("/initBarCode")
    @ResponseBody
    public JSONObject initBarCode() {
        JSONObject result = new JSONObject();
        List<String> codeList = CreateBarCode.generBarCode("697285707", 0, 999);
        int countSucceed = 0;
        long preTime = System.currentTimeMillis();

        log.info("insert spend time :{}ms", DateUtil.spendMs(preTime));
        result.put("codeList.size", codeList.size());
        log.info("codeList.size : {}", codeList.size());
        result.put("countSucceed", countSucceed);
        log.info("countSucceed : {}", countSucceed);
        return result;
    }



    @RequestMapping("/queryGoodInfoByBarCode")
    public ResultBO queryGoodInfoByBarCode(@RequestParam(defaultValue = "") String barCode) {
        log.info("entry queryGoodInfoByBarCode  barCode:{}", barCode);

        if (StrUtil.isBlank(barCode)) {
            log.warn("barCode is blank, then return empty!");
            return new ResultBO(false);
        }
        ResultBO goodInfo = new ResultBO();
        StringBuilder paramBarCode = new StringBuilder();
        if (barCode.contains("\n")) {
            String[] barCodeArray = barCode.split("\n");
            for (String barCodeEach : barCodeArray) {
                if (StrUtil.isBlank(barCodeEach)) {
                    continue;
                }
                paramBarCode.append("'").append(barCodeEach).append("',");
            }
            if (paramBarCode.toString().endsWith(",")) {
                barCode = paramBarCode.toString().substring(0, paramBarCode.length() - 2);
            }
            //TODO 商品信息冗余设计  反范式化改造
//            productInfoServiceImpl.listGoosInfoByBarCodes(barCode);
        } else {
//            productInfoServiceImpl.listGoodsInfoByBarCode(barCode);
        }
        return goodInfo;
    }

}

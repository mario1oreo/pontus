package com.mario1oreo.projects.business.pontus.rest;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.mario1oreo.projects.business.pontus.dao.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * @author mario1oreo
 * @date 2019-6-28 14:51:14
 */
@RestController
@Slf4j
@RequestMapping("product")
public class ProductRest {

    @Autowired
    BIIncomeInfoDao biIncomeInfoDao;

    @Autowired
    BIInventoryInfoDao biInventoryInfo;

    @Autowired
    ExpressInfoDao expressInfoDao;

    @Autowired
    InventoryChangingInfoDao inventoryChangingInfoDao;

    @Autowired
    InventoryInfoDao inventoryInfoDao;

    @Autowired
    ProductInfoDao productInfoDao;

    @Autowired
    ProductPriceInfoDao productPriceInfoDao;

    @Autowired
    VoucherInfoDao voucherInfoDao;

    @Autowired
    ConfProductTypeDao confProductTypeDao;

    @CrossOrigin
    @RequestMapping("/findAll")
    @ResponseBody
    public JSONArray findAll() {
        List<Map<String, String>> datas = biInventoryInfo.findAll();
        if (datas == null) {
            log.info("datas is null");
        } else {
            log.info("datas.size:{}", datas.size());
        }
        JSONArray result = JSONUtil.parseArray(datas);
        log.info("datas:{}", result.toStringPretty());
        return result;
    }


    @CrossOrigin
    @RequestMapping("/insert")
    @ResponseBody
    public String insert() {
        return "succeed";
    }

    @CrossOrigin
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

    @CrossOrigin
    @RequestMapping("/productConfig")
    @ResponseBody
    public String productConfig() {
        JSONObject result = new JSONObject();
        long t1 = System.currentTimeMillis();
        List<Map<String, String>> list = confProductTypeDao.findAll();
        long t2 = System.currentTimeMillis();
        log.debug("productConfig query cost:{}", t2 - t1);
        long t3 = System.currentTimeMillis();
        for (Map<String, String> eachRow : list) {
            String type = "select" + eachRow.get("CONFIG_TYPE");
            if (!result.containsKey( type)) {
                JSONArray typeData = new JSONArray();
                typeData.add(JSONUtil.parseFromMap(eachRow));
                result.put(type, typeData);
            } else {
                result.getJSONArray(type).add(JSONUtil.parseFromMap(eachRow));
            }
        }
        long t4 = System.currentTimeMillis();
        log.debug("productConfig deal cost:{}", t4 - t3);
        result.put("message", "成功");
        result.put("code", "1");
        log.debug("productConfig result:{}", result.toStringPretty());
        log.debug("====>> productConfig END!");
        return result.toString();
    }

}

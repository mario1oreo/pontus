package com.mario1oreo.projects.business.pontus.rest;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.mario1oreo.projects.business.pontus.dao.BiInventoryInfoDao;
import com.mario1oreo.projects.business.pontus.dao.ConfProductCategoryDao;
import com.mario1oreo.projects.business.pontus.dto.BiInventoryInfoDTO;
import com.mario1oreo.projects.business.pontus.dto.ConfProductCategoryDTO;
import com.mario1oreo.projects.business.pontus.dto.ResultBO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
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

    @Autowired
    private BiInventoryInfoDao biInventoryInfoDao;

    @Autowired
    private ConfProductCategoryDao confProductCategoryDao;

    @RequestMapping("/findAll")
    @ResponseBody
    public JSONArray findAll() {
        int pageNum = 3;
        int pageSize = 2;
        List<BiInventoryInfoDTO> datas = biInventoryInfoDao.findByPage((pageNum - 1) * pageSize, pageSize);
        if (datas == null) {
            log.info("datas is null");
        } else {
            log.info("datas.size:{}", datas.size());
        }
        JSONArray result = JSONUtil.parseArray(datas);
        log.info("datas:{}", result.toStringPretty());
        return result;
    }


    @RequestMapping("/insert")
    @ResponseBody
    public String insert() {
        BiInventoryInfoDTO bo = new BiInventoryInfoDTO();
        bo.setPartitionDt(LocalDate.now());
        bo.setProductId(RandomUtil.randomStringUpper(15));
        bo.setProductName(RandomUtil.randomStringUpper(10));
        bo.setProductQuantity(BigDecimal.ONE);
        bo.setProductUnit("t");
        bo.setUpdateBy("test");
        bo.setCreateBy("testinsert");
        bo.setState("0");
        int result = biInventoryInfoDao.insert(bo);
        return String.valueOf(result);

    }

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


    @RequestMapping("/productConfig")
    @ResponseBody
    public ResultBO productConfig() {
        ResultBO result = new ResultBO();
        long t1 = System.currentTimeMillis();
        List<ConfProductCategoryDTO> list = confProductCategoryDao.findAll();
        long t2 = System.currentTimeMillis();
        log.debug("productConfig query cost:{}", t2 - t1);
        long t3 = System.currentTimeMillis();
        for (ConfProductCategoryDTO eachRow : list) {
            String type = "select" + eachRow.getProductCategoryLevel();
            if (result.getData().getDataSource().size() == 0) {
                JSONArray typeData = new JSONArray();
                typeData.add(JSONUtil.parseObj(eachRow));
                result.getData().setDataSource(typeData);
            } else {
                result.getData().getDataSource().add(JSONUtil.parseObj(eachRow));
            }
        }
        long t4 = System.currentTimeMillis();
        log.debug("productConfig deal cost:{}", t4 - t3);
        result.setMessage("成功");
        result.setStatus("SUCCESS");
        log.debug("productConfig result:{}", result.toString());
        log.debug("====>> productConfig END!");
        return result;
    }

    @RequestMapping("/getSelect")
    @ResponseBody
    public JSONArray getSelect() {
        long t1 = System.currentTimeMillis();
        long t2 = System.currentTimeMillis();
        log.debug("getSelect query cost:{}", t2 - t1);
        long t3 = System.currentTimeMillis();
        JSONArray selectOptions = new JSONArray();
        selectOptions.add(JSONUtil.parseObj("{\"disabled\":false,\"label\":\"label1\",\"value\":\"value1\"}"));
        selectOptions.add(JSONUtil.parseObj("{\"disabled\":false,\"label\":\"label2\",\"value\":\"value2\"}"));
        selectOptions.add(JSONUtil.parseObj("{\"disabled\":false,\"label\":\"label3\",\"value\":\"value3\"}"));
        selectOptions.add(JSONUtil.parseObj("{\"disabled\":true,\"label\":\"label4\",\"value\":\"value4\"}"));
        long t4 = System.currentTimeMillis();
        log.debug("getSelect deal cost:{}", t4 - t3);
        log.info("getSelect result:{}", selectOptions.toString());
        log.debug("====>> getSelect END!");
        return selectOptions;
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

    @RequestMapping(value = "/getGoodInfos")
    @ResponseBody
    public JSONObject getGoodInfos(String goodsName, String code, String[] reverseTime, String[] bookName) {
        long t1 = System.currentTimeMillis();
        long t2 = System.currentTimeMillis();
        log.debug("getGoodInfos query cost:{}", t2 - t1);
        long t3 = System.currentTimeMillis();
        JSONObject recevieParams = new JSONObject();
        recevieParams.put("goodsName", goodsName);
        recevieParams.put("code", code);
        recevieParams.put("reverseTime", reverseTime);
        recevieParams.put("bookName", bookName);
        long t4 = System.currentTimeMillis();
        log.debug("getGoodInfos deal cost:{}", t4 - t3);
        log.info("getGoodInfos result:{}", recevieParams.toString());
        log.debug("====>> getGoodInfos END!");
        return recevieParams;
    }

    @RequestMapping("/addGoods")
    @ResponseBody
    public JSONObject addGoods() {
        long t1 = System.currentTimeMillis();
        long t2 = System.currentTimeMillis();
        log.debug("addGoods query cost:{}", t2 - t1);
        long t3 = System.currentTimeMillis();
        JSONArray selectOptions = new JSONArray();
        selectOptions.add(JSONUtil.parseObj("{\"disabled\":false,\"label\":\"label1\",\"value\":\"value1\"}"));
        selectOptions.add(JSONUtil.parseObj("{\"disabled\":false,\"label\":\"label2\",\"value\":\"value2\"}"));
        selectOptions.add(JSONUtil.parseObj("{\"disabled\":false,\"label\":\"label3\",\"value\":\"value3\"}"));
        selectOptions.add(JSONUtil.parseObj("{\"disabled\":true,\"label\":\"label4\",\"value\":\"value4\"}"));
        JSONObject goodInfo = new JSONObject();
        goodInfo.put("stock", 1);
        goodInfo.put("options", selectOptions);
        JSONArray reverseTimeArray = new JSONArray();
        reverseTimeArray.add(DateUtil.today());
        goodInfo.put("reverseTime", reverseTimeArray);
        goodInfo.put("payment", String.valueOf(RandomUtil.randomInt(1, 3)));
        goodInfo.put("show", String.valueOf(RandomUtil.randomInt(1, 3)));
        long t4 = System.currentTimeMillis();
        log.debug("addGoods deal cost:{}", t4 - t3);
        log.info("addGoods result:{}", goodInfo.toString());
        log.debug("====>> addGoods END!");
        return goodInfo;
    }
}

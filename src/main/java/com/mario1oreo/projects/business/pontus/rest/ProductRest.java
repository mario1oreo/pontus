package com.mario1oreo.projects.business.pontus.rest;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.mario1oreo.projects.business.pontus.dao.BiInventoryInfoDao;
import com.mario1oreo.projects.business.pontus.dto.*;
import com.mario1oreo.projects.business.pontus.service.ConfigInfoService;
import com.mario1oreo.projects.business.pontus.service.DimensionInfoService;
import com.mario1oreo.projects.business.pontus.service.ProductInfoService;
import com.mario1oreo.projects.business.pontus.utils.tools.CreateBarCode;
import com.mario1oreo.projects.business.pontus.utils.tools.CreateDateDim;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

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
    private BiInventoryInfoDao biInventoryInfoDao;

    @Resource
    DimensionInfoService dimensionInfoServiceImpl;

    @Resource
    ProductInfoService productInfoServiceImpl;

    @Resource
    ConfigInfoService configInfoServiceImpl;

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
        List<ConfProductCategoryDTO> list = configInfoServiceImpl.findAllCategoryInfo();
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


    @RequestMapping(value = "/addGoodsInfo")
    @ResponseBody
    public JSONObject addGoodsInfo(AddGoodsBO addGoodsBO) {
        log.info("entry addGoodsInfo");
        JSONObject receiveParam = new JSONObject();
        if (addGoodsBO == null) {
            log.error("addGoodsBO is null! ");
            receiveParam.put("status", false);
            receiveParam.put("message", "接收到的参数为空对象，请联系管理员查看服务器状态！！");
            return receiveParam;
        }

        receiveParam = productInfoServiceImpl.addGoodsInfo(addGoodsBO);

        log.info("addGoodsInfo result:{}", receiveParam.toString());
        log.debug("====>> addGoodsInfo END!");
        return receiveParam;
    }

    @RequestMapping("/getGoodsOptions")
    @ResponseBody
    public JSONObject getGoodsOptions() {
        List<ConfProductCategoryDTO> optionsLevelList = configInfoServiceImpl.findAllCategoryInfo();
        JSONArray optionsLevel1 = optionsLevelList.stream().filter(dto -> dto.getProductCategoryLevel() == 1).map(dto -> {
            JSONObject option = new JSONObject();
            option.put("label", dto.getProductCategoryName());
            option.put("value", dto.getProductCategoryId());
            option.put("disable", "0".equals(dto.getState()));
            return option;
        }).collect(Collectors.toCollection(JSONArray::new));

        JSONArray optionsLevel2 = optionsLevelList.stream().filter(dto -> dto.getProductCategoryLevel() == 2).map(dto -> {
            JSONObject option = new JSONObject();
            option.put("label", dto.getProductCategoryName());
            option.put("value", dto.getProductCategoryId());
            option.put("disable", "0".equals(dto.getState()));
            return option;
        }).collect(Collectors.toCollection(JSONArray::new));

        JSONArray optionsLevel3 = optionsLevelList.stream().filter(dto -> dto.getProductCategoryLevel() == 3).map(dto -> {
            JSONObject option = new JSONObject();
            option.put("label", dto.getProductCategoryName());
            option.put("value", dto.getProductCategoryId());
            option.put("disable", "0".equals(dto.getState()));
            return option;
        }).collect(Collectors.toCollection(JSONArray::new));

        List<ConfProductColourDTO> optionsColorList = configInfoServiceImpl.findAllColourInfo();
        JSONArray optionsColor = optionsColorList.stream().map(dto -> {
            JSONObject option = new JSONObject();
            option.put("label", dto.getFormatColourName());
            option.put("value", dto.getFormatColourId());
            option.put("disable", "0".equals(dto.getState()));
            return option;
        }).collect(Collectors.toCollection(JSONArray::new));

        List<ConfProductFormatDTO> optionsFormatList = configInfoServiceImpl.findAllFormatInfo();
        JSONArray optionsFormat = optionsFormatList.stream().map(dto -> {
            JSONObject option = new JSONObject();
            option.put("label", dto.getFormatCode());
            option.put("value", dto.getFormatId());
            option.put("disable", "0".equals(dto.getState()));
            return option;
        }).collect(Collectors.toCollection(JSONArray::new));

        List<ConfProductSizeDTO> optionsSizeList = configInfoServiceImpl.findAllSizeInfo();
        JSONArray optionsSize = optionsSizeList.stream().map(dto -> {
            JSONObject option = new JSONObject();
            option.put("label", dto.getFormatSizeCode());
            option.put("value", dto.getFormatSizeId());
            option.put("disable", "0".equals(dto.getState()));
            return option;
        }).collect(Collectors.toCollection(JSONArray::new));

        ConfBarCodeDTO confBarCodeDTO = configInfoServiceImpl.findUnUseOneBarCode();
        JSONObject result = new JSONObject();
        result.put("barCode", confBarCodeDTO.getBarCode());
        result.put("optionsLevel1", optionsLevel1);
        result.put("optionsLevel2", optionsLevel2);
        result.put("optionsLevel3", optionsLevel3);
        result.put("optionsColor", optionsColor);
        result.put("optionsFormat", optionsFormat);
        result.put("optionsSize", optionsSize);
        result.put("productQuantity", 0);
        log.info("getGoodsOptions result:{}", result.toString());
        return result;
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
        for (String code : codeList) {
            ConfBarCodeDTO dto = new ConfBarCodeDTO();
            dto.setBarCode(code);
            countSucceed += configInfoServiceImpl.addBarCodeInfo(dto);
        }
        log.info("insert spend time :{}ms", DateUtil.spendMs(preTime));
        result.put("codeList.size", codeList.size());
        log.info("codeList.size : {}", codeList.size());
        result.put("countSucceed", countSucceed);
        log.info("countSucceed : {}", countSucceed);
        return result;
    }


    @RequestMapping("/queryGoodsInfoList")
    @ResponseBody
    public JSONArray queryGoodsInfoList(@RequestParam(defaultValue = "0") int current, @RequestParam(defaultValue = "10") int pageSize) {
        log.info("queryGoodsInfoList currentPageNum:{}  pageSize:{}", current, pageSize);
        return productInfoServiceImpl.listGoodsInfo(current, pageSize);
    }
}

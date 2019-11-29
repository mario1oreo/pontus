package com.mario1oreo.projects.business.pontus.service.impl;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.mario1oreo.projects.business.pontus.dao.PrdInventoryChangingInfoDao;
import com.mario1oreo.projects.business.pontus.dao.PrdInventoryInfoDao;
import com.mario1oreo.projects.business.pontus.dao.PrdProductInfoDao;
import com.mario1oreo.projects.business.pontus.dao.PrdProductPriceInfoDao;
import com.mario1oreo.projects.business.pontus.dto.*;
import com.mario1oreo.projects.business.pontus.service.ConfigInfoService;
import com.mario1oreo.projects.business.pontus.service.ProductInfoService;
import com.mario1oreo.projects.business.pontus.service.VoucherInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Resource
    PrdProductInfoDao prdProductInfoDao;

    @Resource
    PrdProductPriceInfoDao prdProductPriceInfoDao;

    @Resource
    PrdInventoryInfoDao prdInventoryInfoDao;

    @Resource
    PrdInventoryChangingInfoDao prdInventoryChangingInfoDao;

    @Resource
    VoucherInfoService voucherInfoServiceImpl;


    @Resource
    ConfigInfoService configInfoServiceImpl;

    @Transactional
    @Override
    public JSONObject addGoodsInfo(AddGoodsBO bo) throws RuntimeException {

        JSONObject result = new JSONObject();
        log.info("entry addGoodsInfo!   GoodsName:{}", bo.getProductName());

        StringBuilder productId = new StringBuilder();

        ConfBarCodeDTO confBarCodeDTO = new ConfBarCodeDTO();

        log.info("translate AddGoodsBO to PrdProductInfoDTO   start...");
        PrdProductInfoDTO prdProductInfoDTO = new PrdProductInfoDTO();

        log.info("getBarCode:{}", bo.getBarCode());
        prdProductInfoDTO.setBarCode(bo.getBarCode());
        confBarCodeDTO.setBarCode(bo.getBarCode());

        log.info("getProductName:{}", bo.getProductName());
        prdProductInfoDTO.setProductName(bo.getProductName());
        confBarCodeDTO.setProductName(bo.getProductName());

        log.info("getProductCategoryOne:{}", bo.getProductCategoryOne());
        prdProductInfoDTO.setProductCategoryOne(bo.getProductCategoryOne());
        productId.append(bo.getProductCategoryOne()).append(StrUtil.UNDERLINE);

        log.info("getProductCategoryTwo:{}", bo.getProductCategoryTwo());
        prdProductInfoDTO.setProductCategoryTwo(bo.getProductCategoryTwo());
        productId.append(bo.getProductCategoryTwo()).append(StrUtil.UNDERLINE);

        if (StrUtil.isNotEmpty(bo.getProductCategoryThr())) {
            log.info("getProductCategoryThr:{}", bo.getProductCategoryThr());
            productId.append(bo.getProductCategoryThr()).append(StrUtil.UNDERLINE);
            prdProductInfoDTO.setProductCategoryThr(bo.getProductCategoryThr());
        } else {
            prdProductInfoDTO.setProductCategoryThr(StrUtil.EMPTY);
        }

        if (StrUtil.isNotEmpty(bo.getProductCategoryFor())) {
            log.info("getProductCategoryFor:{}", bo.getProductCategoryFor());
            productId.append(bo.getProductCategoryFor()).append(StrUtil.UNDERLINE);
            prdProductInfoDTO.setProductCategoryFor(bo.getProductCategoryFor());
        } else {
            prdProductInfoDTO.setProductCategoryFor(StrUtil.EMPTY);
        }
        productId.append(DateUtil.yearAndQuarter(DateUtil.date())).append(StrUtil.UNDERLINE);
        productId.append(RandomUtil.randomString(4));
        log.info("generate productId:{}", productId.toString());

        log.info("setProductId:{}", productId.toString());
        prdProductInfoDTO.setProductId(productId.toString());
        confBarCodeDTO.setProductId(productId.toString());

        log.info("getFormatColourId:{}", bo.getFormatColourId());
        prdProductInfoDTO.setFormatColourId(bo.getFormatColourId());

        log.info("getFormatSizeId:{}", bo.getFormatSizeId());
        prdProductInfoDTO.setFormatSizeId(bo.getFormatSizeId());

        log.info("getFormatId:{}", bo.getFormatId());
        prdProductInfoDTO.setFormatId(bo.getFormatId());

        log.info("translate AddGoodsBO to PrdProductInfoDTO   succeed!");

        log.info("translate AddGoodsBO to PrdProductPriceInfoDTO   start...");
        PrdProductPriceInfoDTO prdProductPriceInfoDTO = new PrdProductPriceInfoDTO();

        log.info("setBatchNo:0");
        prdProductPriceInfoDTO.setBatchNo(0);

        log.info("setProductId:{}", productId.toString());
        prdProductPriceInfoDTO.setProductId(productId.toString());

        log.info("getCostPrice:{}", bo.getCostPrice());
        prdProductPriceInfoDTO.setCostPrice(bo.getCostPrice());
        prdProductPriceInfoDTO.setBuyPrice(bo.getCostPrice());

        log.info("getSalePrice:{}", bo.getSalePrice());
        prdProductPriceInfoDTO.setSalePrice(bo.getSalePrice());

        log.info("getProductQuantity:{}", bo.getProductQuantity());
        prdProductPriceInfoDTO.setProductQuantity(bo.getProductQuantity());

        if (StrUtil.isBlank(bo.getDescription())) {
            prdProductInfoDTO.setDescription(StrUtil.EMPTY);
        } else {
            log.info("getDescription:{}", bo.getDescription());
            prdProductInfoDTO.setDescription(bo.getDescription());
        }

        log.info("translate AddGoodsBO to PrdProductPriceInfoDTO   succeed!");

        log.info("translate AddGoodsBO to prdInventoryInfoDTO   start...");
        PrdInventoryInfoDTO prdInventoryInfoDTO = new PrdInventoryInfoDTO();

        log.info("setProductId:{}", productId.toString());
        prdInventoryInfoDTO.setProductId(productId.toString());

        log.info("setBatchNo:0");
        prdInventoryInfoDTO.setBatchNo(0);

        log.info("getProductUnit:{}", bo.getProductUnit());
        prdInventoryInfoDTO.setProductUnit(bo.getProductUnit());

        log.info("getProductQuantity:{}", bo.getProductQuantity());
        prdInventoryInfoDTO.setProductQuantity(bo.getProductQuantity());

        log.info("translate AddGoodsBO to prdInventoryInfoDTO   succeed!");


        PrdVoucherInfoDTO prdVoucherInfoDTO = new PrdVoucherInfoDTO();

        StringBuilder voucherId = new StringBuilder();
        voucherId.append(DateUtil.date().toString(DatePattern.PURE_DATETIME_PATTERN));
        voucherId.append("ADDG").append(RandomUtil.randomNumbers(8));
        log.info("voucherId:{}", voucherId.toString());


        log.info("translate AddGoodsBO to PrdInventoryChangingInfoDTO   start...");
        PrdInventoryChangingInfoDTO prdInventoryChangingInfoDTO = new PrdInventoryChangingInfoDTO();

        prdInventoryChangingInfoDTO.setVoucherId(voucherId.toString());

        log.info("getProductId:{}", prdInventoryInfoDTO.getProductId());
        prdInventoryChangingInfoDTO.setProductId(prdInventoryInfoDTO.getProductId());

        log.info("getBatchNo:{}", prdInventoryInfoDTO.getBatchNo());
        prdInventoryChangingInfoDTO.setBatchNo(prdInventoryInfoDTO.getBatchNo());

        log.info("getProductQuantity:{}", prdInventoryInfoDTO.getProductQuantity());
        prdInventoryChangingInfoDTO.setProductQuantity(prdInventoryInfoDTO.getProductQuantity());

        log.info("getProductUnit:{}", prdInventoryInfoDTO.getProductUnit());
        prdInventoryChangingInfoDTO.setProductUnit(prdInventoryInfoDTO.getProductUnit());

        log.info("translate AddGoodsBO to PrdInventoryChangingInfoDTO   succeed!");

        try {
            log.info("insert data  begin...");
            log.info("prdProductInfoDTO:{}", prdProductInfoDTO.toString());
            prdProductInfoDao.insert(prdProductInfoDTO);
            log.info("prdProductPriceInfoDTO:{}", prdProductPriceInfoDTO.toString());
            prdProductPriceInfoDao.insert(prdProductPriceInfoDTO);
            log.info("prdInventoryInfoDTO:{}", prdInventoryInfoDTO.toString());
            prdInventoryInfoDao.insert(prdInventoryInfoDTO);
            log.info("prdInventoryChangingInfoDTO:{}", prdInventoryChangingInfoDTO.toString());
            prdInventoryChangingInfoDao.insert(prdInventoryChangingInfoDTO);
            log.info("confBarCodeDTO:{}", confBarCodeDTO.toString());
            configInfoServiceImpl.updateToUsedByBarCode(confBarCodeDTO);
            log.info("insert data  succeed!");
            result.put("status", true);
            result.put("message", "添加商品成功！");
        } catch (Exception e) {
            result.put("status", false);
            result.put("message", "添加商品失败！" + e.getMessage());
            log.error("addGoodsInfo. error!!!   message:{}", result.get("message"));
            e.printStackTrace();
            throw new RuntimeException("添加商品失败！");
        }
        return result;
    }

    @Override
    public JSONArray listGoodsInfo(int pageNum, int pageSize) {
        int startNum = (pageNum - 1) * pageSize;
        if (startNum < 0) {
            startNum = 0;
        }
        log.info("listGoodsInfo startNum:{}  pageSize:{}", startNum, pageSize);
        List<PrdProductInfoDTO> productInfo = findProductInfoByPage(startNum, pageSize);


        List<PrdInventoryInfoDTO> inventoryInfo = prdInventoryInfoDao.findAll();
        List<PrdProductPriceInfoDTO> priceInfo = prdProductPriceInfoDao.findAll();
        List<ConfProductCategoryDTO> categoryInfo = configInfoServiceImpl.getCategoryInfoCache();
        List<ConfProductColourDTO> colourInfo = configInfoServiceImpl.getColourInfoCache();
        List<ConfProductFormatDTO> formatInfo = configInfoServiceImpl.getFormatInfoCache();
        List<ConfProductSizeDTO> sizeInfo = configInfoServiceImpl.getSizeInfoCache();

        JSONArray result = productInfo.stream().map(dto -> {
            PrdProductPriceInfoDTO currentPriceInfo = priceInfo.stream().filter(priceInfoDTO -> dto.getProductId().equals(priceInfoDTO.getProductId())).findFirst().get();
            PrdInventoryInfoDTO currentInventoryInfo = inventoryInfo.stream().filter(prdInventoryInfoDTO -> dto.getProductId().equals(prdInventoryInfoDTO.getProductId())).findFirst().get();
            ConfProductCategoryDTO currentCategoryOneInfo = categoryInfo.stream().filter(confProductCategoryDTO -> dto.getProductCategoryOne().equals(confProductCategoryDTO.getProductCategoryId())).findFirst().get();
            ConfProductCategoryDTO currentCategoryTwoInfo = categoryInfo.stream().filter(confProductCategoryDTO -> dto.getProductCategoryTwo().equals(confProductCategoryDTO.getProductCategoryId())).findFirst().get();
            ConfProductCategoryDTO currentCategoryThrInfo = categoryInfo.stream().filter(confProductCategoryDTO -> dto.getProductCategoryThr().equals(confProductCategoryDTO.getProductCategoryId())).findFirst().get();

            String currentColourName = colourInfo.stream().filter(confProductColourDTO -> dto.getFormatColourId() == confProductColourDTO.getFormatColourId()).findFirst().get().getFormatColourName();
            String currentFormatCode = formatInfo.stream().filter(confProductFormatDTO -> dto.getFormatId() == confProductFormatDTO.getFormatId()).findFirst().get().getFormatCode();
            String currentSizeCode = sizeInfo.stream().filter(confProductSizeDTO -> dto.getFormatSizeId() == confProductSizeDTO.getFormatSizeId()).findFirst().get().getFormatSizeCode();

            ShowGoodsBO showGoodsBO = new ShowGoodsBO();
            showGoodsBO.setProductId(dto.getProductId());
            showGoodsBO.setBarCode(dto.getBarCode());
            showGoodsBO.setBuyPrice(currentPriceInfo.getBuyPrice());
            showGoodsBO.setCostPrice(currentPriceInfo.getCostPrice());
            showGoodsBO.setSalePrice(currentPriceInfo.getSalePrice());
            showGoodsBO.setProductName(dto.getProductName());
            showGoodsBO.setDescription(dto.getDescription());
            showGoodsBO.setProductCategoryOne(StrUtil.nullToEmpty(currentCategoryOneInfo.getProductCategoryName()));
            showGoodsBO.setProductCategoryTwo(StrUtil.nullToEmpty(currentCategoryTwoInfo.getProductCategoryName()));
            if (currentCategoryThrInfo != null) {
                showGoodsBO.setProductCategoryThr(StrUtil.nullToEmpty(currentCategoryThrInfo.getProductCategoryName()));
            }
            showGoodsBO.setProductCategoryFor(StrUtil.nullToEmpty(null));

            showGoodsBO.setProductUnit(currentInventoryInfo.getProductUnit());
            showGoodsBO.setProductQuantity(currentInventoryInfo.getProductQuantity());
            showGoodsBO.setFormatColourName(currentColourName);
            showGoodsBO.setFormatCode(currentFormatCode);
            showGoodsBO.setFormatSizeCode(currentSizeCode);
            return JSONUtil.parseObj(showGoodsBO);
        }).collect(Collectors.toCollection(JSONArray::new));

        log.info("listGoodsInfo result:{}", result.toStringPretty());
        return result;
    }

    @Override
    public List<PrdProductInfoDTO> findProductInfoByPage(int startNum, int pageSize) {
        return prdProductInfoDao.findByPage(startNum, pageSize);
    }


}

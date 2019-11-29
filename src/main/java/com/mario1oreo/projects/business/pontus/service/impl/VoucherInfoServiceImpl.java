package com.mario1oreo.projects.business.pontus.service.impl;

import cn.hutool.json.JSONObject;
import com.mario1oreo.projects.business.pontus.dao.PrdVoucherInfoDao;
import com.mario1oreo.projects.business.pontus.dto.PrdVoucherInfoDTO;
import com.mario1oreo.projects.business.pontus.service.VoucherInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Slf4j
@Service
public class VoucherInfoServiceImpl implements VoucherInfoService {

    @Resource
    PrdVoucherInfoDao prdVoucherInfoDao;

    @Override
    public JSONObject generateVoucherInfo(PrdVoucherInfoDTO dto) {
        JSONObject result = new JSONObject();
        try {
            log.info("begin generateVoucherInfo.insert(dto)");
            prdVoucherInfoDao.insert(dto);
            log.info("succeed end generateVoucherInfo.insert(dto)");
            result.put("status", true);
        } catch (Exception e) {
            result.put("status", false);
            result.put("message", e.getMessage());
            log.error("generateVoucherInfo.insert(dto) error!!!   message:{}", result.get("message"));
            e.printStackTrace();
        }
        return result;
    }
}

package com.mario1oreo.projects.business.pontus.rest;


import cn.hutool.json.JSONObject;
import com.mario1oreo.projects.business.pontus.dto.PrdVoucherInfoDTO;
import com.mario1oreo.projects.business.pontus.service.VoucherInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/voucher")
public class VoucherRest {

    @Resource
    VoucherInfoService voucherInfoServiceImpl;

    @RequestMapping("/test")
    public JSONObject test() {
        JSONObject result = new JSONObject();
        result.put("key", "this.is.a.test!");
        return result;
    }


    @RequestMapping("addVoucher")
    public JSONObject addVoucher(PrdVoucherInfoDTO voucherInfoDTO) {
        return voucherInfoServiceImpl.generateVoucherInfo(voucherInfoDTO);
    }
}

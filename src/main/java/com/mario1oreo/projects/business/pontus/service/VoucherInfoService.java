package com.mario1oreo.projects.business.pontus.service;

import cn.hutool.json.JSONObject;
import com.mario1oreo.projects.business.pontus.dto.PrdVoucherInfoDTO;


public interface VoucherInfoService {

    JSONObject generateVoucherInfo(PrdVoucherInfoDTO dto);
}

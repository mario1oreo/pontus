package com.mario1oreo.projects.business.pontus.service.impl;

import com.mario1oreo.projects.business.pontus.dao.DimDateDao;
import com.mario1oreo.projects.business.pontus.dao.DimTimeDao;
import com.mario1oreo.projects.business.pontus.dto.DimDateDTO;
import com.mario1oreo.projects.business.pontus.dto.DimTimeDTO;
import com.mario1oreo.projects.business.pontus.service.DimensionInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class DimensionInfoServiceImpl implements DimensionInfoService {

    @Resource
    DimDateDao dimDateDao;

    @Resource
    DimTimeDao dimTimeDao;

    @Override
    public int addDimDate(DimDateDTO dto) {
        return dimDateDao.insert(dto);
    }

    @Override
    public int addDimTime(DimTimeDTO dto) {
        return dimTimeDao.insert(dto);
    }
}

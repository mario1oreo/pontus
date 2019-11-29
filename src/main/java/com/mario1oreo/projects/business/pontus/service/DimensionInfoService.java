package com.mario1oreo.projects.business.pontus.service;

import com.mario1oreo.projects.business.pontus.dto.DimDateDTO;
import com.mario1oreo.projects.business.pontus.dto.DimTimeDTO;

public interface DimensionInfoService {

    int addDimDate(DimDateDTO dto);

    int addDimTime(DimTimeDTO dto);
}

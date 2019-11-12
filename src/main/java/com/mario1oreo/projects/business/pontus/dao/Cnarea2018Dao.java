package com.mario1oreo.projects.business.pontus.dao;


import com.mario1oreo.projects.business.pontus.dto.Cnarea2018DTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mario1oreo
 * @date 2019-11-13
 */
@Mapper
public interface Cnarea2018Dao {


    @Select("SELECT  id, level, parent_code, area_code, zip_code, city_code, name, short_name, merger_name, pinyin, lng, lat FROM CNAREA_2018")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "level", property = "level"),
            @Result(column = "parent_code", property = "parentCode"),
            @Result(column = "area_code", property = "areaCode"),
            @Result(column = "zip_code", property = "zipCode"),
            @Result(column = "city_code", property = "cityCode"),
            @Result(column = "name", property = "name"),
            @Result(column = "short_name", property = "shortName"),
            @Result(column = "merger_name", property = "mergerName"),
            @Result(column = "pinyin", property = "pinyin"),
            @Result(column = "lng", property = "lng"),
            @Result(column = "lat", property = "lat")
    })
    List<Cnarea2018DTO> findAll();

    @Select("SELECT  id, level, parent_code, area_code, zip_code, city_code, name, short_name, merger_name, pinyin, lng, lat FROM CNAREA_2018 LIMIT #{startNum},#{pageSize}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "level", property = "level"),
            @Result(column = "parent_code", property = "parentCode"),
            @Result(column = "area_code", property = "areaCode"),
            @Result(column = "zip_code", property = "zipCode"),
            @Result(column = "city_code", property = "cityCode"),
            @Result(column = "name", property = "name"),
            @Result(column = "short_name", property = "shortName"),
            @Result(column = "merger_name", property = "mergerName"),
            @Result(column = "pinyin", property = "pinyin"),
            @Result(column = "lng", property = "lng"),
            @Result(column = "lat", property = "lat")
    })
    List<Cnarea2018DTO> findByPage(@Param("startNum") int startNum, @Param("pageSize") int pageSize);

    @Insert("INSERT INTO CNAREA_2018( id, level, parent_code, area_code, zip_code, city_code, name, short_name, merger_name, pinyin, lng, lat) " +
            "VALUES(#{id}, #{level}, #{parentCode}, #{areaCode}, #{zipCode}, #{cityCode}, #{name}, #{shortName}, #{mergerName}, #{pinyin}, #{lng}, #{lat})")
    int insert(Cnarea2018DTO cnarea2018DTO);

}

package com.mario1oreo.projects.business.pontus.utils.tools;


import cn.hutool.core.date.*;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class CreateDateDim {

    public static JSONArray generDate(String startDate, String endDate, DateField unit) {

        long preTime = System.currentTimeMillis();
        List<DateTime> rangeList = DateUtil.rangeToList(DateUtil.parseDate(startDate), DateUtil.parseDate(endDate), unit);
        long spendTime = DateUtil.spendMs(preTime);
        log.info("rangeList.size:{}", rangeList.size());
        log.info("rangeToList cost time:{}ms", spendTime);
        preTime = System.currentTimeMillis();
        JSONArray dateJsonArr = new JSONArray(rangeList.size());
        for (DateTime dateTime : rangeList) {
            dateTime.setFirstDayOfWeek(Week.MONDAY);
            JSONObject date = new JSONObject();
            date.put("year", dateTime.year());
            date.put("quarter", dateTime.quarter());
            date.put("month", dateTime.monthStartFromOne());
            date.put("weekOfYear", dateTime.weekOfYear());
            date.put("weekOfMonth", dateTime.weekOfMonth());
            date.put("dayOfMonth", dateTime.dayOfMonth());
            date.put("dayOfYear", DateUtil.betweenDay(DateUtil.beginOfYear(dateTime), dateTime, true) + 1);
            date.put("dayOfWeek", dateTime.dayOfWeek());
            date.put("dayOfWeekInMonth", dateTime.dayOfWeekInMonth());
            date.put("dayOfYearAndQuarter", DateUtil.yearAndQuarter(dateTime));
            date.put("dayOfFirstHalfOfYear", dateTime.quarter() > 2 ? 1 : 0);
            date.put("isWeekend", dateTime.isWeekend());
            date.put("isHoliday", dateTime.isWeekend());
            date.put("isLeapYear", dateTime.isLeapYear());
            date.put("dateCode", dateTime.toDateStr());
            date.put("dateValue", dateTime.toSqlDate());
            date.put("dateId", dateTime.toString(DatePattern.PURE_DATE_FORMAT));
            dateJsonArr.add(date);
        }
        spendTime = DateUtil.spendMs(preTime);
        log.info("translate to jsonArray cost time:{}ms", spendTime);
        log.info("rangeList size:{} ", rangeList.size());
        return dateJsonArr;
    }

    public static JSONArray generTime() {

        long preTime = System.currentTimeMillis();
        String startDate = "2019-01-01 00:00:00";
        String endDate = "2019-01-01 23:59:59";
        List<DateTime> rangeList = DateUtil.rangeToList(DateUtil.parseDateTime(startDate), DateUtil.parseDateTime(endDate), DateField.SECOND);
        long spendTime = DateUtil.spendMs(preTime);
        log.info("rangeList.size:{}", rangeList.size());
        log.info("rangeToList cost time:{}ms", spendTime);
        preTime = System.currentTimeMillis();
        JSONArray dateJsonArr = new JSONArray(rangeList.size());
        for (DateTime dateTime : rangeList) {
            JSONObject date = new JSONObject();
            date.put("second", dateTime.second());
            date.put("minute", dateTime.minute());
            date.put("hour", dateTime.hour(true));
            date.put("amPm", dateTime.isAM() ? "AM" : "PM");
            date.put("secondOfDay", dateTime.second() + dateTime.minute() * 60 + dateTime.hour(true) * 3600);
            date.put("secondOfHour", dateTime.second() + dateTime.minute() * 60);
            date.put("secondOfMinuteInDay", dateTime.minute() + dateTime.hour(true) * 60);
            date.put("minuteOfDay", dateTime.minute() + dateTime.hour(true) * 60);
            date.put("timeCode", dateTime.toTimeStr());
            date.put("timeId", dateTime.toString(DatePattern.PURE_TIME_FORMAT));
            dateJsonArr.add(date);
        }
        spendTime = DateUtil.spendMs(preTime);
        log.info("translate to jsonArray cost time:{}ms", spendTime);
        log.info("rangeList size:{} ", dateJsonArr.size());
        log.info(dateJsonArr.getJSONObject(1).toStringPretty());
        return dateJsonArr;
    }

    public static void main(String[] args) {

        String startDate = "2019-01-01 00:00:00";
        String endDate = "1970-01-01 00:00:00";
//        generDate(startDate, endDate, DateField.DAY_OF_YEAR);
        generTime();

    }
}

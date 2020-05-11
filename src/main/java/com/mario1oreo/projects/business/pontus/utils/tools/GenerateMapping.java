package com.mario1oreo.projects.business.pontus.utils.tools;

import cn.hutool.core.io.FileUtil;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;

import java.util.List;
import java.util.Map;

public class GenerateMapping {


    public static void main(String[] args) {

        List<String> codeList = CreateBarCode.generBarCode("697285707", 0, 999);

        List<Map<String, Object>> content = ExcelUtil.getReader(FileUtil.file("D:\\data\\temp.xlsx"), 0).readAll();

        for (int i = 0; i < content.size(); i++) {
            content.get(i).put("barCode", codeList.get(i));
        }

        System.out.println("content = " + content.toString());

        ExcelWriter writer = ExcelUtil.getWriter("D:\\data\\tempResult.xlsx");
        writer.write(content, true);
        writer.close();

    }


}

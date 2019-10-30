package com.mario1oreo.projects.business.pontus.utils;

import cn.hutool.core.util.StrUtil;

public class StringTest {

    public static void main(String[] args) {

        String sourceCode = "productConfig";
        String result = StrUtil.toCamelCase(sourceCode);
        System.out.println("source = " + sourceCode);
        System.out.println("result = " + result);

        sourceCode = "PRODUCT_Config";
        result = StrUtil.toCamelCase(sourceCode);
        System.out.println("source = " + sourceCode);
        System.out.println("result = " + result);
    }
}

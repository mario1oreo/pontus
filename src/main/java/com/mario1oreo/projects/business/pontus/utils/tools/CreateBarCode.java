package com.mario1oreo.projects.business.pontus.utils.tools;

import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class CreateBarCode {

    public static List<String> generBarCode(String preCode, int startNum, int endNum) {
        //6972857070007
        String barCodePre = "697285707";
        String index;
        StringBuilder fullBarCode = new StringBuilder();
        char[] tmpCharArr;
        List<String> totalBarCode = new ArrayList<>();
        for (int i = startNum; i < endNum + 1; i++) {
            index = StrUtil.fillBefore(String.valueOf(i), '0', 3);
            log.info("index = " + index);
            fullBarCode.append(preCode).append(index);
            log.info("fullBarCode = " + fullBarCode.toString());
            tmpCharArr = fullBarCode.toString().toCharArray();
            int checkNum = 0;
            for (int j = 0; j < tmpCharArr.length; j++) {
                int single = Integer.valueOf(String.valueOf(tmpCharArr[j]));
                if (j % 2 == 1) {
                    single *= 3;
                }
                checkNum += single;
            }
            fullBarCode.append(checkNum % 10 == 0 ? 0 : 10 - checkNum % 10);
            log.info("fullBarCode with check = " + fullBarCode.toString());
            totalBarCode.add(fullBarCode.toString());
            fullBarCode.setLength(0);
        }
        log.info("totalBarCode = " + totalBarCode.toString());
        return totalBarCode;
    }

    public static void main(String[] args) {

    }
}

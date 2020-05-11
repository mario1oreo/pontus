package com.mario1oreo.projects.business.pontus.utils.tools;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.RandomUtil;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GenerateTools {


    /**
     * 生成增加商品的凭证编码
     *
     * @return 凭证id
     */
    public static String generateAddGoodsVoucherID() {
        String voucherID = generateVoucherID("ADDG");
        log.info("generateAddGoodsVoucherID:{}", voucherID);
        return voucherID;
    }

    /**
     * 生成销售商品的凭证编码
     *
     * @return 凭证id
     */
    public static String generateSaleGoodsVoucherID() {
        String voucherID = generateVoucherID("SALG");
        log.info("generateSaleGoodsVoucherID:{}", voucherID);
        return voucherID;
    }

    /**
     * 生成退货的凭证编码
     *
     * @return 凭证id
     */
    public static String generateReturnGoodsVoucherID() {
        String voucherID = generateVoucherID("RTNG");
        log.info("generateReturnGoodsVoucherID:{}", voucherID);
        return voucherID;
    }


    /**
     * 根据凭证类型生成对应的凭证编码
     *
     * @param voucherType 凭证类型
     * @return 凭证id
     */
    public static String generateVoucherID(String voucherType) {
        String voucherId = DateUtil.date().toString(DatePattern.PURE_DATETIME_PATTERN) +
                voucherType + RandomUtil.randomNumbers(8);
        return voucherId;
    }
}

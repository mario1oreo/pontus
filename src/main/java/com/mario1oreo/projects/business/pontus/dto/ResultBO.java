package com.mario1oreo.projects.business.pontus.dto;

import cn.hutool.json.JSONArray;
import lombok.Data;

/**
 * 前端交互数据业务BO
 */
@Data
public class ResultBO {
    /**
     * status : SUCCESS
     * message : 成功
     * data : {"dataSource":[],"page":1}
     */

    private String status;
    private String message;
    private DataBean data;

    public ResultBO() {
        this.status = "SUCCESS";
        this.message = "成功";
        this.data = new DataBean();
    }

    public ResultBO(boolean failure) {
        this.status = "FAILURE";
        this.message = "失败";
        this.data = new DataBean();
    }

    @Data
    public static class DataBean {
        /**
         * dataSource : []
         * page : 1
         */

        private int page;
        private JSONArray dataSource;

        public DataBean() {
            this.page = 0;
            this.dataSource = new JSONArray();
        }
    }
}

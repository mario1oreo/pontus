package com.mario1oreo.projects.business.pontus.dto;

import cn.hutool.core.util.StrUtil;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;


@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
public class BaseDTO {

    /**
     * 状态：0：正常   1：作废
     */
    protected String state;
    /**
     * 创建时间
     */
    protected java.time.LocalDateTime createTime;
    /**
     * 创建者
     */
    protected String createBy;
    /**
     * 更新时间
     */
    protected java.time.LocalDateTime updateTime;
    /**
     * 更新者
     */
    protected String updateBy;

    public String getState() {
        return StrUtil.isBlank(state) ? "0" : state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return StrUtil.isBlank(createBy) ? "systemDefault" : createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return StrUtil.isBlank(updateBy) ? "systemDefault" : updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
}

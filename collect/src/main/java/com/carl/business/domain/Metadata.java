package com.carl.business.domain;

import com.carl.collect.DataTypeEnum;
import com.carl.collect.SourceTypeEnum;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * 元数据domain
 *
 * @TableName t_data_center_metadata
 */

public class Metadata implements Serializable {
    /**
     *
     */
    private Long id;

    /**
     * 规则表主键id
     */
    private Long ruleId;

    /**
     * 指标英文标识
     */
    private String enName;

    /**
     *
     */
    private String cnName;

    /**
     * 指标是否默认展示 0:否 1:是
     */
    private Boolean defaultShow;

    /**
     * 是否存储当前指标，0:否 1:是
     */
    private Boolean storage;

    /**
     * 当前指标是否和维度有关，0:否 1:是
     */
    private Boolean dimension;

    /**
     * 当前指标是否和统计周期有关，0:否 1:是
     */
    private Boolean period;

    /**
     * 当前指标数据类型
     *
     * @see DataTypeEnum
     */
    private DataTypeEnum dataType;

    /**
     * 指标类型： 1：抽取类型 2：计算类型
     *
     * @see SourceTypeEnum
     */
    private SourceTypeEnum sourceType;

    /**
     * 生命周期规则id
     */
    private Long lifeCycleRuleId;

    /**
     * 追踪的UUID
     */
    private String traceId;

    /**
     * 数据安全信息字段id
     */
    private Integer dataSecurity;

    /**
     * 前端展示宽度
     */
    private Integer extraWidth;

    /**
     * 指标描述
     */
    private String description;

    /**
     * 排序字段
     */
    private Integer rank;

    /**
     * 基准值，用来做展示数据
     */
    private Integer baseValue;

    public Object getDefaultValue() {
        Object result = null;
        if (Objects.isNull(dataType)) {
            return result;
        }
        if (Objects.equals(dataType, DataTypeEnum.DATE) || Objects.equals(dataType, DataTypeEnum.TIMESTAMP)) {
            return new Date();
        }
        try {
            Class<?> javaType = dataType.getJavaType();
            //根据默认值初始化对象
            result = javaType.getDeclaredConstructor(String.class).newInstance(dataType.getDbFaultValue());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRuleId() {
        return ruleId;
    }

    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public Boolean getDefaultShow() {
        return defaultShow;
    }

    public void setDefaultShow(Boolean defaultShow) {
        this.defaultShow = defaultShow;
    }

    public Boolean getStorage() {
        return storage;
    }

    public void setStorage(Boolean storage) {
        this.storage = storage;
    }

    public Boolean getDimension() {
        return dimension;
    }

    public void setDimension(Boolean dimension) {
        this.dimension = dimension;
    }

    public Boolean getPeriod() {
        return period;
    }

    public void setPeriod(Boolean period) {
        this.period = period;
    }

    public DataTypeEnum getDataType() {
        return dataType;
    }

    public void setDataType(DataTypeEnum dataType) {
        this.dataType = dataType;
    }

    public SourceTypeEnum getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
    }

    public Long getLifeCycleRuleId() {
        return lifeCycleRuleId;
    }

    public void setLifeCycleRuleId(Long lifeCycleRuleId) {
        this.lifeCycleRuleId = lifeCycleRuleId;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public Integer getDataSecurity() {
        return dataSecurity;
    }

    public void setDataSecurity(Integer dataSecurity) {
        this.dataSecurity = dataSecurity;
    }

    public Integer getExtraWidth() {
        return extraWidth;
    }

    public void setExtraWidth(Integer extraWidth) {
        this.extraWidth = extraWidth;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getBaseValue() {
        return baseValue;
    }

    public void setBaseValue(Integer baseValue) {
        this.baseValue = baseValue;
    }

    @Override
    public String toString() {
        return "Metadata{" +
                "id=" + id +
                ", ruleId=" + ruleId +
                ", enName='" + enName + '\'' +
                ", cnName='" + cnName + '\'' +
                ", defaultShow=" + defaultShow +
                ", storage=" + storage +
                ", dimension=" + dimension +
                ", period=" + period +
                ", dataType=" + dataType +
                ", sourceType=" + sourceType +
                ", lifeCycleRuleId=" + lifeCycleRuleId +
                ", traceId='" + traceId + '\'' +
                ", dataSecurity=" + dataSecurity +
                ", extraWidth=" + extraWidth +
                ", description='" + description + '\'' +
                ", rank=" + rank +
                ", baseValue=" + baseValue +
                '}';
    }
}
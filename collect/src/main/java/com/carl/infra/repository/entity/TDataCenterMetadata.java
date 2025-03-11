package com.carl.infra.repository.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 数据中台元数据
 * @TableName t_data_center_metadata
 */
@TableName(value ="t_data_center_metadata")
public class TDataCenterMetadata implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
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
     */
    private String dataType;

    /**
     * 指标类型： 1：抽取类型 2：计算类型
     */
    private Integer sourceType;

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
    @TableField("`rank`")
    private Integer rank;

    /**
     * 基准值，用来做展示数据
     */
    private Integer baseValue;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date gmtCreate;

    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date gmtModified;

    /**
     * 状态 1：未删除 0：删除
     */
    private Integer status;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 规则表主键id
     */
    public Long getRuleId() {
        return ruleId;
    }

    /**
     * 规则表主键id
     */
    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * 指标英文标识
     */
    public String getEnName() {
        return enName;
    }

    /**
     * 指标英文标识
     */
    public void setEnName(String enName) {
        this.enName = enName;
    }

    /**
     * 
     */
    public String getCnName() {
        return cnName;
    }

    /**
     * 
     */
    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    /**
     * 指标是否默认展示 0:否 1:是
     */
    public Boolean getDefaultShow() {
        return defaultShow;
    }

    /**
     * 指标是否默认展示 0:否 1:是
     */
    public void setDefaultShow(Boolean defaultShow) {
        this.defaultShow = defaultShow;
    }

    /**
     * 是否存储当前指标，0:否 1:是
     */
    public Boolean getStorage() {
        return storage;
    }

    /**
     * 是否存储当前指标，0:否 1:是
     */
    public void setStorage(Boolean storage) {
        this.storage = storage;
    }

    /**
     * 当前指标是否和维度有关，0:否 1:是
     */
    public Boolean getDimension() {
        return dimension;
    }

    /**
     * 当前指标是否和维度有关，0:否 1:是
     */
    public void setDimension(Boolean dimension) {
        this.dimension = dimension;
    }

    /**
     * 当前指标是否和统计周期有关，0:否 1:是
     */
    public Boolean getPeriod() {
        return period;
    }

    /**
     * 当前指标是否和统计周期有关，0:否 1:是
     */
    public void setPeriod(Boolean period) {
        this.period = period;
    }

    /**
     * 当前指标数据类型
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * 当前指标数据类型
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * 指标类型： 1：抽取类型 2：计算类型
     */
    public Integer getSourceType() {
        return sourceType;
    }

    /**
     * 指标类型： 1：抽取类型 2：计算类型
     */
    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * 生命周期规则id
     */
    public Long getLifeCycleRuleId() {
        return lifeCycleRuleId;
    }

    /**
     * 生命周期规则id
     */
    public void setLifeCycleRuleId(Long lifeCycleRuleId) {
        this.lifeCycleRuleId = lifeCycleRuleId;
    }

    /**
     * 追踪的UUID
     */
    public String getTraceId() {
        return traceId;
    }

    /**
     * 追踪的UUID
     */
    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    /**
     * 数据安全信息字段id
     */
    public Integer getDataSecurity() {
        return dataSecurity;
    }

    /**
     * 数据安全信息字段id
     */
    public void setDataSecurity(Integer dataSecurity) {
        this.dataSecurity = dataSecurity;
    }

    /**
     * 前端展示宽度
     */
    public Integer getExtraWidth() {
        return extraWidth;
    }

    /**
     * 前端展示宽度
     */
    public void setExtraWidth(Integer extraWidth) {
        this.extraWidth = extraWidth;
    }

    /**
     * 指标描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 指标描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 排序字段
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * 排序字段
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * 基准值，用来做展示数据
     */
    public Integer getBaseValue() {
        return baseValue;
    }

    /**
     * 基准值，用来做展示数据
     */
    public void setBaseValue(Integer baseValue) {
        this.baseValue = baseValue;
    }

    /**
     * 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 更新时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 更新时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * 状态 1：未删除 0：删除
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态 1：未删除 0：删除
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TDataCenterMetadata other = (TDataCenterMetadata) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRuleId() == null ? other.getRuleId() == null : this.getRuleId().equals(other.getRuleId()))
            && (this.getEnName() == null ? other.getEnName() == null : this.getEnName().equals(other.getEnName()))
            && (this.getCnName() == null ? other.getCnName() == null : this.getCnName().equals(other.getCnName()))
            && (this.getDefaultShow() == null ? other.getDefaultShow() == null : this.getDefaultShow().equals(other.getDefaultShow()))
            && (this.getStorage() == null ? other.getStorage() == null : this.getStorage().equals(other.getStorage()))
            && (this.getDimension() == null ? other.getDimension() == null : this.getDimension().equals(other.getDimension()))
            && (this.getPeriod() == null ? other.getPeriod() == null : this.getPeriod().equals(other.getPeriod()))
            && (this.getDataType() == null ? other.getDataType() == null : this.getDataType().equals(other.getDataType()))
            && (this.getSourceType() == null ? other.getSourceType() == null : this.getSourceType().equals(other.getSourceType()))
            && (this.getLifeCycleRuleId() == null ? other.getLifeCycleRuleId() == null : this.getLifeCycleRuleId().equals(other.getLifeCycleRuleId()))
            && (this.getTraceId() == null ? other.getTraceId() == null : this.getTraceId().equals(other.getTraceId()))
            && (this.getDataSecurity() == null ? other.getDataSecurity() == null : this.getDataSecurity().equals(other.getDataSecurity()))
            && (this.getExtraWidth() == null ? other.getExtraWidth() == null : this.getExtraWidth().equals(other.getExtraWidth()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getRank() == null ? other.getRank() == null : this.getRank().equals(other.getRank()))
            && (this.getBaseValue() == null ? other.getBaseValue() == null : this.getBaseValue().equals(other.getBaseValue()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        result = prime * result + ((getEnName() == null) ? 0 : getEnName().hashCode());
        result = prime * result + ((getCnName() == null) ? 0 : getCnName().hashCode());
        result = prime * result + ((getDefaultShow() == null) ? 0 : getDefaultShow().hashCode());
        result = prime * result + ((getStorage() == null) ? 0 : getStorage().hashCode());
        result = prime * result + ((getDimension() == null) ? 0 : getDimension().hashCode());
        result = prime * result + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        result = prime * result + ((getDataType() == null) ? 0 : getDataType().hashCode());
        result = prime * result + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        result = prime * result + ((getLifeCycleRuleId() == null) ? 0 : getLifeCycleRuleId().hashCode());
        result = prime * result + ((getTraceId() == null) ? 0 : getTraceId().hashCode());
        result = prime * result + ((getDataSecurity() == null) ? 0 : getDataSecurity().hashCode());
        result = prime * result + ((getExtraWidth() == null) ? 0 : getExtraWidth().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getRank() == null) ? 0 : getRank().hashCode());
        result = prime * result + ((getBaseValue() == null) ? 0 : getBaseValue().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ruleId=").append(ruleId);
        sb.append(", enName=").append(enName);
        sb.append(", cnName=").append(cnName);
        sb.append(", defaultShow=").append(defaultShow);
        sb.append(", storage=").append(storage);
        sb.append(", dimension=").append(dimension);
        sb.append(", period=").append(period);
        sb.append(", dataType=").append(dataType);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", lifeCycleRuleId=").append(lifeCycleRuleId);
        sb.append(", traceId=").append(traceId);
        sb.append(", dataSecurity=").append(dataSecurity);
        sb.append(", extraWidth=").append(extraWidth);
        sb.append(", description=").append(description);
        sb.append(", rank=").append(rank);
        sb.append(", baseValue=").append(baseValue);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
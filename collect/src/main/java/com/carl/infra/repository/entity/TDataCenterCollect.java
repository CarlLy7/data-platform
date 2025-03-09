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
 * 数据采集表
 * @TableName t_data_center_collect
 */
@TableName(value ="t_data_center_collect")
public class TDataCenterCollect implements Serializable {
    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 规则主键id
     */
    private Long ruleId;

    /**
     * 指标英文标识
     */
    private String enName;

    /**
     * 数据源
     */
    private String dataSource;

    /**
     * 数据采集来源 1：sql采集 2：接口采集
     */
    private Integer collectWay;

    /**
     * 取决于数据采集来源，如果是sql采集则标识sql脚本，如果是接口采集则标识url
     */
    private String content;

    /**
     * 是否去重
     */
    private Boolean deduplicate;

    /**
     * 统计周期格式
     */
    private String periodFormat;

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
     * 主键id
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 规则主键id
     */
    public Long getRuleId() {
        return ruleId;
    }

    /**
     * 规则主键id
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
     * 数据源
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * 数据源
     */
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * 数据采集来源 1：sql采集 2：接口采集
     */
    public Integer getCollectWay() {
        return collectWay;
    }

    /**
     * 数据采集来源 1：sql采集 2：接口采集
     */
    public void setCollectWay(Integer collectWay) {
        this.collectWay = collectWay;
    }

    /**
     * 取决于数据采集来源，如果是sql采集则标识sql脚本，如果是接口采集则标识url
     */
    public String getContent() {
        return content;
    }

    /**
     * 取决于数据采集来源，如果是sql采集则标识sql脚本，如果是接口采集则标识url
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 是否去重
     */
    public Boolean getDeduplicate() {
        return deduplicate;
    }

    /**
     * 是否去重
     */
    public void setDeduplicate(Boolean deduplicate) {
        this.deduplicate = deduplicate;
    }

    /**
     * 统计周期格式
     */
    public String getPeriodFormat() {
        return periodFormat;
    }

    /**
     * 统计周期格式
     */
    public void setPeriodFormat(String periodFormat) {
        this.periodFormat = periodFormat;
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
        TDataCenterCollect other = (TDataCenterCollect) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRuleId() == null ? other.getRuleId() == null : this.getRuleId().equals(other.getRuleId()))
            && (this.getEnName() == null ? other.getEnName() == null : this.getEnName().equals(other.getEnName()))
            && (this.getDataSource() == null ? other.getDataSource() == null : this.getDataSource().equals(other.getDataSource()))
            && (this.getCollectWay() == null ? other.getCollectWay() == null : this.getCollectWay().equals(other.getCollectWay()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getDeduplicate() == null ? other.getDeduplicate() == null : this.getDeduplicate().equals(other.getDeduplicate()))
            && (this.getPeriodFormat() == null ? other.getPeriodFormat() == null : this.getPeriodFormat().equals(other.getPeriodFormat()))
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
        result = prime * result + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        result = prime * result + ((getCollectWay() == null) ? 0 : getCollectWay().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getDeduplicate() == null) ? 0 : getDeduplicate().hashCode());
        result = prime * result + ((getPeriodFormat() == null) ? 0 : getPeriodFormat().hashCode());
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
        sb.append(", dataSource=").append(dataSource);
        sb.append(", collectWay=").append(collectWay);
        sb.append(", content=").append(content);
        sb.append(", deduplicate=").append(deduplicate);
        sb.append(", periodFormat=").append(periodFormat);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
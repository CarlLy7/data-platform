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
 * 数据组织
 * @TableName t_data_center_organ
 */
@TableName(value ="t_data_center_organ")
public class TDataCenterOrgan implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 规则id
     */
    private Long ruleId;

    /**
     * 抽取方式，1：sql抽取 2：接口抽取
     */
    private Integer collectWay;

    /**
     * 抽取组织方式，如果collect_way=1则表示sql脚本，如果collect_way=2则表示url
     */
    private String content;

    /**
     * 数据抽取组织数据源
     */
    private String dataSource;

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
     * 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 规则id
     */
    public Long getRuleId() {
        return ruleId;
    }

    /**
     * 规则id
     */
    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * 抽取方式，1：sql抽取 2：接口抽取
     */
    public Integer getCollectWay() {
        return collectWay;
    }

    /**
     * 抽取方式，1：sql抽取 2：接口抽取
     */
    public void setCollectWay(Integer collectWay) {
        this.collectWay = collectWay;
    }

    /**
     * 抽取组织方式，如果collect_way=1则表示sql脚本，如果collect_way=2则表示url
     */
    public String getContent() {
        return content;
    }

    /**
     * 抽取组织方式，如果collect_way=1则表示sql脚本，如果collect_way=2则表示url
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 数据抽取组织数据源
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * 数据抽取组织数据源
     */
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
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
        TDataCenterOrgan other = (TDataCenterOrgan) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRuleId() == null ? other.getRuleId() == null : this.getRuleId().equals(other.getRuleId()))
            && (this.getCollectWay() == null ? other.getCollectWay() == null : this.getCollectWay().equals(other.getCollectWay()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getDataSource() == null ? other.getDataSource() == null : this.getDataSource().equals(other.getDataSource()))
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
        result = prime * result + ((getCollectWay() == null) ? 0 : getCollectWay().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
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
        sb.append(", collectWay=").append(collectWay);
        sb.append(", content=").append(content);
        sb.append(", dataSource=").append(dataSource);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
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
 * 计算规则表
 * @TableName t_data_center_calculate
 */
@TableName(value ="t_data_center_calculate")
public class TDataCenterCalculate implements Serializable {
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
     * 指标英文标识
     */
    private String enName;

    /**
     * 指标计算时的参数，可以指定多个指标，中间用逗号隔开
     */
    private String parameters;

    /**
     * 函数，有几个内置函数：1：sum相加 2：deduction相减 3:multiplty相乘 4:ratio相除 5：avg求平均数
     */
    private String func;

    /**
     * 计算表达式
     */
    private String expression;

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
     * 指标计算时的参数，可以指定多个指标，中间用逗号隔开
     */
    public String getParameters() {
        return parameters;
    }

    /**
     * 指标计算时的参数，可以指定多个指标，中间用逗号隔开
     */
    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    /**
     * 函数，有几个内置函数：1：sum相加 2：deduction相减 3:multiplty相乘 4:ratio相除 5：avg求平均数
     */
    public String getFunc() {
        return func;
    }

    /**
     * 函数，有几个内置函数：1：sum相加 2：deduction相减 3:multiplty相乘 4:ratio相除 5：avg求平均数
     */
    public void setFunc(String func) {
        this.func = func;
    }

    /**
     * 计算表达式
     */
    public String getExpression() {
        return expression;
    }

    /**
     * 计算表达式
     */
    public void setExpression(String expression) {
        this.expression = expression;
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
        TDataCenterCalculate other = (TDataCenterCalculate) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRuleId() == null ? other.getRuleId() == null : this.getRuleId().equals(other.getRuleId()))
            && (this.getEnName() == null ? other.getEnName() == null : this.getEnName().equals(other.getEnName()))
            && (this.getParameters() == null ? other.getParameters() == null : this.getParameters().equals(other.getParameters()))
            && (this.getFunc() == null ? other.getFunc() == null : this.getFunc().equals(other.getFunc()))
            && (this.getExpression() == null ? other.getExpression() == null : this.getExpression().equals(other.getExpression()))
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
        result = prime * result + ((getParameters() == null) ? 0 : getParameters().hashCode());
        result = prime * result + ((getFunc() == null) ? 0 : getFunc().hashCode());
        result = prime * result + ((getExpression() == null) ? 0 : getExpression().hashCode());
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
        sb.append(", parameters=").append(parameters);
        sb.append(", func=").append(func);
        sb.append(", expression=").append(expression);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
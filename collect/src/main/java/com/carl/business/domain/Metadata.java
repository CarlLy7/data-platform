package com.carl.business.domain;

import com.carl.collect.DataTypeEnum;
import com.carl.collect.SourceTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * 元数据domain
 *
 * @TableName t_data_center_metadata
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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

}
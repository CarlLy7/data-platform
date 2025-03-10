package com.carl.business.domain;

import com.carl.collect.FunctionEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 数据计算domain
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calculate implements Serializable {
    /**
     * 主键
     */
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
    private List<String> parameters;

    /**
     * 函数，有几个内置函数：1：sum相加 2：deduction相减 3:multiplty相乘 4:ratio相除 5：avg求平均数
     * @see FunctionEnum
     */
    private FunctionEnum func;

    /**
     * 计算表达式
     */
    private String expression;

}
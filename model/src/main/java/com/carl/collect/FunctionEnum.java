package com.carl.collect;/**
 * @description:
 * @author: carl
 * @createDate: 2025-03-09 20:54
 * @version: 1.0
 */

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @description: 内置计算函数枚举类
 * @author: carl
 * @createDate: 2025-03-09 20:54
 * @version: 1.0
 */
@AllArgsConstructor
@Getter
public enum FunctionEnum {
    SUM("SUM","+",Integer.MAX_VALUE,"相加"),
    DEDUCTION("DEDUCTION","-",Integer.MAX_VALUE,"相减"),
    MULTIPLTY("MULTIPLTY","*",Integer.MAX_VALUE,"相乘"),
    RATIO("RATIO","/",Integer.MAX_VALUE,"相除"),
    AVG("AVG","/count",Integer.MAX_VALUE,"求平均值");
    private static final Map<String,FunctionEnum> funcNameMap= Arrays.asList(values())
            .stream().collect(Collectors.toMap(FunctionEnum::getFuncName,v->v));
    /**
     * 函数名字
     */
    private String funcName;

    /**
     * 符号
     */
    private String symbol;

    /**
     * 允许的最大参数个数
     */
    private int paramsCount;

    /**
     * 描述
     */
    private String desc;

    public static FunctionEnum parse(String funcName){
        return funcNameMap.get(funcName);
    }
}

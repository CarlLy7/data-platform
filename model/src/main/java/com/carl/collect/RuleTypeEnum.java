package com.carl.collect;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @description: 规则类型枚举
 * @author: carl
 * @createDate: 2025-03-09 21:55
 * @version: 1.0
 */
@AllArgsConstructor
@Getter
public enum RuleTypeEnum {
    COLLECT("1", "采集规则"),
    QUERY("2", "查询规则");

    private static final Map<String, RuleTypeEnum> valueMap = Arrays.asList(values())
            .stream().collect(Collectors.toMap(RuleTypeEnum::getValue, v -> v));

    private String value;
    private String desc;

    public static RuleTypeEnum parse(String value) {
        return valueMap.get(value);
    }


}

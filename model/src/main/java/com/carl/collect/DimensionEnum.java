package com.carl.collect;/**
 * @description:
 * @author: carl
 * @createDate: 2025-03-09 21:55
 * @version: 1.0
 */

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @description: 维度枚举
 * @author: carl
 * @createDate: 2025-03-09 21:55
 * @version: 1.0
 */
@AllArgsConstructor
@Getter
public enum DimensionEnum {
    USER("USER", "用户"),
    GROUP("GROUP", "群组"),
    SCHOOL("SCHOOL", "学校");

    private static final Map<String, DimensionEnum> valueMap = Arrays.asList(values())
            .stream().collect(Collectors.toMap(DimensionEnum::getValue, v -> v));

    private String value;
    private String desc;

    public static DimensionEnum parse(String dimension) {
        return valueMap.get(dimension);
    }

    /**
     * 根据当前维度获取下一个维度
     *
     * @return
     */
    public DimensionEnum nextDimension() {
        return switch (this) {
            case USER -> GROUP;
            case GROUP -> SCHOOL;
            case SCHOOL -> null;
        };
    }
}

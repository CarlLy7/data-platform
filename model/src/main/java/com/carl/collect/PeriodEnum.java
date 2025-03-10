package com.carl.collect;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 统计周期枚举
 *
 * @author: carl
 * @date: 2025.03.10
 */
@AllArgsConstructor
@Getter
public enum PeriodEnum {
    CUSTOM("CUSTOM", 1, "自定义"),
    DAY("DAY", 2, "日"),
    WEEK("WEEK", 3, "周"),
    MONTH("MONTH", 4, "月"),
    SEMESTER("SEMESTER", 5, "学期"),
    SCHOOL_YEAR("SCHOOL_YEAR", 6, "学年");
    private static final Map<String, PeriodEnum> nameMap = Arrays.asList(values())
            .stream().collect(Collectors.toMap(PeriodEnum::getName, v -> v));

    private static final Map<Integer, PeriodEnum> typeMap = Arrays.asList(values())
            .stream().collect(Collectors.toMap(PeriodEnum::getType, v -> v));

    /**
     * 名称
     */
    private String name;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 描述
     */
    private String desc;

    public static PeriodEnum parseByName(String name) {
        return nameMap.get(name);
    }

    public static PeriodEnum parseByType(Integer type) {
        return typeMap.get(type);
    }

    /**
     * 获取下一个统计周期
     * @return
     */
    public PeriodEnum nextPeriod() {
        switch (this) {
            case DAY -> {
                return WEEK;
            }
            case WEEK -> {
                return MONTH;
            }
            case MONTH -> {
                return SEMESTER;
            }
            case SEMESTER -> {
                return SCHOOL_YEAR;
            }
            default -> {
                return null;
            }
        }
    }
}

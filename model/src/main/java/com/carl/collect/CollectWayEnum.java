package com.carl.collect;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @description: 数据采集方式枚举类
 * @author: carl
 * @createDate: 2025-03-09 20:37
 * @version: 1.0
 */
@AllArgsConstructor
@Getter
public enum CollectWayEnum {
    SQL(1, "sql采集"),
    INTERFACE(2, "接口采集");
    private static final Map<Integer, CollectWayEnum> valueMap = Arrays.asList(values())
            .stream().collect(Collectors.toMap(CollectWayEnum::getValue, v -> v));
    private Integer value;
    private String desc;

    public static CollectWayEnum parse(Integer value){
        return valueMap.get(value);
    }

}

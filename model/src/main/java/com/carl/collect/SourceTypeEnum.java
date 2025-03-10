package com.carl.collect;
/**
 * @description:
 * @author: carl
 * @createDate: 2025-03-09 20:37
 * @version: 1.0
 */

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @description: 指标类型
 * @author: carl
 * @createDate: 2025-03-09 20:37
 * @version: 1.0
 */
@AllArgsConstructor
@Getter
public enum SourceTypeEnum {
    EXTRACT(1, "抽取类型"),
    CALCULATE(2, "计算类型");
    private static final Map<Integer, SourceTypeEnum> valueMap = Arrays.asList(values())
            .stream().collect(Collectors.toMap(SourceTypeEnum::getValue, v -> v));
    private Integer value;
    private String desc;

    public static SourceTypeEnum parse(Integer value){
        return valueMap.get(value);
    }

}

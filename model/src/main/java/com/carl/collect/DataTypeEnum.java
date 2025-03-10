package com.carl.collect;
/**
 * @description:
 * @author: carl
 * @createDate: 2025-03-09 21:23
 * @version: 1.0
 */

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @description: 数据类型枚举
 * @author: carl
 * @createDate: 2025-03-09 21:23
 * @version: 1.0
 */
@AllArgsConstructor
@Getter
public enum DataTypeEnum {
    BYTE("BYTE", "tinyint(4)", Byte.class, "0", "字节类型"),
    SHORT("SHORT", "smallint(6)", Short.class, "0", "短整型类型"),
    INTEGER("INTEGER", "int(11)", Integer.class, "0", "整型类型"),
    LONG("LONG", "bigint(20)", Long.class, "0", "长整型类型"),
    FLOAT("FLOAT", "float", Float.class, "0.0", "浮点型类型"),
    DOUBLE("DOUBLE", "double", Double.class, "0.0", "双精度浮点类型"),
    BOOLEAN("BOOLEAN", "bit(1)", Boolean.class, "0", "布尔类型"),
    STRING("STRING", "varchar(64)", String.class, "", "字符串类型"),
    TEXT("TEXT", "text", String.class, "", "长文本类型"),
    DATE("DATE", "datetime", Date.class, "CURRENT_TIMESTAMP", "日期类型"),
    TIMESTAMP("TIMESTAMP", "timestamp", Timestamp.class, "CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP", "时间戳类型");

    private static final Map<String,DataTypeEnum> javaStrMap= Arrays.asList(values())
            .stream().collect(Collectors.toMap(DataTypeEnum::getJavaStrType,v->v));

    private static final Map<String,DataTypeEnum> coloumTypeMap= Arrays.asList(values())
            .stream().collect(Collectors.toMap(DataTypeEnum::getColoumType,v->v));
    private String javaStrType;
    private String coloumType;

    private Class<?> javaType;

    private String dbFaultValue;

    private String desc;

    public static DataTypeEnum parseByJavaStrType(String javaStrType){
        return javaStrMap.get(javaStrType);
    }

    public static DataTypeEnum parseByColumnType(String coloumType){
        return coloumTypeMap.get(coloumType);
    }
}

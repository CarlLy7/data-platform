package com.carl.dynamic;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @description: 动态数据源注解:支持添加在类上、方法上、接口上
 * @author: carl
 * @createDate: 2025-03-11 21:16
 * @version: 1.0
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DynamicDataSource {
    /**
     * 数据库名称
     * @return
     */
    String db() default "";

}

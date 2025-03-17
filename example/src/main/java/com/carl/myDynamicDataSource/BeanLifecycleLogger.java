package com.carl.myDynamicDataSource;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: carl
 * @createDate: 2025-03-17 22:10
 * @Since: 1.0
 */
@Component
public class BeanLifecycleLogger implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("Before初始化: " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("After初始化: " + beanName);
        return bean;
    }
}

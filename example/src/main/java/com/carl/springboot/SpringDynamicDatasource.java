package com.carl.springboot;

import com.carl.dynamic.Context;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import java.util.Map;

/**
 * @description: spirngboot动态数据源，需要继承AbstractRoutingDataSource，其实此时SpringDynamicDatasource已经变成了一个数据源
 * @author: carl
 * @createDate: 2025-03-12 22:26
 * @version: 1.0
 */
public class SpringDynamicDatasource extends AbstractRoutingDataSource {

    //所有的数据源
    private Map<Object, Object> targetDataSources;

    /**
     * 构造函数，初始化所有支持的数据源
     * @param targetDataSources
     */
    public SpringDynamicDatasource(Map<Object, Object> targetDataSources){
        super.setTargetDataSources(targetDataSources);
    }

    /**
     * 探测当前使用哪个数据源，借助于ThreadLocal实现
     * @return
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return Context.getDb();
    }
}

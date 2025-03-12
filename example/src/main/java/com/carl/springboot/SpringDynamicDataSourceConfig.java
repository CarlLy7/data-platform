package com.carl.springboot;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: springboot动态数据源配置
 * @author: carl
 * @createDate: 2025-03-12 22:29
 * @version: 1.0
 */
@Configuration
public class SpringDynamicDataSourceConfig {
    /**
     * 加载test_user数据源
     * @return
     */
    @Bean
    public DataSource userDataSource(){
        return DataSourceBuilder.create().driverClassName("com.mysql.cj.jdbc.Driver")
                .url("jdbc:mysql://localhost:3306/test_user?serverTimezone=GMT%2B8&useSSL=false")
                .username("root")
                .password("123456").build();
    }

    /**
     * 加载test_order数据源
     * @return
     */
    @Bean
    public DataSource orderDataSource(){
        return DataSourceBuilder.create().driverClassName("com.mysql.cj.jdbc.Driver")
                .url("jdbc:mysql://localhost:3306/test_order?serverTimezone=GMT%2B8&useSSL=false")
                .username("root")
                .password("123456").build();
    }

    /**
     * 将上面的两个数据源放到目标数据源中，因为SpringDynamicDatasource已经是一个数据源了，所以作为主数据源来进行mybatis的自动装配
     * @return
     */
    @Bean
    @Primary
    public SpringDynamicDatasource springDynamicDatasource(){
        Map<Object, Object> targetDataSources=new HashMap<>();
        targetDataSources.put("test_user",userDataSource());
        targetDataSources.put("test_order",orderDataSource());
        return new SpringDynamicDatasource(targetDataSources);
    }
}

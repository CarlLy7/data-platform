package com.carl;

import com.carl.dynamic.Context;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @description: spring boot 动态数据源单元测试
 * @author: carl
 * @createDate: 2025-03-12 22:34
 * @version: 1.0
 */
@SpringBootTest
public class SpringDynamicDataSourceTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testUserList(){
        Context.setDb("test_user");
        List result = jdbcTemplate.queryForList("select * from t_user");
        for (Object o : result) {
            System.out.println(o);
        }
    }

    @Test
    public void testOrderList(){
        Context.setDb("test_order");
        List result = jdbcTemplate.queryForList("select * from t_order");
        for (Object o : result) {
            System.out.println(o);
        }
    }
}

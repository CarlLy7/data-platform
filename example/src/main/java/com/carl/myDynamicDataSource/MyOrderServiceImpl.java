package com.carl.myDynamicDataSource;

import com.carl.dynamicDataSource.annotation.DDS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: carl
 * @createDate: 2025-03-16 21:29
 * @Since: 1.0
 */
@Service
public class MyOrderServiceImpl implements MyOrderService{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    @DDS(value = "test_order")
    public void addOrder(String userName) {
        jdbcTemplate.update("insert into t_order(name) values(?)",userName);
    }

    @Override
    @DDS(value = "test_order")
    public void listUser() {
        List list = jdbcTemplate.queryForList("select * from t_order");
        for (Object o : list) {
            System.out.println(o);
        }
    }
}

package com.carl.myDynamicDataSource;

import com.carl.dynamicDataSource.annotation.DDS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: carl
 * @createDate: 2025-03-16 20:56
 * @Since: 1.0
 */
@Service
@DDS("test_user")
public class MyUserServiceImpl implements MyUserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void addUser(String userName) {
        jdbcTemplate.update("insert into t_user(name) values(?)",userName);
    }

    @Override
    public void listUser() {
        List list = jdbcTemplate.queryForList("select * from t_user");
        for (Object o : list) {
            System.out.println(o);
        }
    }
}

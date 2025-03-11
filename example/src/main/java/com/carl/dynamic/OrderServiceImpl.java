package com.carl.dynamic;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: carl
 * @createDate: 2025-03-11 21:35
 * @version: 1.0
 */
@Service
@DS("test_order")
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>  implements OrderService{
    @Override
//    @DynamicDataSource(db = "test_order")
    public void addOrder(String orderName) {
//        JdbcUtil.executeSql("insert into t_order(name) values(?)",orderName);
        Order order = new Order();
        order.setName(orderName);
        save(order);
    }
}

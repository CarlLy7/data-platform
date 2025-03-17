package com.carl.myDynamicDataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @description:
 * @author: carl
 * @createDate: 2025-03-16 20:59
 * @Since: 1.0
 */
@SpringBootTest
public class MyDynamicDataSourceTest {
    @Autowired
    private MyUserService myUserService;

    @Autowired
    private MyOrderService myOrderService;

    @Test
    public void testAdd(){
        myUserService.addUser("carl2131232");
    }

    @Test
    public void testList(){
        myUserService.listUser();
    }

    @Test
    public void testOrderAdd(){
        myOrderService.addOrder("carl222");
    }

    @Test
    public void testOrderList(){
        myOrderService.listUser();
    }
}

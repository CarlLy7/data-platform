package com.carl;

import com.carl.dynamic.OrderService;
import com.carl.dynamic.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Unit test for simple App.
 */
@SpringBootTest(classes = App.class)
public class AppTest {
    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;

    @Test
    public void testSave() {
       userService.addUser("carl and missxx");
    }
    @Test
    public void testOrderSave() {
        orderService.addOrder("carl and missxx order");
    }
}

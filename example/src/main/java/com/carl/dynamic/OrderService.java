package com.carl.dynamic;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @description:
 * @author: carl
 * @createDate: 2025-03-11 21:35
 * @version: 1.0
 */
public interface OrderService extends IService<Order> {
    void addOrder(String orderName);
}

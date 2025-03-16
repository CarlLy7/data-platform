//package com.carl.dynamic;
//
//import java.lang.reflect.Proxy;
//
///**
// * @description:
// * @author: carl
// * @createDate: 2025-03-11 21:36
// * @version: 1.0
// */
//public class Solution {
//    public static void main(String[] args) {
//        UserServiceImpl userService = new UserServiceImpl();
//        /**
//         * 使用Java的动态代理创建一个代理实例，然后调用自定义的调用处理器，将db放入到线程上下文中
//         */
//        UserService target = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),
//                userService.getClass().getInterfaces(),
//                new ProxyHandler(userService));
//        target.addUser("carl3");
//
////        OrderServiceImpl orderServiceImpl = new OrderServiceImpl();
////        OrderService target = (OrderService) Proxy.newProxyInstance(orderServiceImpl.getClass().getClassLoader(),
////                orderServiceImpl.getClass().getInterfaces(),
////                new ProxyHandler(orderServiceImpl));
////        target.addOrder("buy BBA");
//    }
//}

//package com.carl.dynamic;
//
//import java.lang.reflect.InvocationHandler;
//import java.lang.reflect.Method;
//
///**
// * @description: 代理类处理器
// * @author: carl
// * @createDate: 2025-03-11 21:25
// * @version: 1.0
// */
//public class ProxyHandler implements InvocationHandler {
//    //代理对象
//    private Object target;
//
//    public ProxyHandler(Object target){
//        this.target=target;
//    }
//
//    @Override
//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        DynamicDataSource annotation = method.getAnnotation(DynamicDataSource.class);
//        if (annotation==null){
//            annotation=target.getClass().getDeclaredMethod(method.getName(),method.getParameterTypes()).getAnnotation(DynamicDataSource.class);
//        }
//        if (annotation==null){
//            annotation=target.getClass().getAnnotation(DynamicDataSource.class);
//        }
//        String db = annotation.db();
//        //将注解中的db设置到ThreadLocal中
//        Context.setDb(db);
//        return method.invoke(target, args);
//    }
//}

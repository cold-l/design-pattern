package com.design.proxy.invoke;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author lvz
 * @date 2021/7/7
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object object;

    public DynamicProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行代理----");
        return method.invoke(object, args);
    }
}

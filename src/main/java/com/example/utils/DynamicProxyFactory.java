package com.example.utils;

import com.example.annotations.Selector;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyFactory {

    @SuppressWarnings("unchecked")
    public static <T> T createPage(Class<T> clazz) {
        return (T) Proxy.newProxyInstance(
                clazz.getClassLoader(),
                new Class[]{clazz},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Selector selector = method.getAnnotation(Selector.class);
                        if (selector != null) {
                            return selector.xpath();
                        }
                        throw new UnsupportedOperationException("Method not annotated with @Selector");
                    }
                }
        );
    }
}
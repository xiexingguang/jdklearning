package com.xxg.designpattern.dynamicProxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by ecuser on 2015/12/15.
 */
public class CglibDynamicProxy implements MethodInterceptor {

    private static CglibDynamicProxy cglibDynamicProxy = new CglibDynamicProxy();

    private CglibDynamicProxy() {

    }

    public static CglibDynamicProxy getInstance() {
        return cglibDynamicProxy;
    }

    public <T> T getProxy(Class<T> CLS) {
        return  (T)Enhancer.create(CLS, this);
    }

    /**
     *
     * @param o  代理对象
     * @param method 目标对象方法
     * @param objects 对象方法参数
     * @param methodProxy 目标对象方法代理方法
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        before();
        Object result = methodProxy.invokeSuper(o, objects);
        after();
        return result;
    }

    public void before() {
        System.out.println("before ");
    }

    public void after() {
        System.out.println("after..");
    }
}

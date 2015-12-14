package com.xxg.designpattern.dynamicProxy;

import java.lang.reflect.*;

/**
 * Created by ecuser on 2015/12/14.
 */
public class ProxyGenerate {


    public static Object createProxy() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 生成代理类 class
        Class<?> proxy_class = Proxy.getProxyClass(ProxyGenerate.class.getClassLoader(), new Class[]{TargetInterface.class});

        //代理类构造函数
        Constructor constructor = proxy_class.getConstructor(new Class[]{InvocationHandler.class});

        //生成代理实例对象
        Object obect = constructor.newInstance(new InvocationHandler() {
            Target target = new Target();  //目标对象
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("proxy ...");
                System.out.println("method name===>" + method.getName());
                method.invoke(target, null);
                return null;
            }
        });

        return obect;

    }

    public static Object createProxy1() throws  Exception {
            Object object = Proxy.newProxyInstance(ProxyGenerate.class.getClassLoader(), new Class[]{TargetInterface.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("proxy 2...");
                return null;
            }
        });
        return object;
    }


    public static void main(String[] args) throws Exception {
        TargetInterface proxy = (TargetInterface) ProxyGenerate.createProxy();
        TargetInterface proxy1 = (TargetInterface) ProxyGenerate.createProxy1();
        proxy.add();
        proxy1.add();
        System.out.println( proxy.find());
    }

}

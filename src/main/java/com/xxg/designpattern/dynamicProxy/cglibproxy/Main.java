package com.xxg.designpattern.dynamicProxy.cglibproxy;

/**
 * Created by ecuser on 2015/12/15.
 */
public class Main {

    public static void main(String[] args) {
        Target target = CglibDynamicProxy.getInstance().getProxy(Target.class);
        target.sayHello();
    }
}

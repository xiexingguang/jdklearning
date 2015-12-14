package com.xxg.validate;

/**
 * Created by ecuser on 2015/12/14.
 */
public class Main {

    public static void main(String[] args) {
        //验证 isAssignableFrom 方法
        System.out.println(ProxyInterface.class.isAssignableFrom(ProxyImpl.class));
        System.out.println(SuperMan.class.isAssignableFrom(ChildrenMan.class));
    }
}

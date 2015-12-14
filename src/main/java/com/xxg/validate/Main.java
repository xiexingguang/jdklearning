package com.xxg.validate;

/**
 * Created by ecuser on 2015/12/14.
 */
public class Main {

    public static void main(String[] args) {
        //验证 isAssignableFrom 方法，该方法判断的是class 的类型， 接口和接口实现类的class.isAssignableFrom 为true,还有子类和父类也是为ture
        System.out.println(ProxyInterface.class.isAssignableFrom(ProxyImpl.class));
        System.out.println(SuperMan.class.isAssignableFrom(ChildrenMan.class));
    }
}

package com.xxg.jdk.classloader;

/**
 * Created by ecuser on 2015/12/14.
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class classs =   classLoader.loadClass("java.lang.String");
        System.out.println(classs.getClasses());
        System.out.println(classLoader.getParent().getParent());
        System.out.println(classLoader.getParent());
        System.out.println(classLoader);
        System.out.println(ClassLoader.getSystemClassLoader());
    }
}

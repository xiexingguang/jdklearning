package com.xxg.jdk.reflect;

import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by ecuser on 2015/12/15.
 */
public class ClassInfo {


    public void add(int age, String name, List list) {

    }



    public static void main(String[] args) throws NoSuchMethodException {
        Class classes =ClassInfo.class;
        Method[] methods = classes.getMethods();
        for (Method m : methods) {
            if (m.getName().equals("add")) {
                Class[] types = m.getParameterTypes();

                for (Class c : types) {
                    System.out.println(c.getName());
                }
            }
        }
    }

}

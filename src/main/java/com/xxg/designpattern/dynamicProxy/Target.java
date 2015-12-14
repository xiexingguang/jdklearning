package com.xxg.designpattern.dynamicProxy;

/**
 * Created by ecuser on 2015/12/14.
 */
public class Target  implements  TargetInterface{


    public void add() {
        System.out.println(" target add");
    }

    @Override
    public void delete() {
        System.out.println("target delete");
    }

    @Override
    public void update() {
        System.out.println("target update");
    }

    @Override
    public int find() {
        return 0;
    }

}

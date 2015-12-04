package com.xxg.juava.StringOperation;

import com.google.common.base.Preconditions;

/**
 * Created by ecuser on 2015/12/4.
 */
public class CheckCondition {

    public static void main(String[] args) {
        String name = "xxg";
        System.out.println(Preconditions.checkNotNull(name, "is null"));
    }
}

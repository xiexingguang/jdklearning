package com.xxg.juava.StringOperation;

import com.google.common.base.Optional;

/**
 * Created by ecuser on 2015/12/4.
 */
public class TestOptaional {

    public static void main(String[] args) {
        Optional<Integer> possible=Optional.of(6);
        if(possible.isPresent()){
            System.out.println("possible isPresent:"+possible.isPresent());
            System.out.println("possible value:"+possible.get());
        }

}


}

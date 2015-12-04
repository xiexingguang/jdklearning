package com.xxg.juava.collection;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

/**
 * Created by ecuser on 2015/12/4.
 */
public class MultiMapTest {

    public static void main(String[] args) {

        // map ，一个key可以多个value
        Multimap<String, String> student = ArrayListMultimap.create();
        student.put("xxg", "13045875439");
        student.put("xxg", "0743898989");
        student.put("xxg", "13909098980");
        student.put("zst", "41354131");
        student.put("ypp","loveing..");

        System.out.println(student.size());
        System.out.println(student.get("xxg").size());


    }
}

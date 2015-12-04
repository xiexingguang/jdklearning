package com.xxg.juava.StringOperation;

import com.google.common.base.Objects;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;

import java.util.Iterator;

/**
 * Created by ecuser on 2015/12/4.
 */
public class StringSplit {

    public static void main(String[] args) {

        //字符串操作
        Iterable<String>  s = Splitter.on(',').split("ONE,TOW,THREE");  //字符串分隔操作
        Iterator iterator = s.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

       // jude string is null or not

        String test1 = "hello,world";
        String test2 = "";
        System.out.println(Strings.isNullOrEmpty(test1));
        System.out.println(Strings.isNullOrEmpty(test2));



        // print  object with beautiful stirng matter

        Demon d = new Demon();
        d.setAddress("湖南衡阳市");
        d.setAge(24);
        d.setClassName("32班");
        d.setName("jasshine");

        System.out.println(Objects.toStringHelper(d.getClass()).add("name",d.getName()).add("age",d.getAge()).add("className",d.getClassName())); //result: Demon{name=jasshine, age=24, className=32班}
       //result: Demon{name=jasshine, age=24, className=32班}




    }
}

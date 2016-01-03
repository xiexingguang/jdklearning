package com.xxg.jdk.Annotation;

import java.lang.annotation.Annotation;

/**
 * Created by ecuser on 2015/12/22.
 */
public class Main {

    private String xx;
    private String xx2;

   /* public void test(@Annotation1 String xx,  @Annotation2 String xx2) {

        this.xx = xx;
        this.xx2 = xx2;
    }*/


    public static void main(String[] args) {

        Class cls = DemonClass.class;
        Annotation[] annotations = cls.getAnnotations();
        for(Annotation annotation : annotations){

            if(annotation instanceof MyAnnotation){
               MyAnnotation myAnnotation = (MyAnnotation) annotation;

                System.out.println("name: " + myAnnotation.name());

                System.out.println("value: " + myAnnotation.value());

            }

        }




    }


}

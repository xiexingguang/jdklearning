package com.xxg.jdk;

import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;

/**
 * Created by ecuser on 2015/12/14.
 */
public class GenericParamterType<T> {

    public static void main(String[] args) throws IOException {
        Enumeration<URL> urls = Thread.currentThread().getContextClassLoader().getResources("com/xxg/jdk/GenericParamterType.class");
        while (urls.hasMoreElements()) {
            URL url = urls.nextElement();
            System.out.println(url.getPath());
            String filePath = URLDecoder.decode(url.getPath(), "UTF-8");
            System.out.println("decode filepath==="+filePath);
            System.out.println(url.getProtocol());
        }


    }

}

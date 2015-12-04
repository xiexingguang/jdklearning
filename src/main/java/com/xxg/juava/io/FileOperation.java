package com.xxg.juava.io;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

/**
 * Created by ecuser on 2015/12/4.
 */
public class FileOperation {

    public static void main(String[] args) throws IOException {
        File from = new File("d://xiexingguang_s76");
        File to = new File("e://blog//1.txt");

        //ZL16-001-ldap服务基本介绍篇01.wmv
        File from1 = new File("D://学习视频//高级//中高级下//16//ZL16-001-ldap服务基本介绍篇01.wmv");
        //复制文件
        Files.copy(from1,to);
    }

}

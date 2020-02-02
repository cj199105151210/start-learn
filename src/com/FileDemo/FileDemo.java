package com.FileDemo;

import java.io.File;

public class FileDemo {
    /**
     *
     *  java.io.file  ==>  java.object
     *  一、File类和路径分隔符
     *      1、Fil类是IO包中用来表示磁盘文件和磁盘目录对象的路径；既可以表示文件，也可以表示文件夹
     *      该类包含了创建、删除文件、重命名文件，判断文件读写权限以及文件是否存在，查询等功能方法，
     *      只能设置和获取文件本身的信息，不能设置和获取文件的内容
     *      2、
     *          windows 分隔符是以  "\" 来表示,默认情况下是不区分大小写的；
     *          liunx  分隔符严格区分大小写，是以 "/"来表示
     *       3、路径分隔符，属性分隔符
     *          unix: 使用 "/" 来分割目录路径
     *          windows: 使用"\" 来分割目录路径  E:\movie\IQIYI Video\GeePlayer; 使用 : (冒号)来分割属性
     *                   但是在Java中一个 "\" 来表示转义，在windows 平台的Java代码中表示一个路径，就得使用两个 "\\",
     *                   但是windows 支持 /  ；使用 ；(分号)来分割属性，例如在环境变量中使用
     *
     *
     *
     *
     *
     */


    public static void main(String[] args){
        /**
         * 这两个方法都是用来获取属性分隔符的，打印出来的结果都是分号
         */
        String ss = File.pathSeparator;
        char cc = File.pathSeparatorChar;
        System.out.println(ss);
        System.out.println(cc);
        System.out.println("----------------------------------------");
        /**
         * 获取路径分隔符,在windows平台下打印的结果为  \
         */
        String separator = File.separator;
        char separatorChar = File.separatorChar;
        System.out.println(separator);
        System.out.println(separatorChar);
        System.out.println("---------------表示一个文件的路径---------------");
        String path1 = "D:\\File\\111.txt";
        String path2 = "D:/File/报销单.xlsx";
        String path3 = "D:"+File.separatorChar+"File"+File.separatorChar+"111.txt";
        System.out.println(path1);
        System.out.println(path2);
        System.out.println(path3);
        /**
         * path1 D:\File\111.txt
         * path1 D:/File/报销单.xlsx
         * path1 D:\File\111.txt
         */

    }















}

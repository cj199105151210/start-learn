package com.FileDemo;

import java.io.File;

public class DirectoryDemo {

    public static void main(String[] args){
        test1();
    }

    /**
     * 文件夹/目录的操作方法
     */
    public static void test1(){
        File dir = new File("D:/File/555");
        File f1 = new File(dir,"111.txt");
        System.out.println("判断是否是目录-----"+dir.isDirectory());
        System.out.println("判断是否是目录-----"+f1.isDirectory());

        boolean res = dir.mkdir();
        System.out.println("创建一个目录-----"+res);
        //如果目录存在，那么已经有的，则是false,如果没有，那么则新建一个目录，为true

        //mkdirs()  创建多级目录的时候用这个方法

        String[] fileList = dir.list();
        System.out.println("文件列表-----"+fileList);
        for (String f2:fileList){
            System.out.println("每个文件-----"+f2);
        }
        File[] f3 = dir.listFiles();
        System.out.println("文件列表-----"+f3);
        for(File f4:f3){
            System.out.println("单独文件-----"+f4);
        }
        /**
         * 比较：
         * list() 查询到的仅仅是目录下的文件
         * listFiles()  查询到的是整个文件所有的目录，相当于绝对路径名
         */
        File[] roots = File.listRoots();
        for(File root : roots){
            System.out.println("存在的根路径-----"+root);
            //系统下的目录，看看有几个盘
        }


    }
}



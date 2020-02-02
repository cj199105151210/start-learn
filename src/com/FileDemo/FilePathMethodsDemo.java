package com.FileDemo;

import java.io.File;
import java.io.IOException;

public class FilePathMethodsDemo {

    public static void main(String[] args) throws IOException {
//        test1();
//        test2();
        test3();
    }


    /**
     * 获取绝对路径的方法
     */
    public static void test1(){
        File f1 = new File("D:/File/111.txt");
        System.out.println(f1);
        System.out.println("获取文件绝对路径"+f1.getAbsoluteFile());
        System.out.println("获取文件绝对路径"+f1.getAbsolutePath());
        System.out.println("获取文件名称"+f1.getName());
        System.out.println("获取文件路径"+f1.getPath());
        System.out.println("获取上级目录路径"+f1.getParent());
        System.out.println("获取上级目录文件"+f1.getParentFile());
    }

    /**
     * 检测文件的状态
     */
    public static void test2(){
        File f1 = new File("D:/File/111.txt");
        System.out.println("判断文件是否能打开"+f1.canExecute());
        System.out.println("判断文件是否能可读"+f1.canRead());
        System.out.println("判断文件是否能可写"+f1.canWrite());
        System.out.println("判断文件是否有隐藏文件"+f1.isHidden());
        System.out.println("文件的最后修改时间"+f1.lastModified());
        System.out.println("文件的大小"+f1.length());

    }

    public static void test3() throws IOException {
        File f1 = new File("D:/File/111.txt");
        System.out.println("是否是文件--------------------"+f1.isFile());
        //判断文件是否存在，没有，则创建一个
        if(!f1.exists()){
            f1.createNewFile();
        }
    }


}

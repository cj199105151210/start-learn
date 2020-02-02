package com.FileDemo;

import java.io.File;

public class DiGuiDemo {

    /**
     * 需求列出指定目录下的所有文件，包括子文件夹里的文件
     * 使用递归算法
     * @param args
     */
    public static void main(String[] args){
        File dir = new File("D:/File/555");
//        listAllFiles(dir);
        listEveryFiles(dir);

    }

    //递归算法，相同的部分就调用自己，递归方法最重要的是要有出口，没有出口，就会陷入死循环
    private static void listEveryFiles(File f) {
        //第一级子文件
        File[] fs = f.listFiles();
        for (File file : fs) {
            System.out.println(file);
            //第二级，如果子文件是目录，继续递归
            if (file.isDirectory()) {
                listEveryFiles(file);
            }
        }
    }

    //普通写法，不知道多少层，循环遍历写
    private static void listAllFiles(File f) {
        System.out.println(f);
        //第一级子文件
        File[] fs = f.listFiles();
        for (File file : fs){
            System.out.println(file);
            //第二级
            if(file.isDirectory()){
                File[] f2 = file.listFiles();
                System.out.println("----------------->"+f2);
                for(File file2: f2){
                    System.out.println("-------------->>"+file2);
                    //第三级
                    if(file2.isDirectory()){
                        File[] f3 = file2.listFiles();
                        for(File file3: f3){
                            System.out.println("-------->>>"+file3);
                        }
                    }
                }
            }
        }
    }
}

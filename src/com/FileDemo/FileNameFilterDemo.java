package com.FileDemo;

import java.io.File;
import java.io.FilenameFilter;

public class FileNameFilterDemo {
    /**
     * 文件名称的过滤器:
     * 根据文件夹或者文件后缀名共同判断是否是符合相应的文件
     */

    public static void main(String[] args){
        File dir = new File("d:/File/555/hello");
        File[] fs = dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return new File(dir,name).isFile() && name.endsWith(".avi");
            }
        });
        for(File file : fs){
            System.out.println("文件名："+file);
        }

    }
}

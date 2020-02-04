package com.IODemo;

import java.io.*;

public class FileCopyDemo {

    /**
     * 使用文件字符流完成文本文件的拷贝
     * 思路：先输入，在输出
     * @param args
     */
    public static void main(String[] args) throws IOException {
        //1.创建源和目标
        File srcFile = new File("file/ch.txt");
        File destFile = new File("file/ch_copy.txt");
        //2.创建输入流和输出流对象
        Reader in = new FileReader(srcFile);
        Writer out = new FileWriter(destFile);
        //3.读写操作
        char[] buffer = new char[1024];
        int len = -1;
        //读多少，写多少
        while ((len = in.read(buffer)) != -1){
            out.write(buffer,0,len);
        }
        out.flush();
        //4.关闭资源
        in.close();
        out.close();
    }
}

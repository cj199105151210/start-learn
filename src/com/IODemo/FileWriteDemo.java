package com.IODemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriteDemo {

    /**
     * 文件字符输出流：
     * 对于字节流，flush方法不是都有作用，部分字节流才有作用
     * 对于字符流都起作用
     * 如果我们调用close(),系统在关闭资源前，会先调用flush()方法
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) throws IOException {
        //1.创建目标
        File destFile = new File("file/ch.txt");
        //2.创建字符输出流对象
        Writer out = new FileWriter(destFile,true);
        //3.写出操作
//        out.write('Y');
//        out.write("hello".toCharArray());
        out.write("ABcdvfs".toCharArray(),3,4);
        out.flush();
        //4.关闭流
        out.close();

    }
}

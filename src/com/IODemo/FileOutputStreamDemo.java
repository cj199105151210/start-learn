package com.IODemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreamDemo {

    //文件的字节输出流
    public static void main(String[] args) throws Exception {
        //1.创建目标对象（表示把数据保存到哪一个文件）
        File file = new File("file/abc.txt");
        //2.创建文件字节输出流对象,注意构造方法，false,表示不增加，
        OutputStream out = new FileOutputStream(file,false);
        // 3.具体的输出操作
        // void write(int b): 把一个字节写入到文件中
//        out.write(99);

        // void write(byte[] b) :把b数组中的所有字节写入到文件中
//        out.write("ABCD".getBytes());

        // void write(byte[] b,int off,int length):把数组b 中的从off索引开始的length 个字节写入到文件中
        out.write("zhangsanfeng".getBytes(),5,3);

        // 4.关闭资源 close()
        out.close();
    }
}

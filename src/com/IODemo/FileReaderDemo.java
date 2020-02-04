package com.IODemo;

import java.io.*;

public class FileReaderDemo {


    /**
     * 文件的字符流：
     * 使用字节流操作汉字或者其他特殊的符号容易乱码，建议使用字符流
     * 先有字节流，后又字符流，字符流事字节流的补充
     *      一般操作二进制文件（图片，音频，视频等）必须使用字节流
     *      一般的文件操作使用字符流
     * @param args
     */
    public static void main(String[] args) throws IOException {
        //1.创建源
        File scrFile = new File("file/ch.txt");
        //2.创建流对象
        Reader in = new FileReader(scrFile);
        //3.读取操作
        int ret = in.read();
        char[] buffer = new char[5];//每次只能读取10个字符
        int len = -1;
        while ((len = in.read(buffer)) != -1){
            System.out.println(buffer);
            len = in.read(buffer);
        }
        //4.关闭流
        in.close();

    }
}

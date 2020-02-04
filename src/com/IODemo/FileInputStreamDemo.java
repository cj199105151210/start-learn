package com.IODemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class FileInputStreamDemo {

    //文件的字节输入流
    public static void main(String[] args) throws Exception {
        //1.创建源
        File file = new File("file/abc.txt");
        //2.创建文件输入流对象，并拼在源上
        InputStream in = new FileInputStream(file);
        //3.具体操作，写入到程序中,如果读取到最后没有数据的时候，返回-1
        //int read():读取一个字节，返回读取的字节
        byte[] buffer = new byte[5];//此时最多只能存储5个字节
        System.out.println(Arrays.toString(buffer));

        //int read(byte[] b)
//        int ret = in.read(buffer);
//        System.out.println(Arrays.toString(buffer));
//        System.out.println(ret);

        //int read(byte[] b,int off,int len)
        //把byte[] 转换为字符串
//        String str = new String(buffer,0,3);
//        System.out.println(str);

        int len = -1;
        while ( (len = in.read(buffer)) != -1){
            String str = new String(buffer,0,len);
            System.out.println(str);
        }

        // 4.关闭源
        in.close();


    }
}

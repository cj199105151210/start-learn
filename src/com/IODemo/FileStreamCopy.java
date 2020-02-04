package com.IODemo;

import java.io.*;

public class FileStreamCopy {

    //使用文件字节流完成文件拷贝
    public static void main(String[] args) throws Exception {
        //1.创建源
        File file = new File("file/11.txt");
        File destFile = new File("file/11_copy.txt");
        //2.创建输入的管道
        InputStream in = new FileInputStream(file);
        OutputStream out = new FileOutputStream(destFile);
        //3.读取擦做
        byte[] buffer = new byte[10]; //创建容量为10的缓冲区
        int len = -1;//表示读取了多少个字节，如果是-1，表示文件已经读到最后了
        while ((len = in.read(buffer)) != -1){
            System.out.println(new String(buffer,0,len));
            out.write(buffer,0,len);
        }
        //4.关闭管道
        in.close();
        out.close();
    }
}

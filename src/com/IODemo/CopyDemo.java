package com.IODemo;

import java.io.*;

public class CopyDemo {

    //案例：把文件复制到指定文件中
    public static void main(String[] args) throws IOException {
        File srcDir = new File("file");
        File destDir = new File("java");
        File[] fs = srcDir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return new File(dir,name).isFile() && name.endsWith(".java");
            }
        });
        //循环遍历每一个文件对象
        for (File srcFile : fs){
            InputStream in = new FileInputStream(srcFile);
            OutputStream out = new FileOutputStream(new File(destDir,srcFile.getName()));

            //读写操作
            byte[] buffer = new byte[1024];//一次性可以读取1024个字节
            int len = -1;//已经读取的字节数，在底层规定是-1读取到末尾
            len = in.read(buffer);
            while (len != -1){
                out.write(buffer,0,len);
                len = in.read(buffer);
            }
            in.close();
            out.close();
        }

    }
}

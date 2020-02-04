package com.IODemo;

import java.io.*;

public class CloseResourceDemo {

    public static void main(String[] args){

//        testClose();

        testClose2();
    }

    private static void testClose2() {
        //1.创建源
        File file = new File("file/11.txt");
        File destFile = new File("file/11_copy2.txt");
        try(
                InputStream in = new FileInputStream(file);
                OutputStream out = new FileOutputStream(destFile);
         ) {
            byte[] buffer = new byte[10]; //创建容量为10的缓冲区
            int len = -1;//表示读取了多少个字节，如果是-1，表示文件已经读到最后了
            while ((len = in.read(buffer)) != -1){
                System.out.println(new String(buffer,0,len));
                out.write(buffer,0,len);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private static void testClose() {
        InputStream in = null;
        OutputStream out = null;
        try{
            //1.创建源
            File file = new File("file/11.txt");
            File destFile = new File("file/11_copy.txt");
            //2.创建输入的管道
            in = new FileInputStream(file);
            out = new FileOutputStream(destFile);
            //3.读取擦做
            byte[] buffer = new byte[10]; //创建容量为10的缓冲区
            int len = -1;//表示读取了多少个字节，如果是-1，表示文件已经读到最后了
            while ((len = in.read(buffer)) != -1){
                System.out.println(new String(buffer,0,len));
                out.write(buffer,0,len);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //4.关闭管道
            try {
                if(in != null){
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(out != null){
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }





    }


}

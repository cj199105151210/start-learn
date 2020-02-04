package com.IODemo;

import java.io.*;

public class ProcessDemo {

    //获取进程数据--编译和运行Java代码
    public static void main(String[] args) throws IOException {
        String str = "System.out.print(\"你真美，很喜欢你\")";
        System.out.println(str);
        eval(str);

    }

    //执行str参数，并在控制台打印输出： 你真美，很喜欢你
    private static void eval(String str) throws IOException {
        //1.使用StringBuilder 拼接一个完整的HelloWorld程序
        StringBuilder stringBuilder = new StringBuilder(80);
        stringBuilder.append("public class Hello{");
        stringBuilder.append("public static void main(String[] args){");
        stringBuilder.append(str);
        stringBuilder.append(";");
        stringBuilder.append("}");
        stringBuilder.append("}");
        System.out.println(stringBuilder);
        //2.保存到一个觉Hello.java的文件中
        OutputStream out = new FileOutputStream("Hello.java");
        out.write(stringBuilder.toString().getBytes());
        out.close();
        //3.调用javac 进程来编译hello.java
        Process process = Runtime.getRuntime().exec("javac Hello.java");
        //4.读取javac进程中的错误流信息
        InputStream error = process.getErrorStream();
        //5.读取数据
        byte[] buffer = new byte[1024];
        int len = -1;
        while ((len = error.read(buffer)) != -1){
            String msg = new String(buffer,0,len);
            System.out.println("第一次"+msg);
        }
        error.close();
        //6.调用java进程来运行Hello.java
        Process javaProcess = Runtime.getRuntime().exec("java Hello");

        //7.读取java进程中的流数据
        InputStream info = javaProcess.getInputStream();
        while ((len= info.read(buffer)) != -1){
            String msg = new String(buffer,0,len);
            System.out.println("第二次"+msg);
        }
        info.close();
    }
}

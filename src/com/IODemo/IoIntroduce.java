package com.IODemo;

public class IoIntroduce {

    /**
     * IO流的分类
     * 1):根据流向划分： 输入流和输出流
     * 2):根据数据的单位划分：字节流和字符流
     * 3):根据功能划分： 节点流和包装流
     *
     * 四大基流：
     * 1):字节输出流   OutputStream
     * 2):字节输入流   InputStream
     * 3):字符输出流   Writer
     * 4):字符输入流   Reader
     *
     * 四大基流都是抽象类，其他流都是继承四大基流，我们不能创建四大基流的对象，只能创建其子类对象
     * 无论是什么流都有  close()方法，用来关闭资源
     *
     * 操作IO流的模板
     * 1):创建源或者目标对象
     *      拿文件流举例：
     *      输入操作：把文件中的数据流向程序中，此时文件是源，程序是目标
     *      输出操作：把程序中的数据流向文件中，此时文件时目标，程序是源
     * 2):创建IO流对象（水管）
     *      输入操作：创建输入流对象
     *      输出操作：创建输出流对象
     * 3):具体的IO操作
     *      输入操作：输入流对象的read方法
     *      输出操作：输出流对象的write方法
     * 4):关闭资源
     *      输入操作：输入流对象的close();
     *      输出操作：输出流对象的 close();
     *
     * 口诀：读进来，写出去
     *      读进来：进来强调了是输入，读说明是read方法
     *      写出去：出去强调了是输出，写说明是write 方法
     * @param args
     */
    public static void main(String[] args){

    }
}

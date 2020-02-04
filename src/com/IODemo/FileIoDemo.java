package com.IODemo;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class FileIoDemo {

    /**
     * 文件流：程序和文件打交道
     * FileInputStream: 文件的字节输入流
     * FileOutputStream:  文件的字节输出流
     * FileReader: 文件的字符输入流
     * FileWriter: 文件的字符输出流
     * @param args
     */

    public static void main(String[] args){
        //获取系统的属性
        Properties pro = System.getProperties();
        Set<Map.Entry<Object,Object>> entrySet=pro.entrySet();
        for(Map.Entry<Object,Object> entry: entrySet){
            System.out.println(entry.getKey()+"----"+entry.getValue());
        }
        System.out.println("----------------------------------");
        String value= System.getProperty("user.dir");
        System.out.println("当前文件所在的目录："+value);

    }


}

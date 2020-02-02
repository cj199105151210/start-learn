package com.FileDemo;

import java.io.File;

public class ModifyFileNameDemo {

    //批量修改文件名称
    public static void main(String[] args){
        File path = new File("d:/File/555/hello");
        //获取当前目录下的所有文件
        File[] fs = path.listFiles();
        String filePath = "666-";
        for(File file : fs){
            if(file.getName().contains(filePath)){
                String newName = file.getName().replace(filePath,"");
                file.renameTo(new File(path,newName));
            }
            System.out.println(file);
        }
        /**
         * 总结：批量修改文件名，首先需要找一个共同的文件夹，然后名字中有共同的部分，将共同的部分进行替换，达到批量修改的目的
         */
    }
}

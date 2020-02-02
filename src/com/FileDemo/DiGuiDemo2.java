package com.FileDemo;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiGuiDemo2 {

    //列出文件的分层结构
    public static void main(String[] args){
        String path = "d:/File/555/hello/689.txt";
        File file = new File(path);
        //父级目录
        System.out.println("父级目录"+file.getParentFile().getName());
        //父级的父级目录
        System.out.println(file.getParentFile().getParentFile().getName());
        List<String> parentNames = new ArrayList<String>();
        listAllNames(parentNames,file);
        System.out.println("上级目录---》"+parentNames);
        Collections.reverse(parentNames);
        System.out.println("反转---》"+parentNames);
        StringBuilder sb = new StringBuilder(100);
        for(String name : parentNames){
            sb.append(name).append(">");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println("完成目录文件层次---》"+sb);
    }

    private static void listAllNames(List<String> parentNames, File file) {
        //去除存在的逗号
        if(!"".equals(file.getParentFile().getName())){
            parentNames.add(file.getParentFile().getName());
        }
        if(file.getParentFile().getParentFile() != null){
            listAllNames( parentNames,file.getParentFile());
        }
    }


}

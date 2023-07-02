package com.wbu.file.exer2;

import org.junit.Test;

import java.io.*;

/**
 * @auther 11852
 * @create 2023/6/9
 */
public class FileReaderWriterTest {
    /**
     * 将hello.txt中的内容显示在控制台上
     */
    @Test
    public void test1(){
        File file = new File("hi.txt");
//        String realname = file.getName();
//        String real = realname.substring(0,realname.lastIndexOf("."));
        File file1 = new File("hello.txt");
        file.renameTo(file1);
        System.out.println("修改成功");
//        File file1 = new File("hi.txt");
//        file.renameTo(file1);
//        //创建输入型的字符流 用于读取数据
//        FileReader reader=null;
//        try {
//            reader=new FileReader(file);
//            //读取数据 显示在控制台上
//            /**
//             * 方式一：
//             */
////        int data = reader.read();
////        while (data!=-1){
////            System.out.print((char) data);
////            data=reader.read();
////        }
//            /**
//             * 方式二：
//             */
//            int data;
//            while ((data=reader.read())!=-1){
//                System.out.print((char) data);
//            }
//
//        } catch (IOException e) {
////            throw new RuntimeException(e);
//            e.printStackTrace();
//        } finally {
//            try {
//                if(reader!=null){
//                    reader.close();
//                }
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
    }
    @Test
    public void test2(){
        File file = new File("hello.txt");
        //创建输入型的字符流 用于读取数据
        FileReader reader=null;
        try {
            reader=new FileReader(file);
            //读取数据 显示在控制台上
            /**
             * 方式一：
             */
//        int data = reader.read();
//        while (data!=-1){
//            System.out.print((char) data);
//            data=reader.read();
//        }
            /**
             * 方式二：
             */
            char[] chars = new char[5];
            int len;
            while ((len=reader.read(chars))!=-1){
                for (int i=0;i<len;i++){
                    System.out.print(chars[i]);
                }
            }

        } catch (IOException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        } finally {
            try {
                if(reader!=null){
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    /**
     * 将内存的数据写出到指定的文件中
     */
    @Test
    public void test3(){
        File file = new File("info.txt");
        FileWriter fileWriter=null;
        try {
            /**
             * 覆盖文件 false
             * 追加 true
             */
            fileWriter= new FileWriter(file,true);
            fileWriter.write("大胆");
            System.out.println("输出成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileWriter!=null){
                    fileWriter.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void test4() throws Exception{
        File file = new File("hello.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String s = bufferedReader.readLine();
    }


}

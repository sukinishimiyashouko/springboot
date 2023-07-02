package com.wbu.file.exer1;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

/**
 * File类
 * @auther 11852
 * @create 2023/6/9
 */
public class FileTest {
    /**
     * 文件的路径表示方式
     * 1.绝对路径
     * 2.相对路径
     * 在IDEA中如果使用单元测试工具 相当于当前的module来讲
     *        如果使用main方法 相当于当前工程来讲
     */
    @Test
    public void test1() throws Exception{
        //public File(String pathname)
        File file1 = new File("hello.txt");
        File file2 = new File("abc");
        FileInputStream fileInputStream = new FileInputStream(file1);
        int available = fileInputStream.available();
        System.out.println(available);
    }
    @Test
    public void test2(){
        //public File(String parent,String child)
        /**
         * 参数1:一定是一个文件目录
         * 参数2:可以是一个文件,也可以是一个文件目录
         */
        File file = new File("d:/io", "hello.txt");
        File file1 = new File("ab", "a1");

        //public File(File parent,String child)
        /**
         * 参数1:一定是一个文件目录
         * 参数2:可以是一个文件,也可以是一个文件目录
         */
        File file2 = new File(file1, "ab.txt");
    }

}

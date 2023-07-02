package com.wbu.string.exer1;

import org.junit.Test;

import java.util.function.Function;

//import java.util.Arrays;
/**
 * final:String不可被继承
 * Serializeable: 可序列化的接口。凡是实现此接口的类的对象就可以通过网络或本地流进行数据的传输
 * Comparable: 凡是实现此接口的类 其对象可以比较大小
 */

/**
 * ->String 不可变的字符序列 底层使用char[]（jdk8）之前 底层使用byte[]（jdk8之后）
 * ->StringBuffer 可变的字符序列 线程安全效率低 底层使用char[]（jdk8）之前 底层使用byte[]（jdk8之后）
 * ->StringBuilder 可变的字符序列 线程不安全效率高 底层使用char[]（jdk8）之前 底层使用byte[]（jdk8之后）
 */

/**
 * 如果开发中需要频繁的针对字符串进行增删该等操作，建议使用StringBuffer或StringBuilder替换String
 * 如果开发中不涉及线程安全问题时 建议使用StringBuilder替换StringBuffer
 *如果开发中大体确定要操作的字符的个数 建议使用带int capacity参数的构造器 避免底层多次扩容
 */


/**
 * @auther 11852
 * @create 2023/6/9
 */
public class Demo1 {
    /**
     * 字符串常量都存储在字符串常量池中(StringTable)中
     * 字符串常量池中不允许存放两个相同的字符串常量
     */
    @Test
    public void test1(){
        String str1 = "Hello";
//        String str2 = "Hello";
        String str2 = new String("Hello"); //在内存中创建了两个对象 一个是堆空间中new的对象 另一个是在字符串常量池中生成的字面量
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }


   @Test
    public void test2(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("123456789qwertyua");
        System.out.println(stringBuilder);
//        String s1="Hello";
//        String s2="World";
//        String s3 = "HelloWorld";
//        String s4 = s1+"World";
       
    }
}

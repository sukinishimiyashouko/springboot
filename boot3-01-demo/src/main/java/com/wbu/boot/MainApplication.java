package com.wbu.boot;

import com.wbu.User;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Date;

/**
 * @auther 11852
 * @create 2023/6/5
 */
@SpringBootApplication//这是一个springBoot
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }
//    @Test
//    public void test(){
//
//        String[] strings = new String[]{"a","b","c"};
//        System.out.println(strings[0]);
//        System.out.println(Arrays.toString(strings));
//        String str1 = new String("hello ");
//        String str2 = new String("hello ");
//        System.out.println(str1.equals(str2));
//        int[] arr1 =new int[]{1,2,3};
//        int[] arr2 = new int[]{1,2,3,4};
//        System.out.println(arr1==arr2);
//        System.out.println(arr1.toString());
//        System.out.println(Arrays.toString(arr1));
//        Arrays.sort(arr1);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(arr2);
//        System.out.println(Arrays.equals(arr1,arr2));
//        System.out.println(new Date());
//
//
////        byte[] bytes = new byte[1024];
//
//
//
//        Class clazz1 = Arrays.class;
////        Constructor constructor1 = clazz1.getDeclaredConstructor();
//        System.out.println(clazz1.getName());
//
//        try {
//            Class clazz = Class.forName("java.util.Arrays");
//            Constructor constructor = clazz.getDeclaredConstructor();
////            System.out.println(constructor.getName());
////            System.out.println(constructor.getDeclaringClass());
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//    @Test
//    public void test1(){
////        User.nation="US";
////        System.out.println(User.nation);
//        User user = new User();
//        System.out.println(user.nation);
//        user.nation="US";
//        System.out.println(user.nation);
//        User.nation="UK";
//        System.out.println(User.nation);
//    }
}

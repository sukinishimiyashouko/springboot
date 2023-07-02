package com.wbu.thread;

import java.util.concurrent.locks.Lock;

/**
 * @auther 11852
 * @create 2023/6/8
 */
public class EvenNumberTest {
    /**
     * 线程的创建方式一、 继承Thread类
     * 创建一个Thread类的子类
     * 重写Thread类的run方法 -->将线程要执行的操作生命在此方法体内
     * 创建当前Thread的子类的对象
     * 通过对象调用start() : 作用:1.启动线程 2.调用当前线程的run()方法
     */
    public static void main(String[] args) {
        PrintNumber printNumber = new PrintNumber();
        printNumber.setPriority(Thread.MAX_PRIORITY);
        printNumber.start();
        OddNumberPrint oddNumberPrint = new OddNumberPrint();
        oddNumberPrint.start();
        /**
         * 问题1:不可以用run方法代替start
         * 问题2:不能用start（）方法开启已经执行start（）的线程
         */


        /**
         * 诱发死锁的原因
         * 1、互斥
         * 2、占用且等待
         * 3、不可剥夺
         * 4、循环等待
         */
        new Thread(){
            @Override
            public void run() {
                super.run();
            }
        };

        for (int i=1;i<=100;i++){
            if(i%2==1){
                System.out.println(Thread.currentThread().getName()+":"+i+"***********");
            }
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=100;i++){
                    if(i%2==1){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1 ; i <= 100;i++){
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
        }).start();


    }

}
class PrintNumber extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
class OddNumberPrint extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=100;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}

package com.wbu.runnable;

/**
 * @auther 11852
 * @create 2023/6/8
 */
public class EvenNumberTest {
    /**
     * 线程创建方法2 实现runnable接口
     * 1.创建一个实现runnable接口的类
     * 2.十号线接口中的run（） -->将此线程要执行的操作生命在此方法体中
     * 3.创建当前实现类的对象
     * 4.将此对象作为参数传递到Thread类的构造器中，创建Thread的实例
     * 5.Thread的实例调用start（）
     */

    public static void main(String[] args) {
        EvenRunnablePrint evenRunnablePrint = new EvenRunnablePrint();
        new Thread(evenRunnablePrint,"线程0:").start();

    }
}
class EvenRunnablePrint implements Runnable{
    @Override
    public void run() {
        for (int i=1;i<=100;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}

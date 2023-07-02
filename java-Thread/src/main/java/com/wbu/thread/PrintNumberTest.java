package com.wbu.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @auther 11852
 * @create 2023/6/9
 */

/**
 * 线程间的通信设计三个方法
 * wait() 线程一旦执行此方法就进入等待状态并释放对同步监视器的调用
 * notify() 线程一旦执行此方法，就会唤醒被wait()的线程中优先级最高的那一个线程，(如果被wait()的多个线程中的优先级相同则随机唤醒一个) 被唤醒的线程从当初被wait()的位置继续执行
 * notifyAll() 一旦执行此方法 就会唤醒所有被wait的线程
 *
 * (Lock需要配合Condition实现进程间的通信)
 */

/**
 * wait和sleep的区别
 * 相同点：一旦执行当前线程进入阻塞状态
 * 不同点：
 *    -> 声明的位置：wait声明在Object类中
 *                 sleep声明在Thread类中
 *    -> 使用的场景不同：wait只能使用在同步代码块或同步方法中
 *                    sleep可以在任何需要使用的场景
 *    -> 使用在同步代码块或同步方法中时：wait一旦执行释放对同步监视器的调用   sleep一旦执行不会释放对同步监视器的调用
 *    -> 结束阻塞的方式:wait到达指定时间自动结束阻塞 或 通过被notify唤醒 结束阻塞  sleep到达指定时间自动结束阻塞
 */

public class PrintNumberTest {
    public static void main(String[] args) {
        PrintNumber1 number1 = new PrintNumber1();
        Thread thread1 = new Thread(number1,"线程1");
        Thread thread2 = new Thread(number1,"线程2");
        Thread thread3 = new Thread(number1,"线程3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class PrintNumber1 implements Runnable{

    private int number = 1;
//    private static final ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
//            lock.lock();
            synchronized (this) {
                notify();
                if (number<=100){
                    try {
                        Thread.sleep(100);//不会释放对同步监视器的调用
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName()+":"+number);
                    number++;
                    try {
                        wait();//线程一旦执行该方法，就进入等待状态，同时释放对同步监视器的调用
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }else {
                    break;
                }
            }
//            lock.unlock();
        }
    }
}
class NumThread implements Callable{

    @Override
    public Object call() throws Exception {
        return null;
    }
}

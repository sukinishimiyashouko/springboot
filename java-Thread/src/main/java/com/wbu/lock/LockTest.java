package com.wbu.lock;

import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @auther 11852
 * @create 2023/6/8
 */
public class LockTest {
    public static void main(String[] args){
        Window window1 = new Window();
        Window window2 = new Window();
        Window window3 = new Window();
        window1.setName("线程1");
        window2.setName("线程2");
        window3.setName("线程3");
        window1.start();
        window2.start();
        window3.start();
    }

}

/**
 * 同步代码块
 * synchronized(同步监视器){需要同步的代码}
 * 同步监视器俗称锁 哪个线程获取了锁那个哪个就能执行被同步的代码
 * 同步监视器可以使用任何一个类的对象充当，但是多个线程必须公用同一个同步监视器
 *
 * synchronized好处:解决了线程的安全性
 * 弊端:在操作数据共享时,多线程其实是串行执行的,意味着性能低
 */

/**
 * synchronized与lock的对比
 * synchronized不管是同步代码块还是同步方法,都需要在结束{}后四方对同步监视器的额调用
 * lock通过两个方法控制需要被同步的代码，更加的灵活
 * Lock作为接口提供了多种实现类，适合更多复杂的场景，效率更高
 */

class Window extends Thread {
    static int ticket = 100;
    //    static Object obj = new Object();
//    static boolean isFlag = true;
    /**
     * 创建lock实例 需要确保多个线程共用同一个Lock实例
     */
    private static final ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
//        while (isFlag) {
//            show();
//        }
        while (true){
            try{
                lock.lock();//执行lock方法,锁定对共享资源的调用
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + ticket);
                    ticket--;
                } else {
//            isFlag = false;
                    break;
                }
            }finally {
                lock.unlock();//unlock调用，释放对共享数据的调用
            }


        }
    }

//    public static synchronized void show() {
//        if (ticket > 0) {
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(Thread.currentThread().getName() + ":" + ticket);
//            ticket--;
//        } else {
////            isFlag = false;
//            break;
//        }
//
//    }
}

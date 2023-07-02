package com.wbu.notsafe;

/**
 * @auther 11852
 * @create 2023/6/8
 */

/**
 * 使用继承Thread类的方式实现卖票
 */
public class WindowTest {
    public static void main(String[] args){
        Window window = new Window();
        Thread thread1 = new Thread(window);
        Thread thread2 = new Thread(window);
        Thread thread3 = new Thread(window);
        thread1.setName("Window1:");
        thread2.setName("Window2:");
        thread3.setName("Window3:");
        thread1.start();
        thread2.start();
        thread3.start();
    }

}

/**
 * 同步代码块
 * synchronized(同步监视器){需要同步的代码}
 * 同步监视器俗称锁 哪个线程获取了锁那个哪个就能执行被同步的代码
 * 同步监视器可以使用任何一个类的对象充当，但是多个线程必须公用同一个同步监视器
 */
class Window implements Runnable {
    static int ticket=100;
    Object obj = new Object();
    @Override
    public void run() {
        while (true){
            synchronized (obj){
                if (ticket>0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName()+":"+ticket);
                    ticket--;
                }
                else {
                    break;
                }
            }
        }
    }
}

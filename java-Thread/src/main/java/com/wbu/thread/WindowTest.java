package com.wbu.thread;

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
        thread1.setName("线程1");
        thread2.setName("线程2");
        thread3.setName("线程3");
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
 *
 * synchronized好处:解决了线程的安全性
 * 弊端:在操作数据共享时,多线程其实是串行执行的,意味着性能低
 */
class Window implements Runnable{
    static int ticket=100;
//    static Object obj = new Object();
     static boolean isFlag = true;
    @Override
    public void run() {
         while (isFlag){
             show();
         }
    }
    public static synchronized void show(){
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
            isFlag = false;
        }
    }
}

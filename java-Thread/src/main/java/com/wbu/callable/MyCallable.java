package com.wbu.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @auther 11852
 * @create 2023/6/9
 */
public class MyCallable{
    public static void main(String[] args) {
        MyCall myCall = new MyCall();
        FutureTask futureTask = new FutureTask(myCall);
        Thread thread = new Thread(futureTask);
        thread.setName("线程1");
        thread.start();
    }


}

class MyCall implements Callable {
    private int ticket=100;


    @Override
    public Object call() throws Exception {
        while (true){
            synchronized (MyCall.class){
                if(ticket>0){
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName()+":"+ticket);
                    ticket--;
                }else break;
            }
        }
        return "票已卖完";
    }
}

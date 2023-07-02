package com.wbu.udp;

import org.junit.Test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * @auther 11852
 * @create 2023/6/17
 */
public class UDPTest {
    //发送端
    @Test
    public void sender() throws Exception{

        //创建DatagramSocket实例
        DatagramSocket ds = new DatagramSocket();

        //将数据、目的地ip、目的地端口号都封装在数据报中
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        int port = 9090;
        byte[] bytes = "我是发送端".getBytes("utf-8");
        DatagramPacket dp = new DatagramPacket(bytes,0,bytes.length,inetAddress,port);

        //发送数据
        ds.send(dp);

        ds.close();
    }

    //接收端
    @Test
    public void receiver() throws Exception{
        //创建实例
        DatagramSocket ds = new DatagramSocket(9090);
        //创建数据报对象，用于接收发送端发送过来的数据
        byte[] bytes = new byte[1024*64];
        DatagramPacket dp = new DatagramPacket(bytes,0,bytes.length);
        //接收数据
        ds.receive(dp);
        //获取数据
        String s = new String(dp.getData(),0,dp.getLength());
        System.out.println(s);
    }
}

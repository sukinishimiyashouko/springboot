package com.wbu.tcp;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @auther 11852
 * @create 2023/6/17
 */
public class TcpTest {

    @Test
    public void send() throws IOException {
        //创建一个Socket
//        String localHost = InetAddress.getLocalHost().toString();

        InetAddress byName = InetAddress.getByName(InetAddress.getLocalHost().getHostName());//声明ip地址

        Socket socket1= new Socket(byName, 80);

        OutputStream outputStream = socket1.getOutputStream();
        outputStream.write("Hello".getBytes());

        outputStream.close();
        socket1.close();
        //关闭Socket
    }

    @Test
    public void server() throws IOException {
        //创建一个ServerSocket
        ServerSocket serverSocket = new ServerSocket(80);

        //调用accept()接收客户端的Socket
        Socket accept = serverSocket.accept();//阻塞式方法
        //接收数据
        InputStream inputStream = accept.getInputStream();
        byte[] bytes = new byte[5];
        int len;
        while ((len=inputStream.read(bytes))!=-1){
            String str = new String(bytes,0,len);
            System.out.println(str);
        }
        //关闭Socket
        inputStream.close();
        accept.close();
        serverSocket.close();
    }
}

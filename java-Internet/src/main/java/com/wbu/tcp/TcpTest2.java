package com.wbu.tcp;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @auther 11852
 * @create 2023/6/17
 */
public class TcpTest2 {
    @Test
    public void client(){


        Socket socket = null;
        FileInputStream fileInputStream = null;
        OutputStream os = null;
        try {
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");//目标地址
            socket = new Socket(inetAddress, 80);

            File file = new File("会议笔记_软件工程及面向对象_469641615.png");
            fileInputStream = new FileInputStream(file);

            os = socket.getOutputStream();


            byte[] bytes = new byte[1024];
            int len;
            while ((len=fileInputStream.read(bytes))!=-1){
                os.write(bytes,0,len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (os!=null){
                    os.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (fileInputStream!=null){
                    fileInputStream.close();
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (socket!=null){
                    socket.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    @Test
    public void server(){
        ServerSocket serverSocket = null;
        Socket accept = null;
        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            serverSocket = new ServerSocket(80);

            accept = serverSocket.accept();

            inputStream = accept.getInputStream();

            File file = new File("会议笔记_copy.png");

            fileOutputStream = new FileOutputStream(file);

            byte[] bytes = new byte[1024];
            int len;
            while((len=inputStream.read(bytes))!=-1){
                fileOutputStream.write(bytes,0,len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileOutputStream!=null)
                    fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (inputStream!=null)
                inputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (accept!=null)
                accept.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (serverSocket!=null)
                serverSocket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}

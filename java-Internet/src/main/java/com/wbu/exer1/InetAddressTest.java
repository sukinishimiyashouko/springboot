package com.wbu.exer1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @auther 11852
 * @create 2023/6/17
 */
public class InetAddressTest {

    public static void main(String[] args) {
        try {

            String localHost = InetAddress.getLocalHost().toString();
            System.out.println(localHost);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }

}

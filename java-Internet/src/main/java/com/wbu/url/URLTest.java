package com.wbu.url;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @auther 11852
 * @create 2023/6/17
 */
public class URLTest {
    public static void main(String[] args) {
        String str = "http://127.0.0.1:8080";
        URL url = null;
        try {
            url = new URL(str);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        System.out.println(url.getPort());

    }
}

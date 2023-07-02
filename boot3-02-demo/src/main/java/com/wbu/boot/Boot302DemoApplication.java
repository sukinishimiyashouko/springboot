package com.wbu.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Boot302DemoApplication {

    public static void main(String[] args) {
        var ioc = SpringApplication.run(Boot302DemoApplication.class, args);
        String[] names = ioc.getBeanDefinitionNames();
        for (String name : names){
            System.out.println(name);
        }

    }

}

package com.wbu.string.exer3;

import org.junit.Test;

import java.time.*;
import java.util.UUID;

/**
 * @auther 11852
 * @create 2023/6/9
 */
public class Demo1 {
    @Test
    public void test1(){
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localDateTime);
        String uuid = String.valueOf(UUID.randomUUID()).replaceAll("-","");
        System.out.println(uuid);
        Instant instant = Instant.now();
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);
    }
}

package com.wbu.string.exer2;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @auther 11852
 * @create 2023/6/9
 */



public class Demo1 {
    @Test
    public void test1(){
        Date date = new Date();
        System.out.println(date.toString());
        long time = date.getTime();
        System.out.println(time);

        Date date1 = new Date(time);
        System.out.println(date1);
    }

    @Test
    public void test2() throws ParseException {
        /**
         * SimpleDateFormat类用于容器时间的格式化和解析
         *
         * 格式化-> 日期--->字符串
         * 解析-> 字符串--->日期
         */
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        String format = simpleDateFormat.format(new Date());
        System.out.println(format);

        /**
         * 解析
         */
        Date parse = simpleDateFormat.parse("23-6-9 下午5:46");
        System.out.println(parse.toString());
    }

    @Test
    public void test3(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getClass());
        System.out.println(calendar.getCalendarType());
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        calendar.set(Calendar.DAY_OF_WEEK,5);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    }
}

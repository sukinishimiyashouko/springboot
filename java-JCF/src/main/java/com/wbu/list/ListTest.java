package com.wbu.list;

import com.wbu.collection.Person;
import org.junit.Test;

import java.util.*;

/**
 * @auther 11852
 * @create 2023/6/16
 */
public class ListTest {
    @Test
    public void test(){
        List list = new ArrayList();
        list.add("AA");
        list.add(123);//自动装箱
        list.add("BB");
        list.add(new Person("Jerry",16));
//        System.out.println(list.toString());
//        Arrays.asList();
        list.add(2,"CC");
//        System.out.println(list);
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

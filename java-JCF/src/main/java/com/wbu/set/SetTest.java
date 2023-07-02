package com.wbu.set;

import com.wbu.collection.Person;
import org.junit.Test;

import java.util.*;

/**
 * @auther 11852
 * @create 2023/6/16
 */
public class SetTest {
    @Test
    public void test(){
        Set set = new HashSet();
        set.add("AA");
        set.add(123);
        set.add("BB");
        set.add(new Person("Tom",3));
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    @Test
    public void test1(){
        Set set = new LinkedHashSet();
        set.add("AA");
        set.add(123);
        set.add("BB");
        set.add(new Person("Tom",3));
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    @Test
    public void test2(){

    }
}

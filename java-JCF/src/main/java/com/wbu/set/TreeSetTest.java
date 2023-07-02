package com.wbu.set;

import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @auther 11852
 * @create 2023/6/16
 */
public class TreeSetTest {
    @Test
    public void test(){
        Set set = new TreeSet();
        set.add("AA");
        set.add("BB");
        set.add("CC");
        set.add("DD");
        set.add("EE");
        set.add("FF");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

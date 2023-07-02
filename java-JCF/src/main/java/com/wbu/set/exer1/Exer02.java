package com.wbu.set.exer1;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @auther 11852
 * @create 2023/6/16
 */
public class Exer02 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        while (hashSet.size()<10){
            int random = (int)(Math.random()*(20-1+1)+1);
            hashSet.add(random);
        }
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

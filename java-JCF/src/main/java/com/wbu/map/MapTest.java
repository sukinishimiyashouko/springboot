package com.wbu.map;

import org.junit.Test;

import java.util.*;

/**
 * @auther 11852
 * @create 2023/6/16
 */
public class MapTest {
    @Test
    public void test1(){
        Hashtable hashtable = new Hashtable();
        hashtable.put(1,1);
        System.out.println(hashtable);
    }
    @Test
    public void test2(){
        HashMap hashMap = new HashMap();
        hashMap.put("AA",56);
        hashMap.put("AD",45);
        hashMap.put(12,"AA");
        //方式一 遍历entry集 Set entrySet()
//        Set set = hashMap.entrySet();
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()){
////            System.out.println(iterator.next());
//            Map.Entry entry = (Map.Entry) iterator.next();
//            System.out.println(entry.getKey()+"--->"+entry.getValue());
//        }
        //方式二 遍历entry集 keySet(),getSet()
        Set set = hashMap.keySet();
        for (Object obj:set
             ) {
            System.out.println(obj+"--->"+hashMap.get(obj));
        }
    }
}

package com.wbu.set.exer1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * @auther 11852
 * @create 2023/6/16
 */
public class Exer01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(45);
        arrayList.add(45);
        arrayList.add(97);
        arrayList.add(97);
        arrayList.add(56);
        arrayList.add(56);
        arrayList.add(13);
        arrayList.add(13);
        List list = duplicateList(arrayList);
        System.out.println(list);

    }
    public static List duplicateList(List list){
        /**
         * 方式一
         */
//        HashSet hashSet = new HashSet();
//        for (Object obj:list) {
//            hashSet.add(obj);
//        }
//        ArrayList arrayList = new ArrayList();
//        for (Object obj:hashSet
//             ) {
//            arrayList.add(obj);
//        }
//        return arrayList;
        /**
         * 方式二
         */
        HashSet hashSet = new HashSet(list);
        ArrayList arrayList = new ArrayList(hashSet);
        return arrayList;

    }
}

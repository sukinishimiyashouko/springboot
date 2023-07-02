package com.wbu.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @auther 11852
 * @create 2023/6/16
 */
public class CollectionTest {
    /**
     * add 将元素添加到当前集合
     * addAll（Collection other）: 添加other集合中的所有元素对象到当前集合中
     */
    @Test
    public void test(){
        Collection collection = new ArrayList();
        //add()
        collection.add("AA");
        collection.add(123);
        collection.add("shouko");
        collection.add(new Person("Tom",123));
        System.out.println(collection);
        System.out.println(collection.size());

        Collection collection1 = new ArrayList();
        collection1.add(456);
        collection1.add("abc");
        collection.addAll(collection1);
        System.out.println(collection);
        System.out.println(collection.size());
    }
    /**
     * iterator
     */
    @Test
    public void test1(){
        Collection collection = new ArrayList();
        collection.add("AA");
        collection.add(123);
        collection.add("shouko");
        collection.add(new Person("Tom",123));

        Iterator iterator = collection.iterator();
//        System.out.println(iterator.next());
//        for (int i=0;i<collection.size();i++){
//            System.out.println(iterator.next());
//        }
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());//指针下移 将下移以后的指针返回
//        }
        for (Object obj:collection) {
            System.out.println(obj);
        }
    }
    /**
     * 针对集合来讲，增强for循环的底层仍然使用的是迭代器
     */
}

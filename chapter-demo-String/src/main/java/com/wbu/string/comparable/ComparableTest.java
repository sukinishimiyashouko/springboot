package com.wbu.string.comparable;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @auther 11852
 * @create 2023/6/9
 */
public class ComparableTest {

    /**
     * 方式一:实现Comparable接口的方式
     * 1.具体的类实现Comparable接口
     * 2.重写Comparable接口中的comparaeo（Object o）方法 并指明比较类A的对象的大小的标准
     * 3.创建多个类A的实例,进行大小的比较或排序
     */
    @Test
    public void test1(){
        Product[] arr = new Product[5];
        arr[0]=new Product("IPhone14",6999);
        arr[1]=new Product("IPhone13Pro",6799);
        arr[2]=new Product("IPhone13",6399);
        arr[3]=new Product("IPhone12Pro",6799);
        arr[4]=new Product("IPhone12",4999);
        Arrays.sort(arr);
        for (Product product:arr) {
            System.out.println(product.toString());
        }
    }
    /**
     * 方式二:实现ComparaTo接口的方式
     * 1.创建一个Comparator接口的实现类
     * 2.实现类中重写Comparator接口中的抽象方法compare
     * 3.创建此实现类的对象
     */
    @Test
    public void test2(){
        Product[] arr = new Product[5];
        arr[0]=new Product("IPhone14",6999);
        arr[1]=new Product("IPhone13Pro",6799);
        arr[2]=new Product("IPhone13",6399);
        arr[3]=new Product("IPhone12Pro",6799);
        arr[4]=new Product("IPhone12",4999);

        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Product&&o2 instanceof Product){
                    Product p1 = (Product) o1;
                    Product p2 = (Product) o2;
                    int value = Integer.compare(p1.getPrice(),p2.getPrice());
                    if(value!=0){
                        return value;
                    }
                    return p1.getName().compareTo(p2.getName());
                }
                throw new RuntimeException("类型不匹配");
            }
        };
        Arrays.sort(arr,comparator);
        for (Product product:
             arr) {
            System.out.println(product);
        }
    }
}

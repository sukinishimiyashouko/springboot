package com.wbu.list.exer2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @auther 11852
 * @create 2023/6/16
 */
public class ListTest {
    public static void main(String[] args) {

        //随机生成30个字符，存放在ArrayList中
        List list = new ArrayList();
        for (int i = 0; i < 30; i++) {
            //'a'-'z' [97,122]
            list.add((char)(Math.random()*(122-97+1)+97)+"");
        }
        System.out.println(list);
        int aCount = listTest(list,"a");
        System.out.println("a:"+aCount);

    }
    //通过ArrayList 查找指定的元素出现的次数
    public static int listTest(Collection list,String s){
        int count = 0;
        for (Object obj:list
             ) {
            if (s.equals(obj)){
                count++;
            }
        }
        return count;
    }
}

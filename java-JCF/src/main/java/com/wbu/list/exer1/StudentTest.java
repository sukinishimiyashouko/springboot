package com.wbu.list.exer1;

import java.util.*;

/**
 * @auther 11852
 * @create 2023/6/16
 */
public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List list = new ArrayList();

        System.out.println("请输入学生的信息");
        while (true){
            System.out.println("1:继续录入，0:结束录入");
            int selection = scanner.nextInt();
            if (selection==0){
                System.out.println("退出成功");
                break;
            }
            System.out.print("请输入学生的姓名: ");
            String name = scanner.next();
            System.out.print("请输入学生的年龄: ");
            int age = scanner.nextInt();

            Student student = new Student(name, age);
            list.add(student);

        }
        //遍历
        System.out.println("遍历学生信息: ");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        for (Object o:list
//             ) {
//            System.out.println(o);
//        }
        scanner.close();
    }
}

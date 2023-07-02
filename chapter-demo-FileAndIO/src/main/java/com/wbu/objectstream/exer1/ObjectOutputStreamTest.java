package com.wbu.objectstream.exer1;

import org.junit.Test;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @auther 11852
 * @create 2023/6/10
 */
public class ObjectOutputStreamTest {
    /**
     *  序列化过程:使用ObjectOutputStream流实现,将内存中的java对象保存到文件中或通过网络传输出去
     */
    @Test
    public void test1() throws IOException {
        File file = new File("object.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeUTF("江汉如此多娇");
        objectOutputStream.flush();
        objectOutputStream.close();
    }
    /**
     * 反序列化过程:使用ObjectInputStream流实现,将文件中的数据或网络传输过来的数据还原为内存中的Java对象
     */
    @Test
    public void test2() throws IOException {
        File file = new File("object.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        /**
         * 反序列化
         */
        String s = objectInputStream.readUTF();
        System.out.println(s);
        objectInputStream.close();
    }
    /**
     * 自定义类的序列化和反序列化的过程
     */
    @Test
    public void test3() throws IOException {
        File file = new File("object1.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        Person person = new Person("Tom",12);
        objectOutputStream.writeObject(person);
        objectOutputStream.flush();
        objectOutputStream.close();
    }

    @Test
    public void test4() throws IOException, ClassNotFoundException {
        File file = new File("object1.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
//        Person person = new Person("Tom",12);
        Person person = (Person) objectInputStream.readObject();
        System.out.println(person);
        objectInputStream.close();
    }
    @Test
    public void test5() throws FileNotFoundException, ParseException {
        System.out.println("。。。。。。。。。。");
//        Scanner scanner = new Scanner(System.in);
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hhmmss");
//        String format = simpleDateFormat.format(new Date());
//
////        Date date = new Date();
//        Date parse = simpleDateFormat.parse(format);
//        System.out.println(parse);

        PrintStream printStream = new PrintStream(new FileOutputStream("hello.txt",true));
        printStream.print("\n"+123);
        printStream.close();
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String s = null;
//        try {
//            while ((s=bufferedReader.readLine())!=null){
//                if ("e".equalsIgnoreCase(s)||"exit".equalsIgnoreCase(s)){
//                    System.out.println("安全退出");
//                    break;
//                }
//                System.out.println("--->:"+s.toUpperCase());
//                System.out.println("继续输入信息:");
//            }
//        }catch (IOException e){
//            e.printStackTrace();
//        }finally {
//            try {
//                if (bufferedReader!=null){
//                    bufferedReader.close();
//                }
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
    }

    public static void main(String[] args) {
        System.out.println("。。。。。。。。。。");
//        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            while ((s=bufferedReader.readLine())!=null){
                if ("e".equalsIgnoreCase(s)||"exit".equalsIgnoreCase(s)){
                    System.out.println("安全退出");
                    break;
                }
                System.out.println("--->:"+s.toUpperCase());
                System.out.println("继续输入信息:");
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (bufferedReader!=null){
                    bufferedReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

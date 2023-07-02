1.List接口中存储数据的特点:用于存储有序的、可以重复的数据。---->使用List替代数组，动态数组

2.List中的常用方法
Collection中生命的15个方法
List是有序的，进而就有索引，进而会增加一些针对索引的方法


3.List及其实现类的区别
java.util.Collection:存储一个一个的数据
    子接口：List:存储有序的、可重复的数据（动态数组）
        ArrayList（主要实现类；线程不安全、效率高） 在添加查找数据时效率高；在插入删除数据时效率低
        Vector (古老实现类；线程安全、效率低) 
        LinkedList 底层使用双向链表的方式进行存储 在插入删除数据时效率高，在添加查找数据时效率低 

ArrayList、Vector的区别？


ArrayList、LinkedList的区别？
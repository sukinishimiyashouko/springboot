1.Map及实现类对比
java.util.Map:存储一对一对的数据（key-value）
    HashMap(主要实现类) 线程不安全效率高 可以添加null的key和value值 底层使用数组+单向链表+红黑树结构存储
        LinkedHashMap 是hashMap的子类；在HashMap使用的数据结构的基础上，增加了一对双向链表，用于记录添加的元素的先后顺序
                                     进而在遍历元素时就可以按照添加的顺序显示   
    Hashtable 古老实现类 线程安全效率低 不可以添加null的key或value值 底层使用数组+单向链表存储
    TreeMap 底层使用红黑树存储，可以按照添加的key-value中的key元素指定的属性的大小顺序进行排序
    Properties                                                           

面试题:区别HashMap和Hashtable 区别HashMap和LinkedHashMap HashMap的底层实现(1. new HashMap()  2. put(key,value))
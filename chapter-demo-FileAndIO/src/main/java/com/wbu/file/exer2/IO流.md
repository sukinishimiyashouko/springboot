IO流的分类
->流向的不同 输入流 输出流
->处理单位的不同 字节流 字符流
->流的角色不同 节点流 处理流

字节流://输入流inputStream //输出流outputStream
字符流://输入流Reader //输出流Writer
以上均为抽象基类 不会对其造对象

抽象基类           4个节点流           封装处理      4个缓冲流（处理流的一种）
InputStream      FileInputStream    <------     BufferedInputStream  
OutputStream     FileOutputStream   <------     BufferedOutputStream
Reader           FileReader         <------     BufferedReader(readLine读取一行文本中的数据)
Writer           FileWriter         <------     BufferedWriter(flush 刷新)       

缓冲流的作用:提升文档读写的效率

（缓冲流增加效率）
字节流一般处理非文本文件

字符流一般处理文本文件
readLine()每次读取一行文本中的数据，返回的字符串不包含换行符
flush()刷新的方法。每次调用此方法时，就会主动的将内存中的数据写出到磁盘文件中

转换流：
1.作用 实现字节与字符之间的转换
2.API 
    InputStreamReader:将一个输入型的字节流转换为输入型的字符流
    OutputStreamWriter:将一个输出型的字符流转换为输出型的字节流

在内存中char占2个字节
在存储文件中一个字符占一个字节
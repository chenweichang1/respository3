package day09;

import java.io.File;

public class Demo05File {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator); // 路径分隔符 Window为 ;    Linux为 :
        System.out.println("=======================");

        String separator = File.separator;
        System.out.println(separator); // 文件名称分隔符  Window为 \    Linux为 /
        System.out.println("=========================");

        show01();
        System.out.println("===================");
        show02("D:\\", "a.txt");
        System.out.println("===================");
        shouw03();
    }

    private static void shouw03() {
        File parent = new File("C:\\");
        File file = new File(parent, "hello.java");
        System.out.println(file); // C:\hello.java
    }

    private static void show02(String parent, String child) {
        File file = new File(parent, child);
        System.out.println(file);  // D:\a.txt
    }

    private static void show01() {
        File file = new File("E:\\Javastudy\\a.txt");
        System.out.println(file); // E:\Javastudy\a.txt

        File file1 = new File("E:\\Javastudy");
        System.out.println(file1); // E:\Javastudy

        File file2 = new File("b.txt");
        System.out.println(file2); // b.txt
    }
}

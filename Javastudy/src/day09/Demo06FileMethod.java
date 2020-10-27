package day09;

import java.io.File;

public class Demo06FileMethod {
    public static void main(String[] args) {
        show01();
        System.out.println("=================");
        show02();
        System.out.println("=================");
        show03();
        System.out.println("=================");
        show04();
    }

    private static void show04() {
        File file = new File("E:\\Javastudy\\Test.iml");
        System.out.println(file.length()); // 433字节
        File file1 = new File("E:\\Javastudy\\Test大苏打萨达.iml");
        System.out.println(file1.length()); // 433字节
    }

    private static void show03() {
        File file = new File("E:\\Javastudy");
        System.out.println(file.getName());
    }

    private static void show02() {
        File file = new File("E:\\Javastudy");
        File file1 = new File("a.txt");
        System.out.println(file.getPath()); // E:\Javastudy
        System.out.println(file.toString());// E:\Javastudy
        System.out.println(file);// E:\Javastudy
        System.out.println(file1.getPath()); // a.txt
    }

    private static void show01() {
        File file = new File("E:\\Javastudy");
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);  // E:\Javastudy

        File file1 = new File("a.txt");
        System.out.println(file1.getAbsolutePath()); // E:\Javastudy\a.txt
    }
}

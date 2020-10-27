package day09;

import java.io.File;

public class Demo07FileMethod {
    public static void main(String[] args) {
        show01();
        System.out.println("===================");
        show02();
    }

    private static void show02() {
        File file = new File("E:\\Javastudy"); // 目录
        System.out.println(file.isDirectory());

        File file1 = new File("Test.iml"); // 文件
        System.out.println(file1.isFile());
    }

    private static void show01() {
        File file = new File("E:\\Javastudy");
        System.out.println(file.exists());

        File file1 = new File("E:\\Javastudy1");
        System.out.println(file1.exists());

        File file2 = new File("a.txt"); // 相对路径 E:\Javastudy\a.txt
        System.out.println(file2.exists());
    }
}

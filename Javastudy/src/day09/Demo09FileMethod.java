package day09;

import java.io.File;

public class Demo09FileMethod {
    public static void main(String[] args) {
        show1();
        System.out.println("======================");
        show2();
    }

    private static void show2() {
        File file = new File("E:\\BaiduNetdiskDownload");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }

    private static void show1() {
        File file = new File("E:\\BaiduNetdiskDownload");
        String[] list = file.list();
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}

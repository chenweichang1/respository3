package day10;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class Demo10Properties {
    public static void main(String[] args) throws IOException {
        show01();
        System.out.println("======================");
        show02();
        System.out.println("======================");
        show03();
    }

    private static void show03() throws IOException {
        Properties properties = new Properties();
//        properties.load(new FileInputStream("D:\\a.txt")); // 字节流读中文乱码
        properties.load(new FileReader("D:\\a.txt"));// 字符流
        Set<String> set = properties.stringPropertyNames();
        for (String key : set) {
            String value = properties.getProperty(key);
            System.out.println(key + "->" + value);
        }
    }

    private static void show02() throws IOException {
        Properties properties = new Properties();
        properties.setProperty("小红", "166");
        properties.setProperty("小黑", "168");
        properties.setProperty("小蓝", "172");
//        properties.store(new FileOutputStream("D:\\b.txt"), ""); // 字节流不可以写中文
        FileWriter fileWriter = new FileWriter("D:\\a.txt"); // 字符流可以写中文
        properties.store(fileWriter, "save data");
        fileWriter.close();

    }

    private static void show01() {
        Properties properties = new Properties();
        properties.setProperty("赵丽颖", "166");
        properties.setProperty("迪丽热巴", "168");
        properties.setProperty("古力娜扎", "172");
        Set<String> set = properties.stringPropertyNames();
        for (String key : set) {
            String value = properties.getProperty(key);
            System.out.println(key + "->" + value);
        }
    }
}

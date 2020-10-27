package day04;

import java.util.ArrayList;

public class Demo06Foreach {
    public static void main(String[] args) {
        demo01();
        System.out.println("======================");
        demo02();
    }

    private static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        for (String i :
                list) {
            System.out.println(i);
        }
    }

    private static void demo01() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i :
                arr) {
            System.out.println(i);
        }
    }
}

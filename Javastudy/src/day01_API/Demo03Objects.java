package day01_API;

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
//        String s1 = "abc";
        String s1 = null; //NullPointerException
        String s2 = "abc";
//        System.out.println(s1.equals(s2));

        boolean equals = Objects.equals(s1, s2); //Objects类的equals方法：对两个对象进行比较，防止空指针异常
        System.out.println(equals);
    }
}

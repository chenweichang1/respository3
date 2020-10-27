package day04;

import java.util.ArrayList;

public class Demo03Integer {
    public static void main(String[] args) {
        /*构造方法*/
        Integer integer1 = new Integer(100);
        System.out.println(integer1);
        Integer integer2 = new Integer("1000");
        System.out.println(integer2);


        /*静态方法*/
        Integer integer3 = Integer.valueOf(800);
        System.out.println(integer3);
        Integer integer4 = Integer.valueOf("800");
        System.out.println(integer4);


        int i = integer4.intValue();
        System.out.println(i);


        Integer in = 88; //自动装箱
        in = in + 800;  //自动拆箱

        ArrayList<Integer> list = new ArrayList<>();
        list.add(66);  //自动装箱
//        Integer integer = list.get(0);
        int integer = list.get(0);  //自动拆箱
        System.out.println(integer);

        /*基本类型与字符串之间的转换*/
        /*基本类型 -> 字符串*/
        String s1 = 100 + "";
        System.out.println(s1+200);

        String s2 = Integer.toString(88);
        System.out.println(s2+66);

        String s3 = String.valueOf(11);
        System.out.println(s3+22);
        /*基本类型 <- 字符串*/
        int parseInt = Integer.parseInt("66");
        System.out.println(parseInt+22);
    }
}

package day01_API;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Demo01ToString {
    public static void main(String[] args) {
        Person p = new Person("陈伟昌", 24);
        String s = p.toString();
        System.out.println(s);
        System.out.println(p);


        Random r = new Random();  //没有重写toString方法
        System.out.println(r);


        Scanner sc = new Scanner(System.in);
        System.out.println(sc);


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
    }
}
package day03;

import java.util.Calendar;
import java.util.Date;

public class Demo02Calendar {
    public static void main(String[] args) {
        demo01();
        System.out.println("=========================");
        demo02();
        System.out.println("=========================");
        demo03();
        System.out.println("=========================");
        demo04();
    }


    private static void demo01() {
        Calendar calendar = Calendar.getInstance();
//        int year = calendar.get(Calendar.YEAR);
        int year = calendar.get(1);
        System.out.println(year);
//        int month = calendar.get(Calendar.MONTH);
        int month = calendar.get(2);
        System.out.println(month+1);  //西方月份0-11
//        int day = calendar.get(Calendar.DATE);
        int day = calendar.get(5);
        System.out.println(day);

    }
    private static void demo02() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1,8888);
        System.out.println(calendar.get(1));
        calendar.set(8888,8,8);
        System.out.println(calendar.get(1));
        System.out.println(calendar.get(2));
        System.out.println(calendar.get(5));
    }
    private static void demo03() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(1,60);
        System.out.println(calendar.get(1));
    }
    private static void demo04() {
        Calendar calendar = Calendar.getInstance();
        Date time = calendar.getTime();
        System.out.println(time);
    }
}

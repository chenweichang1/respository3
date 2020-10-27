package day02;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }
    /*Date类的空参数构造方法
        Date():获取的是当前系统的日期和时间
    */
    private static void demo01() {
        Date date1 = new Date();
        System.out.println(date1);
    }
    /*Date类的带参数构造方法
        Date(long date):传递毫秒值，把毫秒转换为Date日期
    */
    private static void demo02() {
        Date date2 = new Date(0L);
        System.out.println(date2);  //Thu Jan 01 08:00:00 CST 1970
    }
    /*Long getTime()：日期转换为毫秒   相当于   System.currentTimeMillis()
    ----Date类的成员方法
        返回自1970年1月1日00：00：00的毫秒数
    */
    private static void demo03() {
        Date date3 = new Date();
        System.out.println(date3.getTime());
    }
}

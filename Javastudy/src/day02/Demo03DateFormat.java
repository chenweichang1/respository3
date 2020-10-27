package day02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo03DateFormat {
    public static void main(String[] args) throws ParseException {
        demo01();
        System.out.println("=============================");
        demo02();
    }


    private static void demo01() {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        String text = sdf.format(date);   //format方法
        System.out.println(date);
        System.out.println(text);
    }

    private static void demo02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = sdf.parse("2020年10月08日 21时07分55秒");  //parse方法
        System.out.println(date);
    }
}

package day02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo04Exercise {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期, 格式为yyyy-MM-dd");
        String birth = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthDate = sdf.parse(birth);
        long birthDateTime = birthDate.getTime();
        long todayTime = new Date().getTime();
        long days = (todayTime - birthDateTime) / 100 / 60 / 60 / 24;
        System.out.println(days);
    }
}

package day07;

import java.util.Scanner;

public class Demo01RegisterException {
    static String[] usernames = {"张三", "李四", "王五", "赵六"};


    public static void main(String[] args) /*throws RegisterException*/ {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您想要注册的用户名：");
        String username = scanner.next();
        check(username);
    }

    public static void check(String username) /*throws RegisterException*/ {
        for (String s : usernames) {
            if (s.equals(username)) {
                try {
                    throw new RegisterException("注册失败");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
        System.out.println("恭喜你，注册成功！用户名为：" + username);
    }
}

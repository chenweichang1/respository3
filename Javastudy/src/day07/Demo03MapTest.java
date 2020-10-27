package day07;

import java.util.HashMap;
import java.util.Scanner;

public class Demo03MapTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String string = scanner.next();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c :
                string.toCharArray()) {
            if (hashMap.containsKey(c)) {
                Integer value = hashMap.get(c);
                value++;
                hashMap.put(c, value);
            } else {
                hashMap.put(c, 1);
            }
        }
        for (Character key :
                hashMap.keySet()) {
            Integer value = hashMap.get(key);
            System.out.println(key + ":" + value + " 次");
        }
    }
}

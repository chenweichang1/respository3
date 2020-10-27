package day05;

import java.util.ArrayList;
import java.util.List;

public class Demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list);
        // 在c和d之间添加一个banana元素
        list.add(3, "banana");
        System.out.println(list);
        //移除并返回c元素
        System.out.println("被移除的元素：" + list.remove(2));
        System.out.println(list);
        //把最后一个a替换为apple
        list.set(4, "apple");
        System.out.println(list);

        String s = list.get(2);
        System.out.println(s);

        for (String s1 :
                list) {
            System.out.println(s1);
        }
    }
}

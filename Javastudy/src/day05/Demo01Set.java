package day05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo01Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
//        set.add(1);   Set接口不允许存储重复的元素
        //遍历
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);  // 1, 2 ,3 -> 有序
        }
    }
}

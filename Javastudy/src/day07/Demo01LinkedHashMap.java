package day07;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("c", "C");
        map.put("b", "b");
        map.put("a", "d");
        System.out.println(map);  //无序，key不允许重复

        LinkedHashMap<String, String> map1 = new LinkedHashMap<>();
        map1.put("a", "a");
        map1.put("c", "C");
        map1.put("b", "b");
        map1.put("a", "d");
        System.out.println(map1);//有序，key不允许重复
    }
}

package day06;

import java.util.HashMap;
import java.util.Map;

public class Demo01Map {
    public static void main(String[] args) {
        show01();
        System.out.println("==============");
        show02();
        System.out.println("==============");
        show03();
        System.out.println("==============");
        show04();
    }

    private static void show04() {
        Map<String, Integer> map4 = new HashMap<>();
        map4.put("cwc", 1996);
        map4.put("hxm", 1977);
        boolean bool = map4.containsKey("cwc");
        System.out.println(bool);
    }

    private static void show03() {
        Map<String, Integer> map3 = new HashMap<>();
        map3.put("cwc", 1996);
        map3.put("hxm", 1977);
        Integer cwc = map3.get("cwc");
        System.out.println(cwc);
    }

    private static void show02() {
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("cwc", 1996);
        map2.put("hxm", 1977);
        Integer remove = map2.remove("hxm");
        System.out.println(remove);
    }

    private static void show01() {
        Map<String, String> map1 = new HashMap<>();
        String v1 = map1.put("cwc", "fty");
        System.out.println(v1);
        String v2 = map1.put("cwc", "Fty");
        System.out.println(v2);
        map1.put("hxm", "yy");
        System.out.println(map1);
    }
}

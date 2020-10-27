package day07;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
        show01();
        System.out.println("============================");
        show02();
    }

    private static void show02() {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("张三", 18), "北京");
        map.put(new Person("李四", 19), "上海");
        map.put(new Person("王五", 20), "广州");
        map.put(new Person("张三", 18), "深圳");
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry :
                set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "-->" + value);
        }
    }

    private static void show01() {
        HashMap<String, Person> map = new HashMap<>();
        map.put("北京", new Person("张三", 18));
        map.put("上海", new Person("李四", 19));
        map.put("广州", new Person("王五", 20));
        map.put("北京", new Person("赵六", 28));
        Set<String> set = map.keySet();
        for (String key :
                set) {
            Person value = map.get(key);
            System.out.println(key + "-->" + value);
        }
    }
}

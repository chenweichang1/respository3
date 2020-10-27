package day06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo02KeySet {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("赵丽颖", 168);
        hashMap.put("谭松韵", 165);
        hashMap.put("林志玲", 175);

        Set<String> set = hashMap.keySet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = hashMap.get(key);
            System.out.println(key + ":" + value + "cm");
        }
        System.out.println("=============================");
        for (String key :
                set) {
            Integer value = hashMap.get(key);
            System.out.println(key + "->" + value + "cm");
        }
    }
}

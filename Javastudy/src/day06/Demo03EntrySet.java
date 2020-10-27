package day06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo03EntrySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("谭松韵", 165);
        map.put("林志玲", 175);
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ":" + value + "cm");
        }
        System.out.println("=============================");
        for (Map.Entry<String, Integer> entry :
                entrySet) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ":" + value + "cm");
        }
    }
}

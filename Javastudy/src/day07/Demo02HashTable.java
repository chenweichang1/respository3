package day07;

import java.util.HashMap;
import java.util.Hashtable;

public class Demo02HashTable {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(null, "a");
        hashMap.put("b", null);
        hashMap.put(null, null);
        System.out.println(hashMap);
        // HashTable集合不能存储Null值
        Hashtable<String, String> hashtable = new Hashtable<>();
//        hashtable.put(null, "a"); // HashTable集合不能存储Null值
//        System.out.println(hashtable);
    }
}

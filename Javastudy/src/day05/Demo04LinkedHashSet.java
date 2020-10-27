package day05;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("www");
        hashSet.add("abc");
        hashSet.add("abc");
        hashSet.add("it");
        System.out.println(hashSet); //无序，不允许重复

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("www");
        linkedHashSet.add("abc");
        linkedHashSet.add("abc");
        linkedHashSet.add("it");
        System.out.println(linkedHashSet);//有序，不允许重复
    }
}

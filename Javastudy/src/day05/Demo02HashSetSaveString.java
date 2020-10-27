package day05;

import java.util.HashSet;

public class Demo02HashSetSaveString {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add("重地");
        hashSet.add("通话");
        hashSet.add("abc");
        System.out.println(hashSet);
    }
}

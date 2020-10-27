package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Demo04Collection {
    public static void main(String[] args) {
//        Collection<String> collection = new ArrayList<>();//多态
        Collection<String> collection = new HashSet<>(); //HashSet<>()无序集合
        System.out.println(collection);
        collection.add("梅西");
        collection.add("C罗");
        collection.add("卡卡");
        collection.add("本泽马");
        collection.add("贝尔");
        collection.add("武磊");
        System.out.println(collection);
        collection.remove("梅西");
        System.out.println(collection);
        boolean bool1 = collection.contains("梅西");
        System.out.println(bool1);
        System.out.println(collection.size());
        Object[] objects = collection.toArray();
        System.out.println(Arrays.toString(objects));
        collection.clear();
        System.out.println(collection);
        boolean bool2 = collection.isEmpty();
        System.out.println(bool2);
    }
}

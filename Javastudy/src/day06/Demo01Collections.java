package day06;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("a");
//        arrayList.add("b");
//        arrayList.add("c");
//        arrayList.add("d");
//        arrayList.add("e");
        Collections.addAll(arrayList, "a", "b", "c", "d", "e");
        System.out.println(arrayList);
    }
}

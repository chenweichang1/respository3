package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo05Iterator {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("乔丹");
        collection.add("邓肯");
        collection.add("卡特");
        collection.add("麦迪");
        collection.add("哈登");
        Iterator<String> iterator = collection.iterator();
        /*System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());*/
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.print(next + "  ");
        }
    }
}

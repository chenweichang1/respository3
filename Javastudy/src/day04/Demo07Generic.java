package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Demo07Generic {
    public static void main(String[] args) {
        show1();
        System.out.println("=================");
        show2();
        System.out.println("=================");
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Gali");
        list2.add("Gai");
        printList(list1);
        System.out.println("==============");
        printList(list2);
    }

    private static void printList(ArrayList<?> list) {
//        System.out.println(list);
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }

    private static void show2() {
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("赵云");
        list2.add("曹孟德");
        Iterator it2 = list2.iterator();
        while (it2.hasNext()){
            Object obj2 = it2.next();
            String str = (String)obj2;
            System.out.println(str+"->"+str.length());
        }
    }

    private static void show1() {
        ArrayList list1 = new ArrayList();
        list1.add("abc");
        list1.add(123);
        Iterator it1 = list1.iterator();
//        boolean b1 = it1.hasNext();
//        System.out.println(b1);
//        Object next1 = it1.next();
//        System.out.println(next1);
//        boolean b2 = it1.hasNext();
//        System.out.println(b2);
//        Object next2 = it1.next();
//        System.out.println(next2);
//        boolean b3 = it1.hasNext();
//        System.out.println(b3);
        while (it1.hasNext()){
            Object obj1 = it1.next();
            System.out.println(obj1);
            /*String s = (String)obj;
            System.out.println(s.length());*/
        }
    }


}

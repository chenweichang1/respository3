package day05;

import java.util.LinkedList;

public class Demo02LinkedList {
    public static void main(String[] args) {
        show01();
        System.out.println("============");
        show02();
        System.out.println("============");
        show03();
    }

    private static void show03() {
        LinkedList<String> linkedList3 = new LinkedList<>();
        linkedList3.add("陈");
        linkedList3.add("伟");
        linkedList3.add("昌");
//        String removeFirst = linkedList3.removeFirst();
        String removeFirst = linkedList3.pop();
        System.out.println(removeFirst);
        String removeLast = linkedList3.removeLast();
        System.out.println(removeLast);
        System.out.println(linkedList3);

    }

    private static void show02() {
        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.add("陈");
        linkedList2.add("伟");
        linkedList2.add("昌");
        String first = linkedList2.getFirst();
        System.out.println(first);
        String last = linkedList2.getLast();
        System.out.println(last);
    }

    private static void show01() {
        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.add("陈");
        linkedList1.add("伟");
        linkedList1.add("昌");
        System.out.println(linkedList1);
//        linkedList1.addFirst("chen");
        linkedList1.push("chen");
        System.out.println(linkedList1);
        linkedList1.addLast("加油");
        System.out.println(linkedList1);
    }
}

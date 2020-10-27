package day06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 89794894, 645, 644, 45465, 32131, 45);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        ArrayList<Person> personArrayList = new ArrayList<>();
        Person person1 = new Person("cwc", 24);
        Person person2 = new Person("fty", 23);
        Collections.addAll(personArrayList, person1, person2);
        System.out.println(personArrayList);
        Collections.sort(personArrayList);   //实现 Comparable  重写 compareTo
        System.out.println(personArrayList);

        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 15616156, 156213, 64, 4545, 231, 45);
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2; //升序
            }
        });
        System.out.println(arrayList);

        ArrayList<Student> studentArrayList = new ArrayList<>();
        Collections.addAll(studentArrayList, new Student("cwc", 24), new Student("fty", 23));
        System.out.println(studentArrayList);
        Collections.sort(studentArrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(studentArrayList);
    }
}

package day09;

import java.util.Arrays;
import java.util.Comparator;

public class Demo03Arrays {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("cwc", 24),
                new Person("fty", 23),
                new Person("aaa", 18),
        };

        Arrays.sort(arr, (o1, o2) -> o1.getAge() - o2.getAge());

        for (Person person : arr) {
            System.out.println(person);
        }
    }
}

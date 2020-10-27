package day05;

import java.util.HashSet;

public class Demo03HashSetSavePerson {
    public static void main(String[] args) {
        HashSet<Person> personHashSet = new HashSet<>();
        Person person1 = new Person("小美女", 18);
        Person person2 = new Person("小美女", 18);
        Person person3 = new Person("小美女", 19);
        personHashSet.add(person1);
        personHashSet.add(person2);
        personHashSet.add(person3);
        System.out.println(personHashSet);
    }
}

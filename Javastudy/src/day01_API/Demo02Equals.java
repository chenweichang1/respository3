package day01_API;

public class Demo02Equals {
    public static void main(String[] args) {
        Person p1 = new Person("迪丽热巴", 18);
        Person p2 = new Person("迪丽热巴", 18);
        boolean b = p1.equals(p2);
        System.out.println(b);
    }
}

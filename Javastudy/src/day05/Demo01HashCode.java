package day05;

public class Demo01HashCode {
    public static void main(String[] args) {
        Person person1 = new Person();
        int code1 = person1.hashCode();
        System.out.println(code1);
        System.out.println(person1);

        Person person2 = new Person();
        int code2 = person2.hashCode();
        System.out.println(code2);
        System.out.println(person2);

        System.out.println(person1 == person2);

        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());//96354
        System.out.println(s2.hashCode());//96354

        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395
    }
}

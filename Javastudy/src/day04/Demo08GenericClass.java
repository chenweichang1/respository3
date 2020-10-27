package day04;

public class Demo08GenericClass {
    public static void main(String[] args) {
        GenericClass genericClass1 = new GenericClass();
        genericClass1.setName("陈伟昌");
        Object obj = genericClass1.getName();
        System.out.println(obj);

        GenericClass<Integer> genericClass2 = new GenericClass<>();
        genericClass2.setName(7);
        Integer name = genericClass2.getName();
        System.out.println(name);

        GenericClass<String> genericClass3 = new GenericClass();
        genericClass3.setName("冯婷宇");
        String name1 = genericClass3.getName();
        System.out.println(name1);


    }
}

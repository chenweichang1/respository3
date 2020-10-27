package day04;

public class Demo10GenericInterface {
    public static void main(String[] args) {
        GenericInterfaceImpl1 genericInterfaceImpl1 = new GenericInterfaceImpl1();
        genericInterfaceImpl1.method("这是雾都！！");
        System.out.println("=========================");
        GenericInterfaceImpl2<Integer> genericInterfaceImpl2 = new GenericInterfaceImpl2<>();
        genericInterfaceImpl2.method(666);
        GenericInterfaceImpl2<String> genericInterfaceImpl2_1 = new GenericInterfaceImpl2<>();
        genericInterfaceImpl2_1.method("CDC");

    }
}

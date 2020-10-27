package day04;

public class Demo09GenericMethod {
    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.method1("我打打打打打打打打");
        genericMethod.method1(888);
        genericMethod.method1(false);
        System.out.println("===========================");
        /*genericMethod.method2("我躲躲躲躲躲躲躲躲");//不建议通过对象使用
        genericMethod.method2(6.6);*/
        GenericMethod.method2("我勒个去！！！！");
        GenericMethod.method2(666);
    }
}

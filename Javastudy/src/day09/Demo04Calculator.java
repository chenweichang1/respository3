package day09;

public class Demo04Calculator {
    public static void main(String[] args) {
        invokeCalc(666, 222, (a, b) -> a + b);
    }

    public static void invokeCalc(int a, int b, Calculator calculator) {
        int sum = calculator.calc(a, b);
        System.out.println(sum);
    }
}
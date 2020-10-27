package day10;

public class Demo01Recursion {
    public static void main(String[] args) {
        System.out.println(sum(100));
    }

    private static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}
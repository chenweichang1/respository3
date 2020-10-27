package day10;

public class Demo02Recursion {
    public static void main(String[] args) {
        System.out.println(jieCheng(5));
    }

    private static int jieCheng(int n) {
        if (n == 1) {
            return 1;
        }
        return n * jieCheng(n - 1);
    }
}
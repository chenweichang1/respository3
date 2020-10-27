package day06;

public class Demo01VarArgs {
    public static void main(String[] args) {
        int result = add(1, 2, 7, 6, 5, 45, 6, 456, 46, 456, 46, 4);
        System.out.println(result);
    }

    private static int add(int ... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}

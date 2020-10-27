package day08;

public class Demo03Sleep {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i < 61; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}

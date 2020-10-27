package day09;

public class Demo02Cook {
    public static void main(String[] args) {
        invokeCook(() -> System.out.println("Go to dinner!"));
    }

    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}

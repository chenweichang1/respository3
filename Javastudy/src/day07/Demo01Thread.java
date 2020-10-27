package day07;

public class Demo01Thread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        /*抢占式调度*/
        for (int i = 0; i < 20; i++) {
            System.out.println("main: " + i);
        }
    }
}
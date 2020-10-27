package day08;

public class Demo01GetThreadName {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        MyThread thread1 = new MyThread();
        thread1.start();

        MyThread thread2 = new MyThread();
        thread2.start();

        System.out.println(Thread.currentThread().getName()); // 主线程
    }
}

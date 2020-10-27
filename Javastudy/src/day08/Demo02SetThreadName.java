package day08;

public class Demo02SetThreadName {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.setName("陈伟昌");
        thread.start();

        MyThread thread1 = new MyThread("冯婷宇");
        thread1.start();
    }
}

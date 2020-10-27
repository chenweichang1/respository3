package day08;

public class MyThread extends Thread {
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
//        String name = getName();
//        System.out.println(name);

//        Thread currentThread = Thread.currentThread();
//        System.out.println(currentThread);

        System.out.println(Thread.currentThread().getName());
    }
}

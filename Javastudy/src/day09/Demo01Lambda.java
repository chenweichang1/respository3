package day09;

public class Demo01Lambda {
    public static void main(String[] args) {
        //使用匿名内部类的方式实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "多线任务执行！");
            }
        }).start();

        //Lambda
        new Thread(() -> System.out.println(Thread.currentThread().getName() + "多线任务执行！")).start();
    }
}
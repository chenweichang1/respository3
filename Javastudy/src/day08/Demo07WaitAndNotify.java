package day08;

public class Demo07WaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread(() -> {
            while (true) {
                synchronized (obj) {
                    System.out.println("顾客1告知老板所需包子的种类和数量");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("顾客1开吃，真香！！");
                    System.out.println("===================");
                }
            }
        }).start();


        new Thread(() -> {
            while (true) {
                synchronized (obj) {
                    System.out.println("顾客2告知老板所需包子的种类和数量");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("顾客2开吃，真香！！");
                    System.out.println("===================");
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(2000); // 花2秒做包子
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj) {
                    System.out.println("您的包子做好了");
                    obj.notifyAll();
                }
            }
        }).start();
    }
}

package day08;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo08ThreadPool {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.submit(new RunnableImpl());
        pool.submit(new RunnableImpl());
        pool.submit(new RunnableImpl());

        pool.shutdown(); // 销毁线程池，不建议使用
    }
}

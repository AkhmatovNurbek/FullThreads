package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author "Akhmatov Nurbek"
 * @since 09/06/22 15:41 (Thursday)
 * multithreading/IntelliJ IDEA
 */
public class SingleThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Runnable runnable = () -> System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 1e5; i++) {
            service.execute(runnable);
        }
    }
}
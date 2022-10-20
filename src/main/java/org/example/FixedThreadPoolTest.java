package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author "Akhmatov Nurbek"
 * @since 09/06/22 15:03 (Thursday)
 * multithreading/IntelliJ IDEA
 */
public class FixedThreadPoolTest {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(10);

        Runnable runnable = () -> {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName());
        };

        for (int i = 0; i < 1e2; i++) {
            service.execute(runnable);
        }
        service.awaitTermination(1, TimeUnit.SECONDS);
        service.shutdown();
        service.awaitTermination(1, TimeUnit.SECONDS);
        service.shutdownNow();
    }
}
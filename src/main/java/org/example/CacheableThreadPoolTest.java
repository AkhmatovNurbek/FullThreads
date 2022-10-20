package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author "Akhmatov Nurbek"
 * @since 09/06/22 15:35 (Thursday)
 * multithreading/IntelliJ IDEA
 */
public class CacheableThreadPoolTest {

    public static void main(String[] args) {
        AtomicInteger poolSize = new AtomicInteger(1);
        ExecutorService service = Executors.newCachedThreadPool();
        Runnable runnable = () -> System.out
                .println(poolSize.getAndIncrement() + " : "
                        + Thread.currentThread().getName());
        for (int i = 0; i < 1e5; i++) {
            service.execute(runnable);
        }
    }

}
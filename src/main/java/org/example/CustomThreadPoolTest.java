package org.example;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author "Akhmatov Nurbek"
 * @since 09/06/22 16:21 (Thursday)
 * multithreading/IntelliJ IDEA
 */
public class CustomThreadPoolTest {
    public static void main(String[] args) {
        ThreadPoolExecutor service =
                new ThreadPoolExecutor(
                        10,
                        60,
                        20,
                        TimeUnit.SECONDS,
                        new LinkedBlockingQueue<Runnable>(100));

        Runnable runnable = () -> {};
        service.execute(runnable);
    }
}
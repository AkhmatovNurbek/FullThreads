package org.example;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author "Akhmatov Nurbek"
 * @since 09/06/22 15:44 (Thursday)
 * multithreading/IntelliJ IDEA
 */
public class ScheduledThreadPoolTest {
    public static void main(String[] args) {

        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
        Runnable runnable = () -> {
            System.out.println("Uzbekiston da soat " + LocalDateTime.now());
        };
        //service.schedule(runnable, 1000, TimeUnit.MILLISECONDS);
//        service.scheduleAtFixedRate(runnable,
//                1000,
//                2000,
//                TimeUnit.MILLISECONDS);


        service.scheduleWithFixedDelay(runnable,
                1000,
                500,
                TimeUnit.MILLISECONDS);


    }
}
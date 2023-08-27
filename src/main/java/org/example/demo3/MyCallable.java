package org.example.demo3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author ming
 * @date 2023.08.27
 * @about
 */
public class MyCallable {
    public static void main(String[] args) {
        Thread3 thread = new Thread3();

        FutureTask<Integer> f = new FutureTask<>(thread);

        Thread t1 = new Thread(f);
        Thread t2 = new Thread(f);
        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}

package org.example.MyThreadPool;

/**
 * @author ming
 * @date 2023.04.21
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + "->" + i);
        }
    }
}

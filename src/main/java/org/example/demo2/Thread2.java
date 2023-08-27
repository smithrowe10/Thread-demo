package org.example.demo2;

/**
 * @author ming
 * @date 2023.08.27
 * @about 线程实现方式2：自己定义一个类实现`Runnable`接口，重写`run`方法；
 */
public class Thread2 implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 100; i++) {
            System.out.println(name + " hello world!");
        }
    }
}

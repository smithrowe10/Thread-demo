package org.example.demo1;

/**
 * @author ming
 * @date 2023.08.27
 * @about 线程实现方式一：自己定义一个继承自`Thread`的类，重写`run`方法；
 */
public class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + " hello world!");
        }
    }
}

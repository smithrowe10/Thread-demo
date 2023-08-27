package org.example.ThreadWaitAndNotify;

/**
 * @author ming
 * @date 2023.04.21
 * 生产者和消费者（等待唤醒机制演示）
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Cook cook = new Cook();
        Foodie foodie = new Foodie();

        cook.start();
        foodie.start();
    }
}

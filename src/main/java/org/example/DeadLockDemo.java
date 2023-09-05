package org.example;

/**
 * @author ming
 * @date 2023.09.04
 * @about
 */
public class DeadLockDemo {
    private static Object resource1 = new Object(); // 资源1
    private static Object resource2 = new Object(); // 资源2

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (resource1) {
                System.out.println(Thread.currentThread().getName() + "获取到了资源：resource1");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "准备获取资源：resource2");
                synchronized (resource2) {
                    System.out.println(Thread.currentThread().getName() + "获取到了资源：resource2");
                }
            }
        }, "线程1").start();

        new Thread(() -> {
            synchronized (resource2) {
                System.out.println(Thread.currentThread().getName() + "获取到了资源：resource2");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "准备获取资源：resource1");
                synchronized (resource1) {
                    System.out.println(Thread.currentThread().getName() + "获取到了资源：resource1");
                }
            }
        }, "线程2").start();
    }
}

package org.example.demo1;

/**
 * @author ming
 * @date 2023.08.27
 * @about
 */
public class MyThread {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.setName("线程1");
        Thread1 t2 = new Thread1();
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}

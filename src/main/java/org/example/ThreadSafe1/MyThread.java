package org.example.ThreadSafe1;

import org.example.demo1.Thread1;

/**
 * @author ming
 * @date 2023.08.27
 * @about
 */
public class MyThread {
    public static void main(String[] args) {
        Thread4 t1 = new Thread4();
        t1.setName("线程1");
        Thread4 t2 = new Thread4();
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}

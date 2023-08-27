package org.example.demo2;

import org.example.demo1.Thread1;

/**
 * @author ming
 * @date 2023.08.27
 * @about
 */
public class MyThread {
    public static void main(String[] args) {
        Thread2 thread = new Thread2();

        Thread t1 = new Thread(thread);
        Thread t2 = new Thread(thread);
        t1.setName("线程1");
        t2.setName("线程2");
        
        t1.start();
        t2.start();
    }
}

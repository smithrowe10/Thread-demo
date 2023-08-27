package org.example.demo3;

import java.util.concurrent.Callable;

/**
 * @author ming
 * @date 2023.08.27
 * @about
 */
public class Thread3 implements Callable<Integer> {
    @Override
    public Integer call() {
        int sum = 100;
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 100; i++) {
            sum--;
            System.out.println(name + " " + sum);
        }
        return sum;
    }
}

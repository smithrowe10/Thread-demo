package org.example.MyThreadPool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ming
 * @date 2023.04.21
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // 创建一个没有上限的线程池对象
//        ExecutorService pool = Executors.newCachedThreadPool();

        // 创建一个有上限的线程池对象
        ExecutorService pool = Executors.newFixedThreadPool(3);

        // 提交任务
        pool.submit(new MyThread());
        pool.submit(new MyThread());

        // 销毁线程池
        pool.shutdown();

    }
}

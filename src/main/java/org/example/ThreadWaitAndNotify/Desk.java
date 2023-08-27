package org.example.ThreadWaitAndNotify;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
控制生产者和消费者执行
 */
public class Desk {

    public static int food_flag = 1; // 0：桌子上没有食物  1：有食物

    public static int count = 100; // 总个数

    public static Object lock = new Object(); // 锁对象
}

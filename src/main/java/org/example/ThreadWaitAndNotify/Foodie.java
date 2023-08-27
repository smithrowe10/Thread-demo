package org.example.ThreadWaitAndNotify;

/**
 * @author ming
 * @date 2023.04.21
 * 消费者线程
 */
public class Foodie extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (Desk.food_flag == 0) {
                        try {
                            Desk.lock.wait(); //调用锁对象的wait方法
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        Desk.count--;
                        System.out.println("开吃！还能吃" + Desk.count + "碗");
                        Desk.food_flag = 0;
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}

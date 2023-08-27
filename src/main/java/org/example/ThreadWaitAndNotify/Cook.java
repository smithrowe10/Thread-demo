package org.example.ThreadWaitAndNotify;

/**
 * @author ming
 * @date 2023.04.21
 * 生产者线程
 */
public class Cook extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (Desk.food_flag == 1) {
                        try {
                            Desk.lock.wait(); // 使用锁对象调用wait方法
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        System.out.println("厨师做了一碗面条");
                        Desk.food_flag = 1;
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}

package org.example.ThreadSafe2;

public class MyRunnable implements Runnable {
    int ticket = 0;// 不需要static关键字，Runnable对象只创建一次

    @Override
    public void run() {
        while (true) {
            if (memthod()) break;
        }
    }

    private synchronized boolean memthod() {
        if (ticket < 100) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticket++;
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票！");
        } else {
            return true;
        }
        return false;
    }
}

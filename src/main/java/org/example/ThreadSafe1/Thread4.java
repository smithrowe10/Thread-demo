package org.example.ThreadSafe1;

/**
 * @author ming
 * @date 2023.08.27
 * @about
 */
public class Thread4 extends Thread {

    // 表示共享ticket数据
    static int ticket = 0;

    //锁对象必须是唯一的（加static关键字
    //表示的MyThread创建的所有对象都共享同一个obj）
    static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (ticket < 100) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(Thread.currentThread().getName() + "正在卖出第" + ticket + "张票！");
                } else {
                    break;
                }
            }
        }
    }
}

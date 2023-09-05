package org.example.MyThreadLocal;

/**
 * @author ming
 * @date 2023.08.28
 * @about
 */
public class ThreadLocalDemo {
    private static final ThreadLocal<Integer> tl = new ThreadLocal<>();

    public static void saveUser(Integer id) {
        tl.set(id);
    }

    public static Integer getUser() {
        return tl.get();
    }

    public static void removeUser() {
        tl.remove();
    }
}

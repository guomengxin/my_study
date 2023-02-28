package test;

import designMode.singleton.lazy.ExectorThread;

public class LazySingletonTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ExectorThread());
        Thread thread2 = new Thread(new ExectorThread());
        Thread thread3 = new Thread(new ExectorThread());
        Thread thread4 = new Thread(new ExectorThread());
        Thread thread5 = new Thread(new ExectorThread());
        Thread thread6 = new Thread(new ExectorThread());

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();

        System.out.println("Exector End");
    }
}

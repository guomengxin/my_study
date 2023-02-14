package singleton.lazy;

import singleton.lazy.LazySimpleSingleton;

public class ExectorThread implements Runnable {

    @Override
    public void run() {
        LazyInnerClassSingleton lazy = LazyInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "|||" + lazy);
    }
}

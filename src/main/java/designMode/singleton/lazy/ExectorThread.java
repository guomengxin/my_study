package designMode.singleton.lazy;

public class ExectorThread implements Runnable {

    @Override
    public void run() {

        LazyInnerClassSingleton lazy = LazyInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "|||" + lazy);
    }
}

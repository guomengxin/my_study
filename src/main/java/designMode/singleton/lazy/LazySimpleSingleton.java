package designMode.singleton.lazy;
//简单的懒汉模式 -- 线程不安全的
public class LazySimpleSingleton {
    private static LazySimpleSingleton lazy = null;

    private LazySimpleSingleton() {
    }

    public static LazySimpleSingleton getInstance() {
        if (lazy == null) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}

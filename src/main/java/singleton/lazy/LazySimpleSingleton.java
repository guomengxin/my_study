package singleton.lazy;

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

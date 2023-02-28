package designMode.singleton.lazy;

import java.io.Serializable;

public class LazyInnerClassSingleton implements Serializable {
    private LazyInnerClassSingleton() {
        String a = "";
        System.out.println(System.currentTimeMillis() + "创建对象");
        if (Lazyhodler.lazy != null) {
            //可以防止反射攻击
            throw new RuntimeException("不允许构建多个实例！！！");
        }
    }
    //只有在外部调用到时才会执行lazyholder内部的逻辑
    public static final LazyInnerClassSingleton getInstance() {
        System.out.println(Thread.currentThread().getName());
        return Lazyhodler.lazy;
    }

    private static class Lazyhodler {
        private static final LazyInnerClassSingleton lazy = new LazyInnerClassSingleton();
    }

    //防止序列化 攻击
    //重写readResolve方法，只不过是覆盖了反序列化出来的对象
    //还是创建了两次，发生在JVM层面，想对来说比较安全
    //之前反序列化出的对象会被GC回收
    private Object readResolve() {
        return Lazyhodler.lazy;
    }
}

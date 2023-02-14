package test;

//类中信息加载的顺序
public class ClassLoadSort {
    public static ClassLoadSort loadSort = new ClassLoadSort("外部类成员变量调用！！！！！");

    public ClassLoadSort(String name) {
        System.out.println(name);
    }

    static {
        ClassLoadSort sort = InnerStaticClass.sort;
        System.out.println("执行静态代码块！！！！");
    }

    private static class InnerStaticClass {
        private static ClassLoadSort sort = new ClassLoadSort("静态内部类调用！！！！！");
        public static InnerStaticClass i = new InnerStaticClass();

        private InnerStaticClass() {
            System.out.println("执行静态内部类的构造函数！！！！");
        }

        static {
            System.out.println("执行静态内部类的静态代码块！！！！");
        }
    }

    private class InnerClass {
        public InnerClass i = new InnerClass();

        private InnerClass() {
            System.out.println("执行静态内部类的构造函数！！！！");
        }

    }
}

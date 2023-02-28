package executeOrder;

public class Test1 extends ParentTest{
    private static NomalClass nomalClass = new NomalClass();
    private NomalClass01 nomalClass01 = new NomalClass01();
    private NomalClass02 nomalClass02 = new NomalClass02();
    public Test1(){
        System.out.println("执行Test1的构造方法");
    }
    {
        System.out.println("执行普通代码块01");
    }
    {
        System.out.println("执行普通代码块02");
    }
    static{
        System.out.println("执行静态代码块01");
    }
    static{
        System.out.println("执行静态代码块02");
    }

    public static void testMethod(){
        System.out.println("执行静态方法");
    }
}

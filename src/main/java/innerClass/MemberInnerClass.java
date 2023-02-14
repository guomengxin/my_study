package innerClass;

/**
 * 成员内部类（可以使静态的）
 * 成员内部类 可以无条件的访问外部类的所有属性和成员方法
 * 成语内部类 调用外部类的同名的成员方法和变量  外部类名.this.方法名   外部类名.this.变量名
 * 要创建一个内部类的对象，提前是必须存在一个外部类的对象
 */
public class MemberInnerClass {
    double radius = 0;
    static int aaa = 111;

    public MemberInnerClass(double radius) {
        this.radius = radius;
    }

    public void outterMethod() {
        System.out.println("外部类方法的调用");
    }

    public class InnerClass {
        String radius = "test";
        String aaa = "test static";

        public void innerMethod() {
            //内部类调用外部类的同名成员外部类名.this.成员名
            System.out.println(MemberInnerClass.this.radius);
            System.out.println(MemberInnerClass.aaa);
            System.out.println(radius);
            System.out.println(aaa);
            outterMethod();
        }
    }

}

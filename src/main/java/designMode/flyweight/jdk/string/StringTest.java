package designMode.flyweight.jdk.string;

/**
 * Created by Tom.
 */
public class StringTest {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        //在编译阶段会做处理，合在一起
        String s3 = "he" + "llo";
        // 会进行内存的重新分配
        String s4 = "hel" + new String("lo");
        //会重新创建一个对象赋值给s5
        String s5 = new String("hello");
        //s5.intern() 获取s5的常量的地址
        String s6 = s5.intern();
        String s7 = "h";
        String s8 = "ello";
        String s9 = s7 + s8;
        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//true
        System.out.println(s1==s4);//false
        System.out.println(s1==s9);//false
        System.out.println(s4==s5);//false
        System.out.println(s1==s6);//true
    }
}

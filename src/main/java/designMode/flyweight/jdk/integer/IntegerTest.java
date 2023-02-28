package designMode.flyweight.jdk.integer;

/**
 * Created by Tom.
 */
public class IntegerTest {
    public static void main(String[] args) {
        //四个整型  在 -128 至 127 之间就会获取缓存
        Integer a = Integer.valueOf(100);
        Integer b = 100;

        Integer c = Integer.valueOf(1000);
        Integer d = 1000;

        System.out.println("a==b:" + (a==b));
        System.out.println("c==d:" + (c==d));

    }
}

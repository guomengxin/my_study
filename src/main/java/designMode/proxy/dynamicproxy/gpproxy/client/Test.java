package designMode.proxy.dynamicproxy.gpproxy.client;


import java.lang.reflect.Constructor;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        try {
            GpMeipo gpMeipo = new GpMeipo();
            Zhangsan test = new Zhangsan("郭孟鑫");

            Constructor<Zhangsan> constructor = Zhangsan.class.getConstructor(String.class);
            Zhangsan test1= constructor.newInstance("郭孟鑫1111");
            test1.findLove();

            test.findLove();
            System.out.println("test:::"+test);
            IPerson zhangsan = gpMeipo.getInstance(test);
            zhangsan.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }

//        IPerson zhaoliu = jdkMeipo.getInstance(new ZhaoLiu());
//        zhaoliu.findLove();
//        zhaoliu.buyInsure();


    }
}

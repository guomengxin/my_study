package designMode.proxy.dynamicproxy.gpproxy.client;

/**
 * Created by Tom.
 */
public class Zhangsan implements IPerson {

    private String abb ;

    public void findLove() {
        System.out.println("。测试：：：："+abb);
        System.out.println("张三要求：肤白貌美大长腿");
    }

    public void buyInsure() {
        System.out.println("30万");
    }

    public Zhangsan(String abb){
        this.abb = abb;
    }
    public Zhangsan(){
    }


}

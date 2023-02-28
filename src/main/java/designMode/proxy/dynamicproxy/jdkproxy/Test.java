package designMode.proxy.dynamicproxy.jdkproxy;


import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        JdkMeipo jdkMeipo = new JdkMeipo();
        IPerson zhangsan = jdkMeipo.getInstance(new Zhangsan());
        zhangsan.findLove();
        byte[] proxybyte = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{IPerson.class});
        try {
            FileOutputStream os = new FileOutputStream("D:\\testFolder\\$Proxy0.class");
            os.write(proxybyte);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

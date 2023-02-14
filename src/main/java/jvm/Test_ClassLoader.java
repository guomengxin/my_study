package jvm;

import sun.misc.Launcher;

import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;

public class Test_ClassLoader {
    public static void main(String[] args) {
         URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        System.out.println("启动类加载器");
        for(URL url : urLs){
            System.out.println("==>"+url.toExternalForm());
        }
        printClassLoader("扩展类加载器",Test_ClassLoader.class.getClassLoader().getParent());
        printClassLoader("扩展类加载器",Test_ClassLoader.class.getClassLoader());
    }

    public static void printClassLoader(String  name, ClassLoader cl){
        if(cl!=null){
            System.out.println(name+" ClassLoader-> "+cl.toString());
            printURLForClassLoader(cl);
        }else{
            System.out.println(name+" ClassLoader-> null");
        }
    }
    public static void printURLForClassLoader(ClassLoader CL){
        Object ucp = insightField(CL, "ucp");
        Object path = insightField(ucp, "path");
        ArrayList ps = (ArrayList) path;
        for(Object p : ps){
            System.out.println("==>"+p.toString());
        }
    }
    private static  Object insightField( Object obj, String fName){
        try {
            Field f = null;
            if(obj instanceof URLClassLoader){
                f = URLClassLoader.class.getDeclaredField(fName);
            }else{
                f = obj.getClass().getDeclaredField(fName);
            }
            f.setAccessible(true);
            return f.get(obj);
        }catch (Exception e){
            return null;
        }
    }
}

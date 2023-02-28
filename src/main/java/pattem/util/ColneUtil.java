package pattem.util;

import java.lang.reflect.Field;

/**
 * 浅克隆
 * 通过反射生成克隆对象，并将对象的成员变量赋值给克隆对象
 */
public class ColneUtil {
    public static  Object copy(Object obj){
        Class clazz = obj.getClass();
        Object copyObj = null;
        try {
            copyObj = clazz.newInstance();
            for(Field field : clazz.getDeclaredFields()){
                field.setAccessible(true);
                field.set(copyObj,field.get(obj));
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return copyObj ;
    }
}

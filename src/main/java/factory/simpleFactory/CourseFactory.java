package factory.simpleFactory;

import factory.ICourse;

public class CourseFactory {
    public ICourse create(Class clzz) {
        try {
            if (null != clzz) {
                return (ICourse) clzz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

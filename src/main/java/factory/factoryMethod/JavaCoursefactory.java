package factory.factoryMethod;

import factory.ICourse;
import factory.JavaCourse;

public class JavaCoursefactory implements IcourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}

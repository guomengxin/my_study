package factory.factorymethod;

import factory.simpleFactory.ICourse;
import factory.simpleFactory.JavaCourse;

public class JavaCoursefactory implements IcourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}

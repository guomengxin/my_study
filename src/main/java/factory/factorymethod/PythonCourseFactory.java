package factory.factorymethod;

import factory.simpleFactory.ICourse;
import factory.simpleFactory.PythonCourse;

public class PythonCourseFactory implements IcourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}

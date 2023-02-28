package factory.factoryMethod;

import factory.ICourse;
import factory.PythonCourse;

public class PythonCourseFactory implements IcourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}

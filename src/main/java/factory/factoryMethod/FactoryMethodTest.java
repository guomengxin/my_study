package factory.factoryMethod;

import factory.ICourse;

public class FactoryMethodTest {
    public static void main(String[] args) {
        IcourseFactory courseFactory = new PythonCourseFactory();
        ICourse course = courseFactory.create();
        course.record();
    }
}

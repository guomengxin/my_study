package factory.factorymethod;

import factory.simpleFactory.ICourse;

public class FactoryMethodTeat {
    public static void main(String[] args) {
        IcourseFactory courseFactory = new PythonCourseFactory();
        ICourse course = courseFactory.create();
        course.record();
    }
}

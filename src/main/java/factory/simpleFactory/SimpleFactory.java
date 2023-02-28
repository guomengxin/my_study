package factory.simpleFactory;

import factory.ICourse;
import factory.JavaCourse;

import java.util.Calendar;

public class SimpleFactory {
    /* public static void main(String[] args) {
         CourseFactory factory = new CourseFactory();
         ICourse course = factory.create("java");
         course.record();

     }*/
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        ICourse course = factory.create(JavaCourse.class);
        course.record();
        Calendar.getInstance();

    }
}

package factory;

public class SiimTest {
    public static void main(String[] args) {
        CourseFactory factory =  new CourseFactory();
        ICourse course = factory.create("java");


    }
}

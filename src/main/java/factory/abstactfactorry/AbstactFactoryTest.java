package factory.abstactfactorry;

/**
 * 抽象工厂并不复核开闭原则
 * 但是易于扩展
 */
public class AbstactFactoryTest {
    public static void main(String[] args) {
        ICourseFactory courseFactory = new JavaCourseFactory();
        courseFactory.createCourse();
        courseFactory.createNote();
        courseFactory.createVideo();
    }
}

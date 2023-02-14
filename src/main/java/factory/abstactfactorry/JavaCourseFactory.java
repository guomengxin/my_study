package factory.abstactfactorry;

import factory.simpleFactory.ICourse;
import factory.simpleFactory.JavaCourse;


public class JavaCourseFactory implements ICourseFactory {

    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }

    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}

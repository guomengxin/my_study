package factory.abstactfactorry;

import factory.simpleFactory.ICourse;

public interface ICourseFactory {
    ICourse createCourse();

    INote createNote();

    IVideo createVideo();
}

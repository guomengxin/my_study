package factory.abstactfactorry;

import factory.ICourse;
//要求所有的子工厂都实现
public interface ICourseFactory {
    ICourse createCourse();

    INote createNote();

    IVideo createVideo();
}

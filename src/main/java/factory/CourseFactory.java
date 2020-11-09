package factory;

public class CourseFactory {
    public ICourse create(String name){
        if("java".equals(name)){
            return new JavaCourse();
        }
        return null;
    }
}

package delegate.simple;

public class EmployeeB implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("员工B擅长加密，已经开始工作！！！！" + command);
    }
}

package delegate.simple;

public class EmployeeA implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("员工A已经开始架构工作!!!!!!" + command);
    }
}

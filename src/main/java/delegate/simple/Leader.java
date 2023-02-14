package delegate.simple;

import java.util.Map;

public class Leader {
    private Map<String, IEmployee> map;

    public Leader() {
        map.put("加密", new EmployeeB());
        map.put("架构", new EmployeeA());
    }

    public void doing(String command) {
        map.get(command).doing(command);
    }

}

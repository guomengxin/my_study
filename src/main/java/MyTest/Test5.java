package MyTest;

import java.util.Calendar;

public class Test5 {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        int index = instance.get(Calendar.DAY_OF_YEAR);
        System.out.println(index);
    }
}

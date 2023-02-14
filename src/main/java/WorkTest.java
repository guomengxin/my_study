import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class WorkTest {

    public static void main(String[] args) {
        final int i = countA(10);
        System.out.println(i);
    }
    private static int countA(int k){
        if(k<2) return 0;
        else if(k==2 || k==3 ) return 1;
        else return countA(k-2)+countA(k-3);

    }

}

package MyTest;

import scala.Int;

import java.util.Arrays;
import java.util.HashMap;

public class Test3 {
    private static  HashMap<Integer, String> map;
    public static void main(String[] args) throws InterruptedException {
        String result = intToRoman(0);
        System.out.println(result);
    }
    public static String intToRoman(int num) {
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] reps={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuffer result = new StringBuffer();
        for(int i=0; i<13; i++){
            while(num>=values[i]){
                num = num-values[i];
                result.append(reps[i]);
            }
        }
        return result.toString();
    }


}

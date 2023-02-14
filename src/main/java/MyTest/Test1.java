package MyTest;

import org.springframework.util.StringUtils;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args){
        int i = myAtoi("words and 987");
        System.out.println(i);
    }
    public static int myAtoi(String s) {
        if(s==null){return 0;}
        s = s.trim();
        if("".equals(s)){return 0;}
        char[] chars = s.toCharArray();
        int length = chars.length;
        boolean isMinus = false;
        int i=0;
        if(chars[0] == '-'){
            isMinus = true;
            i=1;
        }else if(chars[0] == '+'){
            i=1;
        }
        //0是否可以当做有效数
        boolean isValidZero = false;
        StringBuffer numbers = new StringBuffer();
        for (i=i; i < length; i++) {
            char aChar = chars[i];
            if(!Character.isDigit(aChar)){//当不是数字的时候直接结束
                i = length;
            }else if(aChar=='0' && isValidZero){//当一个有效的0
                numbers.append(aChar);
            }else if(Character.isDigit(aChar) && aChar !='0'){//非0
                numbers.append(aChar);
                isValidZero = true;
            }else if(i==length-1){
                i = length;
            }
        }
        int number = 0;
        boolean isBig = false;
        String result = numbers.toString();
        if(numbers.length()>0 && result.length()<=10){
            if(result.length()==10){
                long l = Long.parseLong(result);
                if(!((l<=2147483648L && isMinus) || (!isMinus && l<=2147483647L))){
                    isBig = true;
                }
            }
            if(isMinus){
                numbers.insert(0,'-');
            }
        }else if(result.length()>10){
            isBig = true;
        }else {
            return 0;
        }
        if(isBig){
            number = isMinus?-2147483648:2147483647;
        }else{
            number = Integer.parseInt(numbers.toString());
        }
        return number;
    }
}

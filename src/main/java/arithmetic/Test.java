package arithmetic;

import javax.validation.constraints.Max;

public class Test {
    public static void main(String[] args) {
        int i=0;
        try{
            i = Integer.parseInt(args[0]);
            System.out.println(i);
        }catch (Exception e){

        }
        switch (i){

            case 0:
                System.out.println("0");
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");break;
            case 4:
                System.out.println("4");
            default:
                System.out.println("default");
        }
    }


}



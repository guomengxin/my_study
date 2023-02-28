package qiao;

public class ThreeNumSortTest {
    public static void main(String[] args) {

        String[] args1 = {"10","20","30"};
        int x = Integer.parseInt(args1[0]);
        int y = Integer.parseInt(args1[1]);
        int z = Integer.parseInt(args1[2]);
        int result=0;
        System.out.println("原始数据：：：："+x+" "+y+" "+z);

        if(x < y){
            //  result = 10
            result= x;
            // x = 20
            x=y;
            // y = 10
            y= result;
        }

        System.out.println(x+" "+y+" "+z);

        if (y < z){
            // result = 10
            result= y;
            // y=30
            y = z;
            // z=30
            z= result;
        }
        System.out.println(x+" "+y+" "+z);

        if (x < y){
            // result =
            result= x;
            // x =
            x = y;
            // y =
            y= result;
        }

        System.out.println(x+" "+y+" "+z);

    }
}

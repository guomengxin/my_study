package qiao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class AmazingSequence {

    public static void main(String[] args) {
        //int n = 20;
        //26阶
        //int[] sequence={0,1,33,83,104,110,124,163,185,200,203,249,251,258,314,318,343,356,386,430,440,456,464,475,487,492};
        //4阶
        //int [] sequence = {0 ,1 ,4 ,6};
        //10阶
        //int [] sequence = {0 ,1 ,6 ,10 ,23 ,26 ,34 ,41 ,53 ,55};
        //15阶
        //int [] sequence = {0 ,4 ,20 ,30 ,57 ,59 ,76 ,62 ,100 ,111 ,123 ,136 ,144 ,145 ,151};
        //int [] sequence = {0 ,1 ,8 ,11 ,68 ,77 ,94 ,116 ,121 ,156 ,158 ,179 ,194 ,208 ,212 ,228 ,240 ,253 ,259 ,283 ,290};

        Scanner scanner=new Scanner(System.in);
        int n =scanner.nextInt();
        String sequenceStr =  scanner.next();
        String[] sequenceStrArr = sequenceStr.split(" ");
        int [] sequence =  new int[sequenceStrArr.length];
        for (int i = 0; i<sequenceStrArr.length; i++){
            sequence[i] = Integer.parseInt(sequenceStrArr[i]);
        }
        amazingSequence(n,sequence);
    }

    public static void amazingSequence(int n , int[] sequence ){

        if(n<0){
            System.out.println("Error in input");
            return;
        }
        if(sequence.length != n){
            System.out.println("Invalid input");
            return;
        }
        for(int i=1; i<sequence.length; i++){
            if(sequence[i-1]<0 ||  sequence[i]<0){
                System.out.println("Invalid input");
                return;
            }
            if(sequence[i-1]>=sequence[i]){
                System.out.println("Invalid input");
                return;
            }
        }
        List<Integer> integerList=new ArrayList<>();
        for (int i = 0; i <sequence.length ; i++) {
            for (int j = 0; j < sequence.length; j++) {
                if(i == j){continue;}
                int difference=Math.abs (sequence[j]-sequence[i]);
                if(!integerList.contains(difference)){
                    integerList.add(difference);
                }
            }
        }

        if(n*(n-1)/2 == integerList.size()){
            System.out.println("It is an Amazing Sequence");
        }else{
            System.out.println("It is an ordinary sequence");
        }
    }
}

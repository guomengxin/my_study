package MyTest;

import org.apache.activemq.store.kahadb.disk.index.ListNode;

import java.sql.SQLOutput;
import java.util.*;

public class Test2 {
   private static LinkedList<String> list = new LinkedList<>();
   private static HashMap<String, Integer> map = new HashMap<>();
   private static int size;
    public static void main(String[] args) {
        int[][] operators = {{1,1,1},{1,2,2},{1,3,2},{2,1},{1,4,4},{2,2}};
        int k = 3;
        LRU(operators,k);
    }
    public static int[] LRU (int[][] operators, int k) {
        size = k;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < operators.length; i++) {
            int[] operator = operators[i];
            int handle = operator[0];
            if(handle==1){
                set(String.valueOf(operator[1]),operator[2]);
            }else{
                int value = get(String.valueOf(operator[1]));
                result.add(value);
            }
        }
        int[] arr =  new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static void set(String key,int value){//直接放到链表第一位
        if(map.containsKey(key)){//存在
            map.put(key,value);
            list.remove(String.valueOf(key));
        }else{//不存在
            map.put(key,value);
            if(list.size()>=size){//已满
                map.remove(list.getLast());
                list.removeLast();
            }
        }
        list.addFirst(key);
    }
    public static int get(String key){
        int result = -1;
        if(map.containsKey(key)){//存在
            result = map.get(key);
            list.remove(key);
            list.addFirst(key);
        }
        return result;
    }


}

package arithmetic;

public class IsClip {
    public static void main(String[] args) {
        boolean test = test(121);
        System.out.println(test);
    }
    private static boolean test(int x){
        String s = String.valueOf(x);
        String[] sArr = s.split("");
        int length = sArr.length;
        int index = length%2>0 ? (length-1)/2:length/2;
        for(int i=0;i<index;i++){
            int startIndex = i;
            int endIndex = length-1-i;
            String startContent = sArr[startIndex];
            String endContent = sArr[endIndex];
            if(!startContent.equals(endContent)){
                return false;
            }
        }
        return true;
    }
}

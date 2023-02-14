package arithmetic;

import java.util.Random;

public abstract class Test3 {
    private String aaa = "";

    public static void main(String[] args) {
        Random random = new Random();
        int s = random.nextInt(10) % 6 + 5;
        System.out.println(s);
        aaa();
    }

    static {
        aaa();
    }

    private static void aaa() {
        System.out.println("11111");
    }
}

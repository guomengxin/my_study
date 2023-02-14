package test;

import java.security.MessageDigest;

public class MD5Test {
    public static void main(String[] args) throws Exception {
        String secretKey = "96f30693a08a72547052cc26d9145161";
        String orgIds = "159";
        String requestTime = "1616482848";
        String pageIndex = "1";
        String pageSize = "10";
        String combParam = String.format("orgIds=%spageIndex=%spageSize=%srequestTime=%ssecretKey=%s", orgIds, pageIndex, pageSize, requestTime, secretKey);
        System.out.println(combParam);
        String sign = MD51(combParam);
        System.out.println(sign);
    }


    private static String MD51(String s) throws Exception {
        char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F'};
        byte[] btInput = s.getBytes("utf-8");
        // 获得 MD5 摘要算法的 MessageDigest 对象
        MessageDigest mdInst = MessageDigest.getInstance("MD5");
        // 使用指定的字节更新摘要
        mdInst.update(btInput);
        // 获得密文
        byte[] md = mdInst.digest();
        // 把密文转换成十六进制的字符串形式
        int j = md.length;
        char str[] = new char[j * 2];
        int k = 0;
        for (int i = 0; i < j; i++) {
            byte byte0 = md[i];
            str[k++] = hexDigits[byte0 >>> 4 & 0xf];
            str[k++] = hexDigits[byte0 & 0xf];
        }
        return new String(str);
    }
}

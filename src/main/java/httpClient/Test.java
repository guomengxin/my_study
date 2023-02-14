package httpClient;

import cn.hutool.json.JSONObject;

import java.io.UnsupportedEncodingException;

public class Test {
    public static void main(String[] args) {
        byte[] str = new byte[0];
        try {
            str = "支持你我".getBytes("gbk");
            String gbkStr = new String(str, "gbk");
            String utf8BytesFromGBKString = getUTF8BytesFromGBKString(gbkStr);
            System.out.println(utf8BytesFromGBKString);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static String getUTF8BytesFromGBKString(String gbkStr) {
        try {
            int n = gbkStr.length();
            byte[] utfBytes = new byte[3 * n];
            int k = 0;
            for (int i = 0; i < n; i++) {
                int m = gbkStr.charAt(i);
                if (m < 128 && m >= 0) {
                    utfBytes[k++] = (byte) m;
                    continue;
                }
                utfBytes[k++] = (byte) (0xe0 | (m >> 12));
                utfBytes[k++] = (byte) (0x80 | ((m >> 6) & 0x3f));
                utfBytes[k++] = (byte) (0x80 | (m & 0x3f));
            }
            if (k < utfBytes.length) {
                byte[] tmp = new byte[k];
                System.arraycopy(utfBytes, 0, tmp, 0, k);
                String tmpStr = null;

                tmpStr = new String(tmp, "UTF-8");

                return tmpStr;
            }
            String utf8Str = new String(utfBytes, "UTF-8");
            return utf8Str;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }
}

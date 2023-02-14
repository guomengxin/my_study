package test.https;


import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class Test {
    public static void main(String[] args) throws KeyManagementException, NoSuchAlgorithmException, IOException, MalformedURLException {

        StringBuffer UrlBuffer = new StringBuffer("https://210.12.168.168:8443/xf/service/alarm/receiveAlarmData?");
        UrlBuffer.append("token"+"="+URLEncoder.encode("879A271D13D129E9849ECC7718C7DC36","utf-8"));
        UrlBuffer.append("&createTimeStr"+"="+URLEncoder.encode("2021-2-3","utf-8"));
        UrlBuffer.append("&alarmNumber"+"="+URLEncoder.encode("001","utf-8"));
        UrlBuffer.append("&fireTypes"+"="+URLEncoder.encode("001","utf-8"));
        UrlBuffer.append("&alarmDescription"+"="+URLEncoder.encode("测试数据郭孟鑫001","utf-8"));
        UrlBuffer.append("&alarmStatus"+"="+URLEncoder.encode("0","utf-8"));
        UrlBuffer.append("&alarmPicture"+"="+URLEncoder.encode("测试数据001","utf-8"));
        UrlBuffer.append("&organizationname"+"="+URLEncoder.encode("测试数据123001","utf-8"));
        UrlBuffer.append("&organizationid"+"="+URLEncoder.encode("123001","utf-8"));
        UrlBuffer.append("&belongStreet"+"="+URLEncoder.encode("测试街道001","utf-8"));;
        SSLContext sc = createSslContext();
        HttpsURLConnection conn = (HttpsURLConnection) new URL(UrlBuffer.toString()).openConnection();
        conn.setSSLSocketFactory(sc.getSocketFactory());
        conn.setHostnameVerifier((s, sslSession) -> true);
        conn.setDoInput(true);
        conn.setDoOutput(true);
        conn.connect();
        StringBuilder result = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
            String line;
            while (null != (line = br.readLine())) {
                result.append(line).append("\n");
            }
        }
        conn.disconnect();
        System.out.printf(result.toString());
    }

    private static SSLContext createSslContext() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sc = SSLContext.getInstance("SSL");
        sc.init(null, new TrustManager[]{new X509TrustManager() {
            @Override
            public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
            }
            @Override
            public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
            }
            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        }}, new java.security.SecureRandom());
        return sc;
    }
}

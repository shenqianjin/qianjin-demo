package demo.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Test {

    public static void main(String[] args) throws IOException {
        /*final URL url = new URL("http://checkip.amazonaws.com");
        final HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        String ip;
        try (BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), StandardCharsets.UTF_8))) {
            while ((ip = in.readLine()) != null) {
                if (ip != null && ip.length() > 0) {
                    break;
                }
            }
        }
        System.out.println(ip);*/
        String url = "jdbc:mysql://qianjin-mysql.mysql.database.azure.com:3306/db_example?serverTimezone=UTC&useSSL=true&requireSSL=false";
        System.out.println(url.indexOf("qianjin-mysql"));
    }
}

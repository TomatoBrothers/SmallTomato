package com.smalltomato.utils;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author WangShiChong
 * @ Create Time: 2017/12/4/0004 0:04
 */

public class HttpUtil {
    public static String get(String url) {
        CloseableHttpClient httpClient = null;
        try {
            httpClient = HttpClients.createDefault();
            HttpGet httpget = new HttpGet(url);
            CloseableHttpResponse response = httpClient.execute(httpget);
            HttpEntity httpEntity = response.getEntity();
            return EntityUtils.toString(httpEntity, "GBK");
        } catch (Exception e) {
        } finally {
            if (null != httpClient) {
                try {
                    httpClient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String url = "http://quote.eastmoney.com/stock_list.html";
        String str = HttpUtil.get(url);
//        System.out.println(str);
//      <li><a target="_blank" href="http://quote.eastmoney.com/sh201000.html">R003(201000)</a></li>

        String regEx = ">[a-zA-Z0-9\\u4E00-\\u9FA5]*[()0-9]{8}<";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);


        System.out.println("开始匹配===============================");
        int a = 0;
        while (m.find()){
            a++;
            System.out.println(m.group());
        }
        System.out.println(a);
//            for (int i = 1; i <= m.groupCount(); i++) {
//                System.out.println(m.group(i));
//            }
        System.out.println("匹配结束===============================");
    }
}

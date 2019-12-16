package com.example.springboot.config;

import org.springframework.util.StringUtils;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: xuxufu
 * @Date: 19.3.13 10:54
 * @Description:
 */
public class Demo2 {
    public static void main(String[] args) {
        String string = "http://route.showapi.com/126-2?showapi_appid%3Dmyappid%26type%3D%26order%3D%26page%3D%26showapi_sign%3Dmysecret";
        /*String url = URLDecoder.decode(string);*/
        String url = "http://route.showapi.com/126-2?showapi_appid=myappid&type=1&order=2&page=3&showapi_sign=mysecret";
        //解析出 strPage strParam
        String strPage = "";
        String strParam = "";
        String[] split = url.split("[?]");
        if (split.length > 0) {
            strPage = split[0];
            System.out.println(strPage);
        }
        if (split.length > 1) {
            strParam = split[1];
            System.out.println(strParam);
        }
        //解析参数，放入dao map 中
        HashMap<String, String> map = new HashMap<>();
        String[] arrParam = strParam.split("[&]");
        for (String s : arrParam) {
            if (!StringUtils.isEmpty(s)) {
                String[] keyVal = s.split("[=]");
                if (keyVal.length > 1) {
                    map.put(keyVal[0], keyVal[1]);
                }
            }
        }
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("参数中的key:value："+key+"====>"+value);

        }
    }
}

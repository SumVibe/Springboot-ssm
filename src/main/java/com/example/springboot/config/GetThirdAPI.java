package com.example.springboot.config;

import com.example.springboot.domain.Params;

import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @Author: xuxufu
 * @Date: 19.3.13 17:38
 * @Description: public static void main (string [] args)
 *  private String showapi_appid;
 */
public class GetThirdAPI {
    public static void main(String[] args) {
        Params params = new Params();
        params.setShowapi_appid("89289");
        params.setNum("16601168621");
        params.setShowapi_sign("fa92af8da16a4a6ba31957ef899a66ab");
        //拼接需要发送的url字符串
        StringBuilder sb = new StringBuilder();
        sb.append("showapi_appid=").append(params.getShowapi_appid()).append("&");
        sb.append("num=").append(params.getNum()).append("&");
        sb.append("showapi_sign=").append(params.getShowapi_sign());
        String str = sb.toString();
        String encode = URLEncoder.encode(str);
        String url = "http://route.showapi.com/6-1?"+encode;
        System.out.println(url);
    }
}

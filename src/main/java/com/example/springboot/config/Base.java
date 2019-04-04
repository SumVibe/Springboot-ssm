package com.example.springboot.config;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.springboot.domain.Params;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.util.JSONPObject;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.util.*;

/**
 * @Author: xuxufu
 * @Date: 19.2.25 16:24
 * @Description:
 */

public class Base {
    public static void main(String [] path) throws Exception {

        JSONArray o = new JSONArray();
        o.add("[{a=b},{c=d}]");
        Object o1 = o.get(0);
        JSONObject json = new JSONObject();
        json.put("1", o1);
        System.out.println(json);
    }
}

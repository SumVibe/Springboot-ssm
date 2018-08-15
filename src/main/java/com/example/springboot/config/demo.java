package com.example.springboot.config;

import java.util.HashMap;

/**
 * @Author: xuxufu
 * @Date: 18.8.10 10:32
 * @Description:
 */
public class demo {
    public static void main(String[] args) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put(1, 4);
        objectObjectHashMap.put(2, 4);
        objectObjectHashMap.put(3, 4);
        objectObjectHashMap.put(4, 4);
        objectObjectHashMap.put(13, 4);
        for (Object o : objectObjectHashMap.keySet()) {
            System.out.println(o);
            
        }
    }
}

package com.example.springboot.config;

/**
 * @Author: xuxufu
 * @Date: 19.3.14 20:59
 * @Description:
 */
public class Java {
    public static void main(String[] args) {
        String str = "15448_mkmmk_nnjnjn/_";
        String string = StringUtil.underlineToCamel(str);
        System.out.println(string);
    }
}

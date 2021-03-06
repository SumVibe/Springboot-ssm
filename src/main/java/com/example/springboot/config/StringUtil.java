package com.example.springboot.config;

/**
 * @ClassName: StringUtil
 * @Description:
 * @Author: xuxufu
 * @Date: 19.3.25 15:13
 * @Version: 1.0
 */
public class StringUtil {
    private static final char UNDERLINE='_';
    /**
     * 下划线 转 驼峰
     * @param param
     * @return
     */
    public static String underlineToCamel(String param){
        if (param==null||"".equals(param.trim())){
            return "";
        }
        int len=param.length();
        StringBuilder sb=new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            char c = Character.toLowerCase(param.charAt(i));
            if (c == UNDERLINE){
                if (++i<len){
                    sb.append(Character.toUpperCase(param.charAt(i)));
                }
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

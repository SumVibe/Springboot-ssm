package com.example.springboot.config;

import java.util.*;


/**
 * @Author: xuxufu
 * @Date: 19.3.2 15:49
 * @Description:
 */
public class Demo1 {
    public static void main(String[] args) {
        //hashmap 的四种遍历方式
        HashMap<Object, Object> map = new HashMap<>();
        Hashtable<Object, Object> table = new Hashtable<>();
        table.put("1", "周杰伦");
        map.put(1, "11111");
        map.put(2, "22222");
        map.put(3, "33333");
        map.put(4, "44444");
        map.put(5, "55555");
        map.put(6, "66666");
        /*System.out.println(table.contains("周杰伦"));
        System.out.println(table.containsValue("周杰伦"));
        System.out.println(map.containsKey(3));
        //1. 获取到keyset集合遍历key的集合得到value
        Set<Object> keys = map.keySet();
        for (Object key : keys) {
            System.out.println("第1种："+key);  //key
            System.out.println("第1种："+map.get(key));//value
        }
        //2. 使用迭代器方式依次获取每个key，通过key获取value
        Iterator<Object> iter = map.keySet().iterator();
        while (iter.hasNext()) {
            Object key = iter.next();
            System.out.println("第2种："+key);
            System.out.println("第2种："+map.get(key));
        //3. 获取到entry数组集合，来遍历得到每一个entry数组，进而得到每个key和value
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            System.out.println("第3种："+entry.getKey());
            System.out.println("第3种："+entry.getValue());
        }
        //4. 使用迭代器的方式依次得到每一个entry数组，进而得到每个key和value
        Iterator<Map.Entry<Object, Object>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Object, Object> entry = iterator.next();
            System.out.println("第4种："+entry.getKey());
            System.out.println("第4种："+entry.getValue());
        }*/
        Collection<Object> values = map.values();
        for (Object value : values) {
            System.out.println(value);
        }
        map.clear();
    }
}

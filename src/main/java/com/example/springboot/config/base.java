package com.example.springboot.config;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Author: xuxufu
 * @Date: 19.2.25 16:24
 * @Description:
 */
public class base {
    public static void main(String[] args) {
        ArrayList<Object> list1 = new ArrayList<>();
        LinkedList<Object> list2= new LinkedList<>();
        //获取当前时间的毫秒值
        long l = System.currentTimeMillis();
        for (int i = 0; i <10000000 ; i++) {
            list1.add(i);
        }
        long l1 = System.currentTimeMillis();
        //添加完数据的时间差值
        long l2 = l1-l;
        //当前的系统时间差值
        long l3 = System.currentTimeMillis();
        for (int j = 0; j < 10000000; j++) {
            list2.add(j);
        }
        long l4 = System.currentTimeMillis()-l3;
        System.out.println("arrayList的大小为："+ list1.size());
        System.out.println("linkedList的大小为："+ list2.size());
        System.out.println("arrayList添加元素耗时为："+l2+"毫秒");
        System.out.println("linkedList添加元素耗时为："+l4+"毫秒");
    }
}

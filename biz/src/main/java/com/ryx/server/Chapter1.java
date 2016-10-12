package com.ryx.server;


import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by lenovo on 2016/10/12.
 */
public class Chapter1 {
    /**
     * 在一个字符串中找到第一个只出现一次的字符。如输入abaccdeff，则输出b
     */
    @Test
    public void test1(){
        Character[] chars = {'a','b','b','a','c','c','d','e','f','f'};//212112
        Map<Character,Integer> map = new TreeMap<>();
        for (int i=0;i<chars.length;i++){
            Integer num = map.get(chars[i]);
            int temp =1;
            if (num!=null){
                temp = num+1;
            }
            map.put(chars[i],temp);
        }
        Iterator<Character> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            char c = iterator.next();
            int num = map.get(c);
            if (num ==1){
                System.out.println("find 第一个只出现一次的字符: "+c+" : "+num);
                break;
            }
//            System.out.println(map.get(c));
        }
    }
}

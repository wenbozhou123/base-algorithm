package com.algrithm.sort;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Test {

    public static void main(String[] args){
        String str1="aa";
        String str2="aa";
        String str3="aa";
        System.out.println(str1==str2);


        LinkedBlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<String>();
        ConcurrentLinkedQueue<String> concurrentLinkedQueue = new ConcurrentLinkedQueue<String>();
        Map<String,String> map = new HashMap<String, String>();
        Map<String,String> linkedMap = new LinkedHashMap<String, String>();
    }
}

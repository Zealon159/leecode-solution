package cn.zealon.linkedlist;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @auther: Zealon
 * @Date: 2018-11-05 09:24
 */
public class LRU {

    // 缓存容器
    private LinkedHashMap<String,Object> contains = new LinkedHashMap<>(10);
    // 容量
    private static int capacity = 10;

    public static void main(String[] args){
        Vector vector = new Vector();
        vector.add("");
        vector.size();
        vector.get(0);
        HashMap<String,Object>  hashMap = new HashMap<>();
        hashMap.put(null,"");

        ConcurrentHashMap<String,Object> concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("","");

        HashSet b = new HashSet();
        b.add(null);
    }

}

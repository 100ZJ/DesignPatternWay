package com.heu.java8.others;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    //算法三：map计数，时间复杂度O(n)，空间复杂度O(n)，空间换时间
    public static ArrayList<Integer> getIntersection3(int[] arr, int[] arr2) {

        ArrayList<Integer> res = new ArrayList<Integer>();
        if(arr == null || arr.length == 0 || arr2 == null || arr2.length == 0) {
            return res;
        }

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0;i < arr.length;i ++) {
            int key = arr[i];
            if(map.containsKey(key)) {
                int value = map.get(key);
//                value ++;
                map.put(key, value);
            }
            else {
                map.put(key, 1);
            }
        }
        for(int i = 0;i < arr2.length;i ++) {
            int key = arr2[i];
            if(map.containsKey(key) && !res.contains(key)) {
                res.add(key);
            }
        }
        return res;

    }


    public static char find(char[] chars1, char[] chars2) {
        char res = '#';
        if(chars1 == null || chars1.length == 0 || chars2 == null || chars2.length == 0) {
            return res;
        }

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0;i < chars2.length;i ++) {
            char key = chars2[i];
            if(map.containsKey(key)) {
                int value = map.get(key);
                map.put(key, value);
            }
            else {
                map.put(key, 1);
            }
        }
        for(int i = 0;i < chars1.length;i ++) {
            char key = chars1[i];
            if(!map.containsKey(key)) {
                res = key;
            }
        }
        return res;
    }

    /**
     * 订单主表：商品id userid 订单号  price restPrice  status
     * 砍价详情表：商品id  订单号 砍价请求号  openid price restPrice status
     */
    public BargainResponseDTO bargain(BargainRequestDTO requestDTO) {

        //1、请求参数非空性校验 商品id 订单号  砍价请求号  用户openid  price

        //2、分布式锁锁住 requestId + openId

        //3、根据订单号查询订单的砍价状态,如果不为已砍价进行如下操作

        //4、请求添加到 redis缓存 set数据结构 sadd good openid1 openid2...openid10,
        //set结构保证添加的元素唯一无序，保证同一个人只能砍价一次

        //5、根据请求的商品价格(例如：10)做循环条件，循环从redis中获取set集合

        //6、遍历集合, 根据 订单号 + openid查询砍价详情表，看status是否为已经砍价，如果不是查询订单主表剩余价格 价格大于0
        // 新纪录的restPrice = 原纪录的restPrice - 1; 订单主表剩余价格-1

        //7、当主表剩余价格为0的时候，停止砍价  redis缓存删除

        //8、返回 code、message、订单号 、price、restPrice

        return null;
    }


    public static void main(String[] args) {

        int[] arr = {1,2,5,3,3,4};
        int[] arr2 = {1,2,3,3,4,5,6};
        List<Integer> res = Test.getIntersection3(arr, arr2);
        System.out.println(res);
    }

}

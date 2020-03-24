package com.heu.java8.others;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    //�㷨����map������ʱ�临�Ӷ�O(n)���ռ临�Ӷ�O(n)���ռ任ʱ��
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
     * ����������Ʒid userid ������  price restPrice  status
     * �����������Ʒid  ������ ���������  openid price restPrice status
     */
    public BargainResponseDTO bargain(BargainRequestDTO requestDTO) {

        //1����������ǿ���У�� ��Ʒid ������  ���������  �û�openid  price

        //2���ֲ�ʽ����ס requestId + openId

        //3�����ݶ����Ų�ѯ�����Ŀ���״̬,�����Ϊ�ѿ��۽������²���

        //4��������ӵ� redis���� set���ݽṹ sadd good openid1 openid2...openid10,
        //set�ṹ��֤��ӵ�Ԫ��Ψһ���򣬱�֤ͬһ����ֻ�ܿ���һ��

        //5�������������Ʒ�۸�(���磺10)��ѭ��������ѭ����redis�л�ȡset����

        //6����������, ���� ������ + openid��ѯ�����������status�Ƿ�Ϊ�Ѿ����ۣ�������ǲ�ѯ��������ʣ��۸� �۸����0
        // �¼�¼��restPrice = ԭ��¼��restPrice - 1; ��������ʣ��۸�-1

        //7��������ʣ��۸�Ϊ0��ʱ��ֹͣ����  redis����ɾ��

        //8������ code��message�������� ��price��restPrice

        return null;
    }


    public static void main(String[] args) {

        int[] arr = {1,2,5,3,3,4};
        int[] arr2 = {1,2,3,3,4,5,6};
        List<Integer> res = Test.getIntersection3(arr, arr2);
        System.out.println(res);
    }

}

package com.array.questions;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachString {
    public static void main(String[] args){

        String[] arr = {"apple", "banana", "apple", "orange", "banana", "apple"};

        Map<String, Integer> map = new HashMap<>();
        int count =1;
        for(int i=0; i<arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],count);
            }else {
                map.put(arr[i], map.get(arr[i])+1);
            }
        }

        for (Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}

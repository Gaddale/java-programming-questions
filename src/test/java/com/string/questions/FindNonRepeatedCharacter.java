package com.string.questions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindNonRepeatedCharacter {
    public static void main(String[] args){
        String str="laptop";
        int count = 1;
        Map<Character, Integer> map = new LinkedHashMap<>();

        for(int i = 0; i < str.length(); i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), count);
            }else {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }

        for(Map.Entry<Character, Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println("The first non repeated character is: " + entry.getKey());
                break;
            }
        }

    }
}
